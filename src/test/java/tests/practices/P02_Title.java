package tests.practices;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.Objects;

public class P02_Title {

    // 1.facebook sayfasina gidin ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin
    // 2.sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, “actual” URL’i yazdirin
    // 3.walmart sayfasina gidin
    // 4.sayfa url'nin “Walmart.com” icerdigini dogrulayin
    // 5.tekrar “facebook” sayfasina donun
    // 6.sayfayi yenileyin
    // 7.sayfayı kapatin

    @Test
    public void titleTest() {
        // 1.facebook sayfasina gidin ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin
        Driver.getDriver().get(ConfigReader.getProperty("faceUrl"));
        String expectedTitle = "facebook";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertNotEquals(actualTitle, expectedTitle);
        System.out.println("Actual Title: " + Driver.getDriver().getTitle());

        // 2.sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, “actual” URL’i yazdirin
        String expectedUrlIcerik = "facebook";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));
        System.out.println("Actual Url: " + Driver.getDriver().getCurrentUrl());

        // 3.walmart sayfasina gidin
        Driver.getDriver().navigate().to(ConfigReader.getProperty("walmartUrl"));

        // 4.sayfa url'nin “walmart.com” icerdigini dogrulayin
        expectedUrlIcerik = "walmart.com";
        actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));

        // 5.tekrar “facebook” sayfasina donun
        Driver.getDriver().navigate().back();

        // 6.sayfayi yenileyin
        Driver.getDriver().navigate().refresh();

        // 7.sayfayı kapatin
        Driver.quitDriver();
    }
}
