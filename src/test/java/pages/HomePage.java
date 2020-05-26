package pages;

import org.openqa.selenium.WebDriver;
import stepDefinitions.Hooks;
import utilities.FileReader;

public class HomePage {

    WebDriver driver;

    public HomePage(){
        this.driver=Hooks.driver;
    }


    public void openUrl(){
        String url = FileReader.getInstance().getConfigReader().getApplicationUrl();
        driver.get(url);
    }
}
