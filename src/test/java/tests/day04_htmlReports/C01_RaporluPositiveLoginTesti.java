package tests.day04_htmlReports;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluPositiveLoginTesti extends TestBaseRapor {

    // 1- https://www.testotomasyonu.com/ anasayfasina gidin
    // 2- account linkine basin
    // 3- Kullanici email'i olarak gecerli email girin
    // 4- Kullanici sifresi olarak gecerli password girin
    // 5- Login butonuna basarak login olun
    // 6- Basarili olarak giris yapilabildigini test edin
    // 7- logout olun

    @Test
    public void raporluPositiveLoginTesti() {
        extentTest = extentReports.createTest("Hamza's Rules", "Kullanıcı email ve şifresi ile sisteme giriş yapabilmelidir.");
        // 1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("Kullanıcı testotomasyonu anasayfaya gider.");

        // 2- account linkine basin
        TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();
        testotomasyonuPage.accountlinkButton.click();
        extentTest.info("Kullanıcı account linkine basar.");

        // 3- Kullanici email'i olarak gecerli email girin
        testotomasyonuPage.emailKutusu.sendKeys(ConfigReader.getProperty("toGecerliEmail"));
        extentTest.info("Kullanıcı email olarak gecerli email girer.");

        // 4- Kullanici sifresi olarak gecerli password girin
        testotomasyonuPage.passwordKutusu.sendKeys(ConfigReader.getProperty("toGecerliPassword"));
        extentTest.info("Kullanıcı sifre olarak gecerli password girer.");

        // 5- Login butonuna basarak login olun
        testotomasyonuPage.signInButton.click();
        extentTest.info("Kullanıcı login butonuna basarak login olur");

        // 6- Basarili olarak giris yapilabildigini test edin
        Assert.assertTrue(testotomasyonuPage.LogoutButton.isDisplayed());
        extentTest.pass("Kullanıcı basarili olarak giris yapilabildigini test eder");

        // 7- logout olun
        testotomasyonuPage.LogoutButton.click();
        extentTest.info("Kullanıcı logout olur.");
        extentTest.info("Kullanıcı sayfayı kapatır.");
    }
}
