package pageObjects;

import base.BasePage;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetProductNameFromWishlist extends BasePage {

    private final By wishlist = By.cssSelector("[href='https://shop.demoqa.com/wishlist/']");
    private final By productNameInWishlist = By.xpath("//a[normalize-space()='Tokyo Talkies']");

    public GetProductNameFromWishlist(WebDriver driver) {
        super(driver);
    }

    @Description("Get product name in Wishlist")
    public String productName() {

        clickByLocator(wishlist);

        return getText(productNameInWishlist);
    }
}
