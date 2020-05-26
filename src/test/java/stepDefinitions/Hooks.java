package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.FileReader;


public class Hooks {

    public static WebDriver driver;
    private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

    @Before
    public void beforeTest(){
        setupWebdriver();

    }

    private void setupWebdriver() {
        System.setProperty(CHROME_DRIVER_PROPERTY, FileReader.getInstance().getConfigReader().getDriverPath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void afterTest(){
        driver.quit();
    }

}
