package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHomePage(){
        driver.get("https://shop.demoqa.com/");
    }

    public WebElement getWebElement(By locator){
        return driver.findElement(locator);
    }

    public void clickByLocator(By locator){
        getWebElement(locator).click();
    }

    public void waitTextToBePresentInElement(By locator, String text){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(3));
        webDriverWait.until(ExpectedConditions.textToBePresentInElementLocated(locator,
                text));
    }

    public boolean isElementDisplayed(By locator){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return getWebElement(locator).isDisplayed();
    }

    public void moveMouseOverTheElement(By locator){
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(locator);
        actions.moveToElement(target).perform();
    }




    public String getText(By locator){
        return driver.findElement(locator).getText();
    }



}
