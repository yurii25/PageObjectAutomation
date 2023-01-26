package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToWishlist extends BasePage {


    private final By productToMoveMouseOverOn = By.cssSelector("[href*='tokyo-talkies'] [class='second-img']");
    private final By heartIcon = By.cssSelector("a[data-product-id='704']");
    private final By productAddedToTheWishlistPop_up = By.cssSelector("[id='yith-wcwl-message']");


    public AddToWishlist(WebDriver driver) {
        super(driver);
    }

    public void likeTheProduct() {
        moveMouseOverTheElement(productToMoveMouseOverOn);

        isElementDisplayed(heartIcon);
        clickByLocator(heartIcon);

        isElementDisplayed(productAddedToTheWishlistPop_up);

    }



}
