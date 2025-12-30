package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private  WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

// Click a link that the constructor fonds matching the link text
    private void clickLink (String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
}
