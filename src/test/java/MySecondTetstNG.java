
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MySecondTetstNG {

    WebDriver driver;

    @BeforeTest
    public void prepare() throws InterruptedException {
         driver= new ChromeDriver();
         Thread.sleep(2000);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void openTheBrowser() throws InterruptedException {
        System.out.println("hello test!");
        driver.navigate().to("https://www.twitter.com/");
        Thread.sleep(3000);

    }

    @Test
    public void signUp(){
        System.out.println("sign up");
    }

    @Test
    public void login(){
        System.out.println("login");
    }

    @Test
    public void addToCart(){
        System.out.println("adding to the cart");
    }

    @Test
    public void logout(){
        System.out.println("logging out");
    }

    @Test
    public void closeBrowser(){
        System.out.println("close the browser");
    }
}
