package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetProductNameFromCart extends BasePage {

    public GetProductNameFromCart(WebDriver driver) {
        super(driver);
    }

    public String productName() {

        clickByLocator(By.cssSelector("span[class='cart-item has-items']"));

        return getText(By.xpath("//td[@class='product-name']/a[text()='pink drop shoulder oversized t shirt - Pink']"));
    }
}
