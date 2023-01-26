package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetProductNameFromCart extends BasePage {

    private final By cart = By.cssSelector("span[class='cart-item has-items']");
    private final By productNameInCart = By.xpath("//td[@class='product-name']/a[text()=" +
            "'pink drop shoulder oversized t shirt - Pink']");


    public GetProductNameFromCart(WebDriver driver) {
        super(driver);
    }

    public String productName() {

        clickByLocator(cart);

        return getText(productNameInCart);
    }
}
