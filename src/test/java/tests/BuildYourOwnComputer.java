package tests;

import com.codeborne.selenide.Configuration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class BuildYourOwnComputer {



    @Test
    public void BuildYourOwnComputerTest(){
        Configuration.browser = "firefox";
//        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demo.nopcommerce.com/";

        open("build-your-own-computer");

        $(By.xpath("//option[contains(text(),'2.5 GHz')]")).shouldHave(visible).click();
        $(By.xpath("//option[contains(text(),'8GB')]")).click();
        $(By.id("product_attribute_4_8")).click();
        $(By.id("product_attribute_3_6")).click();

        $(By.id("product_attribute_5_10")).click();

        $(By.id("add-to-cart-button-1")).click();
        $(By.xpath("(//a[@href='/cart'])[1]")).shouldHave(visible).click();

        $(By.xpath("//td/div [@class='attributes']")).shouldHave(text("HDD: 320 GB"), text("RAM: 2 GB"));
                                                                                                     // "8GB [+$60.00]" to Pass

    }
}
