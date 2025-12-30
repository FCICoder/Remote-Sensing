package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager (WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack(){
        navigate.back();
    }

    public void goForword(){
    navigate.forward();
    }

    public void goToURL(String url){
        navigate.to(url);
    }

    public void refresh(){navigate.refresh();}

    public void switchTab(String title){
        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles.size());

        for (String windowHandle : windowHandles){
            System.out.println(windowHandle);
            driver.switchTo().window(windowHandle);
                if(title.equals(driver.getTitle())){
                    break;
                }
        }

    }
}
