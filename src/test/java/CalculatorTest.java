import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CalculatorTest {

    private static WebDriver driver;


    @BeforeClass
    public static void start()
    {
        //ChromeDriverManager.getInstance().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("file:///C:/Users/Dima/Desktop/Training_center/Auto/calc.html");
    }

    @Before
    public void cleanup()
    {
        driver.findElement(By.xpath("//input[@value='C']")).click();
    }


    @Test
    public void add_test()
    {
        driver.findElement(By.xpath("//input[@value='5']")).click();
        driver.findElement(By.xpath("//input[@value='+']")).click();
        driver.findElement(By.xpath("//input[@value='4']")).click();
        driver.findElement(By.xpath("//input[@value='=']")).click();
        Assert.assertEquals("9", driver.findElement(By.id("resultsbox")).getAttribute("value"));
    }


    @Test
    public void substract_test()
    {
    driver.findElement(By.xpath("//input[@value='7']")).click();
    driver.findElement(By.xpath("//input[@value='-']")).click();
    driver.findElement(By.xpath("//input[@value='1']")).click();
    driver.findElement(By.xpath("//input[@value='=']")).click();
    Assert.assertEquals("6", driver.findElement(By.id("resultsbox")).getAttribute("value"));
    }

    @Test
    public void divide_test()
    {
        driver.findElement(By.xpath("//input[@value='8']")).click();
        driver.findElement(By.xpath("//input[@value='/']")).click();
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.xpath("//input[@value='=']")).click();
        Assert.assertEquals("4", driver.findElement(By.id("resultsbox")).getAttribute("value"));
    }


    @Test
    public void multiply_test()
    {
        driver.findElement(By.xpath("//input[@value='7']")).click();
        driver.findElement(By.xpath("//input[@value='x']")).click();
        driver.findElement(By.xpath("//input[@value='3']")).click();
        driver.findElement(By.xpath("//input[@value='=']")).click();
        Assert.assertEquals("21", driver.findElement(By.id("resultsbox")).getAttribute("value"));
    }

    @After
    public void stop()
    {

    }

}
