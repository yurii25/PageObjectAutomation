package tests;

import base.BasePage;
import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AddProductToCart;
import pageObjects.GetProductNameFromCart;


public class VerifyAddingProductToCart extends BaseTest {

    @Test
    public void VerifyAddingProductToCartTest(){

        AddProductToCart addProductToCart = new AddProductToCart(getDriver());
        GetProductNameFromCart name = new GetProductNameFromCart(getDriver());

        getDriver().get("https://shop.demoqa.com/");

        addProductToCart.clickOnTheProduct();

        addProductToCart.selectColor();
        addProductToCart.selectSize();

        addProductToCart.addToCart();
        addProductToCart.goToCart();
        addProductToCart.goToCart();


        String actualProductName = name.productName();
        String expectedProductName = "PINK DROP SHOULDER OVERSIZED T SHIRT - PINK";

//        System.out.println("Actual result: " + actualProductName);
//        System.out.println("Expected result: " + expectedProductName);

        Assert.assertEquals(actualProductName, expectedProductName);
    }
}
