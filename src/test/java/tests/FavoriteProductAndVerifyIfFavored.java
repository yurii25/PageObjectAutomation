package tests;

import base.BasePage;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AddToWishlist;
import pageObjects.TheNameOfTheProductIsInTheWishlist;

public class FavoriteProductAndVerifyIfFavored extends BaseTest {


    @Test
    public void FavoriteProductAndVerifyIfFavoredTest(){

        AddToWishlist addToWishlist = new AddToWishlist(getDriver());
        BasePage basePage = new BasePage(getDriver());
        TheNameOfTheProductIsInTheWishlist name = new TheNameOfTheProductIsInTheWishlist(getDriver());

        getDriver();
        basePage.goToHomePage();

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,1700)");

        addToWishlist.likeTheProduct();

        ////////////////////////////

//
//        basePage.clickByLocator(By.cssSelector("[href='https://shop.demoqa.com/wishlist/']"));


//        js.executeScript("window.scrollBy(0,500)");

        String actualProductName = name.productName();
        String expectedProductName = "TOKYO TALKIES";



        System.out.println("Actual result: " + actualProductName);
        System.out.println("Expected result: " + expectedProductName);

        Assert.assertEquals(actualProductName, expectedProductName);
    }

}
