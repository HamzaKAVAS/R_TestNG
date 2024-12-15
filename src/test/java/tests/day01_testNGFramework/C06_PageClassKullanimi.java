package tests.day01_testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.Driver;

public class C06_PageClassKullanimi {

    // 3 farklı test methodu oluşturup aşağıdaki görevleri yapın
    // 1- testotomasyonu anasyafaya gidip url'in testotomasyonu içerdiğini test edin
    // 2- phone için arama yapıp urun bulunabildiğini test edin
    // 3- ilk ürüne tıklayıp ürün isminde case sensitive olmadan "phone" bulunduğunu test edin

    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

    @Test
    public void anasayfaTesti() {
        // 1- testotomasyonu anasyafaya gidip url'in testotomasyonu içerdiğini test edin
        Driver.getDriver().get("https://www.testotomasyonu.com");
        String expectedUrlIcerik = "testotomasyonu";
        String actualUrlIcerik = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrlIcerik.contains(expectedUrlIcerik));
    }

    @Test(dependsOnMethods = "anasayfaTesti")
    public void phoneAramaTesti() {
        // 2- phone için arama yapıp urun bulunabildiğini test edin
        testotomasyonuPage.aramaKutusu.sendKeys("phone" + Keys.ENTER);
        String unExpectedUrun = "0 Products Found";
        String actualUrun = testotomasyonuPage.aramaSonucElementi.getText();
        Assert.assertNotEquals(actualUrun, unExpectedUrun);
    }

    @Test(dependsOnMethods = "phoneAramaTesti")
    public void IlkUrunIsimTesti() {
        // 3- ilk ürüne tıklayıp ürün isminde case sensitive olmadan "phone" bulunduğunu test edin
        testotomasyonuPage.ilkUrunElementi.click();
        String expectedIsim = "phone";
        String actualIsim = testotomasyonuPage.ilkUrunIsimText.getText().toLowerCase();
        Assert.assertTrue(actualIsim.contains(expectedIsim));
        Driver.quitDriver();
    }
}
