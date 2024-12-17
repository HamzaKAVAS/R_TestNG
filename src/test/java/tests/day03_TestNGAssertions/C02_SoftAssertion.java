package tests.day03_TestNGAssertions;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_SoftAssertion {

    @Test
    public void softAssertionTest() {
        // 1- testotomasyonu anasyafaya gidip url'in testotomasyonu içerdiğini test edin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        String expectedUrlIcerik = "testotomasyonu";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualUrl.contains(expectedUrlIcerik), "Url istenen kelimeyi içermiyor");

        // 2- phone için arama yapıp urun bulunabildiğini test edin
        TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();
        testotomasyonuPage.aramaKutusu.sendKeys(ConfigReader.getProperty("toAranacakKelime") + Keys.ENTER);
        String actualSonuc = testotomasyonuPage.aramaSonucElementi.getText();
        String unExpectedSonuc = ConfigReader.getProperty("toUnExpectedSonuc");
        softAssert.assertNotEquals(actualSonuc, unExpectedSonuc, "istenen ürün bulunamadı");

        // 3- ilk ürüne tıklayıp ürün isminde case sensitive olmadan "phone" bulunduğunu test edin
        testotomasyonuPage.ilkUrunElementi.click();
        String expectedIsimIcerik = ConfigReader.getProperty("toAranacakKelime");
        String actualIsimIcerik = testotomasyonuPage.ilkUrunIsimText.getText().toLowerCase();
        softAssert.assertTrue(actualIsimIcerik.contains(expectedIsimIcerik), "aranan kelime üründe yoktur");
        softAssert.assertAll();
        Driver.quitDriver();
    }
}
