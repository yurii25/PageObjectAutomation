package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavoriteAndVerifyPageObjects extends BasePage {

    public FavoriteAndVerifyPageObjects(WebDriver driver) {
        super(driver);
    }

    public FavoriteAndVerifyPageObjects(WebDriver driver,By locator) {
        super(driver);
        getWebElement(locator);
    }

    @Override
    public void clickByLocator(By locator) {
        super.clickByLocator(locator);
    }

    private String ElementText;

    public String getElementText(By locator){
       return driver.findElement(locator).getText();
    }
}
