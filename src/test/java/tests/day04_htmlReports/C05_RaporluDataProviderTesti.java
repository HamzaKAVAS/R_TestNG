package tests.day04_htmlReports;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C05_RaporluDataProviderTesti extends TestBaseRapor {

    @DataProvider
    public static Object[][] UrunProvideri() {
        String[][] urunlerArrayi = {{"phone"}, {"java"}, {"dress"}, {"baby"}, {"nutella"}, {"samsung"}, {"iphone"}, {"shirt"}};
        return urunlerArrayi;
    }

    @Test(dataProvider = "UrunProvideri")
    public void aramaTesti(String aranacakUrun) {

        extentTest = extentReports.createTest(aranacakUrun + " arama testi", "Arama sonucunda " + aranacakUrun + " bulunabilmeli");

        // testotomasyonu sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("Kullanıcı testotomasyonu anasayfaya gider.");
        TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

        // arama kutusuna aranacakUrun'u yazdirip enter'a basin
        testotomasyonuPage.aramaKutusu.sendKeys(aranacakUrun + Keys.ENTER);
        extentTest.info("Kullanıcı arama kutusuna " + aranacakUrun + " yazdırıp enter'a basar.");

        // arama sonucunda urun bulunabildigini test edin
        String unExpectedAramaSonucu = ConfigReader.getProperty("toUnexpectedSonuc");
        String actualAramaSonucuYazisi = testotomasyonuPage.aramaSonucElementi.getText();
        ReusableMethods.bekle(1);
        Assert.assertNotEquals(actualAramaSonucuYazisi, unExpectedAramaSonucu, aranacakUrun + " bulunamadı.");
        extentTest.pass("Kullanıcı arama sonucunda ürün bulunabildiğini test eder.");
        extentTest.info("Kullanıcı sayfayı kapatır");
    }
}
