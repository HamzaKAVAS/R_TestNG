package tests.day04_htmlReports;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TopluAramaTesti {

    @Test
    public void topluAramaTesti() {

        TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();
        SoftAssert softAssert = new SoftAssert();

        // testotomasyonu anasayfasina gidin
        // verilen urunlerin herbiri icin arama yaptirip
        // arama sonucunda urun bulunabildigini test edin ( phone, java, dress, baby, nutella, samsung, iphone, shirt )

        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        List<String> aranacakUrunlerListesi = new ArrayList<>(Arrays.asList("phone", "java", "dress", "baby", "nutella", "samsung", "iphone", "shirt"));
        for (String eachUrun : aranacakUrunlerListesi) {
            testotomasyonuPage.aramaKutusu.sendKeys(eachUrun + Keys.ENTER);
            String unExpectedAramaSonucu = ConfigReader.getProperty("toUnexpectedSonuc");
            String actualAramaSonucu = testotomasyonuPage.aramaSonucElementi.getText();
            softAssert.assertNotEquals(actualAramaSonucu, unExpectedAramaSonucu, eachUrun + " bulunamadı.");
        }
        softAssert.assertAll();
    }
}
