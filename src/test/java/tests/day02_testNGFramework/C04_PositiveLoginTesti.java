package tests.day02_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_PositiveLoginTesti {

    // 1- https://www.testotomasyonu.com/ anasayfasina gidin
    // 2- account linkine basin
    // 3- Kullanici email'i olarak gecerli email girin
    // 4- Kullanici sifresi olarak gecerli password girin
    // 5- Login butonuna basarak login olun
    // 6- Basarili olarak giris yapilabildigini test edin
    // 7- logout olun

    @Test
    public void positiveLoginTest() {
        // 1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get("https://www.testotomasyonu.com/");
        TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

        // 2- account linkine basin
        testotomasyonuPage.accountlinkButton.click();

        // 3- Kullanici email'i olarak gecerli email girin
        testotomasyonuPage.emailKutusu.sendKeys("wise@gmail.com");

        // 4- Kullanici sifresi olarak gecerli password girin
        testotomasyonuPage.passwordKutusu.sendKeys("12345");

        // 5- Login butonuna basarak login olun
        testotomasyonuPage.signInButton.click();

        // 6- Basarili olarak giris yapilabildigini test edin
        Assert.assertTrue(testotomasyonuPage.LogoutButton.isDisplayed());

        // 7- logout olun
        testotomasyonuPage.LogoutButton.click();
        Driver.quitDriver();
    }

    @Test
    public void dinamikPositiveLoginTest() {
        // 1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        // 2- account linkine basin
        TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();
        testotomasyonuPage.accountlinkButton.click();

        // 3- Kullanici email'i olarak gecerli email girin
        testotomasyonuPage.emailKutusu.sendKeys(ConfigReader.getProperty("toGecerliEMail"));

        // 4- Kullanici sifresi olarak gecerli password girin
        testotomasyonuPage.passwordKutusu.sendKeys(ConfigReader.getProperty("toGecerliPassword"));

        // 5- Login butonuna basarak login olun
        testotomasyonuPage.signInButton.click();

        // 6- Basarili olarak giris yapilabildigini test edin
        Assert.assertTrue(testotomasyonuPage.LogoutButton.isDisplayed());

        // 7- logout olun
        testotomasyonuPage.LogoutButton.click();
        Driver.quitDriver();
    }
}
