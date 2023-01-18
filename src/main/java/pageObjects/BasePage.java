package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }



    public WebElement getWebElement(By locator){
        return driver.findElement(locator);
    }

    public void clickByLocator(By locator){
        getWebElement(locator).click();
    }





    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }


}
