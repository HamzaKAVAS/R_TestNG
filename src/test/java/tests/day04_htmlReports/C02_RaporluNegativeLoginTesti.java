package tests.day04_htmlReports;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C02_RaporluNegativeLoginTesti extends TestBaseRapor {

    // 1- https://www.testotomasyonu.com/ anasayfasina gidin
    // 2- account linkine basin
    // 3- 3 farkli test method’u olusturun.
    //  - gecerli email, gecersiz password
    //  - gecersiz email, gecerli password
    //  - gecersiz email, gecersiz password
    // 4- Login butonuna basarak login olmayi deneyin
    // 5- Basarili olarak giris yapilamadigini test edin

    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

    @Test
    public void gecersizPasswordTesti() {
        testotomasyonuPage = new TestotomasyonuPage();
        extentTest = extentReports.createTest("Geçersiz Password Testi", "Kullanıcı geçerli email ve geçersiz password ile giriş yapamamalıdır.");

        // 1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("Kullanıcı testotomasyonu anasayfaya gider.");

        // 2- account linkine basin
        testotomasyonuPage.accountlinkButton.click();
        extentTest.info("Kullanıcı account linkine basar.");

        // 3- gecerli email, gecersiz password giriniz
        testotomasyonuPage.emailKutusu.sendKeys(ConfigReader.getProperty("toGecerliEmail"));
        extentTest.info("Kullanıcı geçerli bir email adresi girer.");
        testotomasyonuPage.passwordKutusu.sendKeys(ConfigReader.getProperty("toGecersizPassword"));
        extentTest.info("Kullanıcı geçersiz bir password girer.");

        // 4- Login butonuna basarak login olmayi deneyin
        testotomasyonuPage.signInButton.click();
        extentTest.info("Kullanıcı sign-in butonuna basarak login olmayi dener");

        // 5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(testotomasyonuPage.signInButton.isDisplayed());
        extentTest.pass("Kullanıcı başarılı olarak giriş yapılamadığını görür.");
        extentTest.info("Kullanıcı sayfayı kapatır");
    }

    @Test
    public void gecersizEmailTesti() {
        testotomasyonuPage = new TestotomasyonuPage();
        extentTest = extentReports.createTest("Geçersiz Email Testi", "Kullanıcı geçersiz email ve geçerli password ile giriş yapamamalıdır.");

        // 1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("Kullanıcı testotomasyonu anasayfaya gider.");

        // 2- account linkine basin
        testotomasyonuPage.accountlinkButton.click();
        extentTest.info("Kullanıcı account linkine basar.");

        // 3- gecersiz email, gecerli password giriniz
        testotomasyonuPage.emailKutusu.sendKeys(ConfigReader.getProperty("toGecersizEmail"));
        extentTest.info("Kullanıcı geçersiz bir email adresi girer.");
        testotomasyonuPage.passwordKutusu.sendKeys(ConfigReader.getProperty("toGecerliPassword"));
        extentTest.info("Kullanıcı geçerli bir password girer.");

        // 4- Login butonuna basarak login olmayi deneyin
        testotomasyonuPage.signInButton.click();
        extentTest.info("Kullanıcı sign-in butonuna basarak login olmayi dener");

        // 5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(testotomasyonuPage.signInButton.isDisplayed());
        extentTest.pass("Kullanıcı başarılı olarak giriş yapılamadığını görür.");
        extentTest.info("Kullanıcı sayfayı kapatır");
    }

    @Test
    public void gecersizEmailPasswordTesti() {
        testotomasyonuPage = new TestotomasyonuPage();
        extentTest = extentReports.createTest("Geçersiz Email ve Password Testi", "Kullanıcı geçersiz email ve geçersiz password ile giriş yapamamalıdır.");

        // 1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("Kullanıcı testotomasyonu anasayfaya gider.");

        // 2- account linkine basin
        testotomasyonuPage.accountlinkButton.click();
        extentTest.info("Kullanıcı account linkine basar.");

        // 3- gecersiz email, gecersiz password giriniz
        testotomasyonuPage.emailKutusu.sendKeys(ConfigReader.getProperty("toGecersizEmail"));
        extentTest.info("Kullanıcı geçersiz bir email adresi girer.");
        testotomasyonuPage.passwordKutusu.sendKeys(ConfigReader.getProperty("toGecersizPassword"));
        extentTest.info("Kullanıcı geçersiz bir password girer.");

        // 4- Login butonuna basarak login olmayi deneyin
        testotomasyonuPage.signInButton.click();
        extentTest.info("Kullanıcı sign-in butonuna basarak login olmayi dener");

        // 5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(testotomasyonuPage.signInButton.isDisplayed());
        extentTest.pass("Kullanıcı başarılı olarak giriş yapılamadığını görür.");
        extentTest.info("Kullanıcı sayfayı kapatır");
    }
}
