package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddToWishlist extends BasePage {

    public AddToWishlist(WebDriver driver) {
        super(driver);
    }

    public void likeTheProduct() {
        moveMouseOverTheElement(By.cssSelector("[href*='tokyo-talkies'] [class='second-img']"));

        isElementDisplayed(By.cssSelector("a[data-product-id='704']"));
        clickByLocator(By.cssSelector("a[data-product-id='704']"));

        isElementDisplayed(By.cssSelector("[id='yith-wcwl-message']"));

    }



}
