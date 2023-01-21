package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetProductNameFromWishlist extends BasePage {

    public GetProductNameFromWishlist(WebDriver driver) {
        super(driver);
    }

    public String productName() {

        clickByLocator(By.cssSelector("[href='https://shop.demoqa.com/wishlist/']"));

        return getText(By.xpath("//a[normalize-space()='Tokyo Talkies']"));
    }
}
