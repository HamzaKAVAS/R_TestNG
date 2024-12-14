package tests.day01_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C03_DriverClassKullanimi {

    // üç farklı test method'u oluşturun
    // testotomasyonu, wisequarter ve bestbuy sitelerine gidip
    // url'in bu kelimeleri içerdiğini test edin
    // ve windowları kapatın

    @Test
    public void testotomasyonuTest() {
        Driver.getDriver().get("https://www.testotomasyonu.com");
        String expectedUrlIcerik = "testotomasyonu";
        String actualUrlIcerik = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrlIcerik.contains(expectedUrlIcerik));
        Driver.quitDriver();
    }

    @Test
    public void wisequarterTest() {
        Driver.getDriver().get("https://www.wisequarter.com");
        String expectedUrlIcerik = "wisequarter";
        String actualUrlIcerik = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrlIcerik.contains(expectedUrlIcerik));
        Driver.quitDriver();
    }

    @Test
    public void bestbuyTest() {
        Driver.getDriver().get("https://www.bestbuy.com");
        String expectedUrlIcerik = "bestbuy";
        String actualUrlIcerik = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrlIcerik.contains(expectedUrlIcerik));
        Driver.quitDriver();
    }
}
