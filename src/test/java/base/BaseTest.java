package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowManager;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    
// before each class execute this method that define the driver and the browser size
    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
// After each class quit the driver method
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
// before each method open the home link
    @BeforeMethod
    public void goHome() {
        driver.get("https://example.com/");
        homePage =new HomePage(driver);
    }
// handle the windowManger class (go forward, go back, Refresh,open a specific class, switching between tabs )
    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
}
