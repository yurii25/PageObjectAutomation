package tests;

import base.BasePage;
import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AddToWishlist;
import pageObjects.GetProductNameFromWishlist;

public class FavoriteProductAndVerifyIfFavored extends BaseTest {


    @Test
    public void FavoriteProductAndVerifyIfFavoredTest(){

        allureLog("Favoring the product and verifying if it is displayed on the wishlist page");

        AddToWishlist addToWishlist = new AddToWishlist(getDriver());
        GetProductNameFromWishlist name = new GetProductNameFromWishlist(getDriver());

        getDriver().get("https://shop.demoqa.com/");


        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,1700)");


        addToWishlist.likeTheProduct();


        String actualProductName = name.productName();
        String expectedProductName = "TOKYO TALKIES";

//        System.out.println("Actual result: " + actualProductName);
//        System.out.println("Expected result: " + expectedProductName);

        Assert.assertEquals(actualProductName, expectedProductName);
    }

}


