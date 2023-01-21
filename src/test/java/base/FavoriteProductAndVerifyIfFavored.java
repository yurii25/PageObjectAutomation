package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.BasePage;

import java.time.Duration;

public class FavoriteProductAndVerifyIfFavored extends BasePage {

    public FavoriteProductAndVerifyIfFavored(WebDriver driver) {
        super(driver);
    }

    @Test
    public void FavoriteProductAndReviewIfFavoredTest(){
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://shop.demoqa.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1700)");


        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(By.cssSelector("[href*='tokyo-talkies'] [class='second-img']") );
        actions.moveToElement(target).perform();


        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[data-product-id='704']")));
        driver.findElement(By.cssSelector("a[data-product-id='704']")).click();


        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='yith-wcwl-message']")));


        driver.findElement(By.cssSelector("[href='https://shop.demoqa.com/wishlist/']")).click();


        js.executeScript("window.scrollBy(0,500)");


        String expectedProductName = "TOKYO TALKIES";
        String actualProductName = driver
                .findElement(By.xpath("//a[normalize-space()='Tokyo Talkies']"))
                .getText();


        System.out.println("Actual result: " + actualProductName);
        System.out.println("Expected result: " + expectedProductName);

        Assert.assertEquals(actualProductName, expectedProductName);
    }
// 2

//    @Test
//    public void FavoriteProductAndReviewIfFavoredTest100(){
//
//        goToHomePage();
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,1700)");
//
//
//        moveMouseOverTheElement(By.cssSelector("[href*='tokyo-talkies'] [class='second-img']"));
//
//
//        isElementDisplayed(By.cssSelector("a[data-product-id='704']"));
//        clickByLocator(By.cssSelector("a[data-product-id='704']"));
//
//
//
//        isElementDisplayed(By.cssSelector("[id='yith-wcwl-message']"));
//
//
//
//        clickByLocator(By.cssSelector("[href='https://shop.demoqa.com/wishlist/']"));
//
//
//        js.executeScript("window.scrollBy(0,500)");
//
//
//        String expectedProductName = "TOKYO TALKIES";
//        String actualProductName = getText(By.xpath("//a[normalize-space()='Tokyo Talkies']"));
//
//
//        System.out.println("Actual result: " + actualProductName);
//        System.out.println("Expected result: " + expectedProductName);
//
//        Assert.assertEquals(actualProductName, expectedProductName);
//    }
}