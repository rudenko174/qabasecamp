import org.junit.*;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CalculatorTest {

    private static WebDriver driver;
    private static WebDriverWait wait;


    @BeforeClass
    public static void start() throws MalformedURLException {
        //ChromeDriverManager.getInstance().setup();
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("app", "D:\\Calculator.exe");
        driver = new RemoteWebDriver(new URL("http://localhost:9999"), cap);
        wait = new WebDriverWait(driver, 35);
    }

    @Before
    public void cleanup()
    {

        //driver.get("file:///C:/Users/Dima/Desktop/Training_center/Auto/calc.html");

        //driver.findElement(By.name("C")).click();
    }


    @Test
    public void add_test()
    {
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("1")));
        driver.findElement(By.name("5")).click();
        driver.findElement(By.name("5")).click();
        driver.findElement(By.name("5")).click();
        driver.findElement(By.name("+")).click();
        driver.findElement(By.name("5")).click();
        driver.findElement(By.name("=")).click();
        Assert.assertEquals("560", driver.findElement(By.id("1000")).getText());
    }


    @After
    public void stop()
    {
        //driver.quit();
    }

}
