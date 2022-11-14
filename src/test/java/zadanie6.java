import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class zadanie6 {

    private static   WebDriver driver;
    private  String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
private String urlBBC = " https://www.bbc.com.";
    @Before
    public void setUp(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testZadanie6(){
        driver.navigate().to(url);

        //driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
        //driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
        driver.findElement(By.tagName("button")).click();
        Assert.assertEquals("Dashboard",driver.findElement(By.tagName("h6")).getText());
        System.out.println("Udało się zalogować");
        //driver.close();

    }
    @Test
    public void testZadanie6_1() {
        driver.navigate().to(url);

        //driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
        //driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
        driver.findElement(By.tagName("button")).click();
        Assert.assertEquals("Dashboard", driver.findElement(By.tagName("h6")).getText());
        System.out.println("Udało się zalogować");
        //driver.close();
    }
    @Test
    public void zadanie8() throws InterruptedException {
        driver.navigate().to(urlBBC);
        Thread.sleep(1000);
        WebElement link = driver.findElement(By.tagName("a"));
        System.out.println(link.getText());
       List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("ilość linków na stronie = " + links.size());
         List<WebElement>  immages = driver.findElements(By.tagName("img"));
        System.out.println("ilość obrazków na stronie =  " + immages.size());

        System.out.println(immages.get(1).getText());


        int[] tablica ={1,2,3};
        System.out.println(tablica[1]);



    }

    @After
    public void tearDown(){
        driver.close();

    }

}

