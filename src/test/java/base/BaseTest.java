package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {



    private WebDriver driver;


    @BeforeMethod
    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

//    @AfterMethod
//    public void closeDriver(){
//        driver.close();
//        driver.quit();
//    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

}
