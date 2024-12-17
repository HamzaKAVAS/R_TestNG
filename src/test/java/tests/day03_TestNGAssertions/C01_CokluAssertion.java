package tests.day03_TestNGAssertions;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_CokluAssertion {

    // 1- testotomasyonu anasyafaya gidip url'in testotomasyonu içerdiğini test edin
    // 2- phone için arama yapıp urun bulunabildiğini test edin
    // 3- ilk ürüne tıklayıp ürün isminde case sensitive olmadan "phone" bulunduğunu test edin

    @Test
    public void ilkUrunTesti(){
        // 1- testotomasyonu anasyafaya gidip url'in testotomasyonu içerdiğini test edin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        String expectedUrlIcerik = "testotomasyonu";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));

        // 2- phone için arama yapıp urun bulunabildiğini test edin
        TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();
        testotomasyonuPage.aramaKutusu.sendKeys(ConfigReader.getProperty("toAranacakKelime") + Keys.ENTER);
        String actualSonuc = testotomasyonuPage.aramaSonucElementi.getText();
        String unExpectedSonuc = ConfigReader.getProperty("toUnExpectedSonuc");
        Assert.assertNotEquals(actualSonuc,unExpectedSonuc);

        // 3- ilk ürüne tıklayıp ürün isminde case sensitive olmadan "phone" bulunduğunu test edin
        testotomasyonuPage.ilkUrunElementi.click();
        String expectedIsimIcerik = ConfigReader.getProperty("toAranacakKelime");
        String actualIsimIcerik = testotomasyonuPage.ilkUrunIsimText.getText().toLowerCase();
        Assert.assertTrue(actualIsimIcerik.contains(expectedIsimIcerik));
        Driver.quitDriver();
    }
}
