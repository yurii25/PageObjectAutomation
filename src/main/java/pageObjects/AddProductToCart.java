package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddProductToCart extends BasePage {

    private final By product = By.xpath("//h3/a[contains(@href, 'pink-drop')]");
    private final By colorId = By.id("pa_color");
    private final String colorValue = "pink";
    private final By sizeId = By.id("pa_size");
    private final String sizeValue = "37";
    private final By addToCart = By.xpath("//button[@type='submit'] [(contains (@class,'cart'))]");
    private final By cart = By.cssSelector("span[class='cart-item has-items']"); //   By.ByCssSelector("span[class='cart-item has-items']")


    public AddProductToCart(WebDriver driver) {
        super(driver);
    }

    public void clickOnTheProduct(){
        clickByLocator(product);
    }

    public void selectColor(){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(colorId));
        selectDropdownOption(colorId, colorValue);
    }

    public void selectSize(){
        selectDropdownOption(sizeId, sizeValue);
    }

    public void addToCart(){
        clickByLocator(addToCart);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }

    public void goToCart(){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(cart));
        clickByLocator(cart);
    }

}
