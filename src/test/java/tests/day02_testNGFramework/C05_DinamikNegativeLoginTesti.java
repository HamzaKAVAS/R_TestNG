package tests.day02_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_DinamikNegativeLoginTesti {

    // 1- https://www.testotomasyonu.com/ anasayfasina gidin
    // 2- account linkine basin
    // 3- 3 farkli test method’u olusturun.
    //  - gecerli email, gecersiz password
    //  - gecersiz email, gecerli password
    //  - gecersiz email, gecersiz password.
    // 4- Login butonuna basarak login olmayi deneyin
    // 5- Basarili olarak giris yapilamadigini test edin

    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

    @Test
    public void gecersizPasswordTest(){
        testotomasyonuPage = new TestotomasyonuPage();

        // 1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        // 2- account linkine basin
        testotomasyonuPage.accountlinkButton.click();

        // 3- 3 farkli test method’u olusturun.
        //  - gecerli email, gecersiz password
        testotomasyonuPage.emailKutusu.sendKeys(ConfigReader.getProperty("toGecerliEMail"));
        testotomasyonuPage.passwordKutusu.sendKeys(ConfigReader.getProperty("toGecersizPassword"));

        // 4- Login butonuna basarak login olmayi deneyin
        testotomasyonuPage.signInButton.click();

        // 5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(testotomasyonuPage.emailKutusu.isDisplayed());
        Driver.quitDriver();
    }
}
