package tests;

import base.BasePage;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.GetProductNameFromCart;


public class VerifyAddingProductToCart extends BaseTest {

    @Test
    public void VerifyAddingProductToCartTest(){
        BasePage basePage = new BasePage(getDriver());
        GetProductNameFromCart name = new GetProductNameFromCart(getDriver());

        basePage.goToHomePage();

        basePage.clickByLocator(By.xpath("//h3/a[contains(@href, 'pink-drop')]"));


        basePage.selectDropdownOption(By.id("pa_color"), "pink");

        basePage.selectDropdownOption(By.id("pa_size"), "37");

        basePage.clickByLocator(By.xpath("//button[@type='submit'] [(contains (@class,'cart'))]"));

        basePage.clickByLocator(new By.ByCssSelector("span[class='cart-item has-items']"));


        String actualProductName = name.productName();
        String expectedProductName = "PINK DROP SHOULDER OVERSIZED T SHIRT - PINK";

//        System.out.println("Actual result: " + actualProductName);
//        System.out.println("Expected result: " + expectedProductName);

        Assert.assertEquals(actualProductName, expectedProductName);
    }
}
