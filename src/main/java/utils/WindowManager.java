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
// going back method
    public void goBack(){
        navigate.back();
    }
// going forword method
    public void goForword(){
    navigate.forward();
    }
// go to a specific URL
    public void goToURL(String url){
        navigate.to(url);
    }

// Refresh Method
    public void refresh(){navigate.refresh();}

// Switching method
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
