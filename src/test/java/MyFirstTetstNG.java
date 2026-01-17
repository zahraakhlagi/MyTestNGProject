
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirstTetstNG {

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

    @Test(priority = -2)
    public void openTheBrowser() throws InterruptedException {
        System.out.println("hello test!");
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(3000);

    }

    @Test(priority = 1)
    public void signUp(){
        System.out.println("sign up");
    }

    @Test(priority = 2)
    public void login(){
        System.out.println("login");
    }

    @Test(priority = 3)
    public void addToCart(){
        System.out.println("adding to the cart");
    }

    @Test(priority = 4)
    public void logout(){
        System.out.println("logging out");
    }


}
