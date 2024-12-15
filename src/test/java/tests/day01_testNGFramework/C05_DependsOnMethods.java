package tests.day01_testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C05_DependsOnMethods {

    // 3 farklı test methodu oluşturup aşağıdaki görevleri yapın
    // 1- testotomasyonu anasyafaya gidip url'in testotomasyonu içerdiğini test edin
    // 2- phone için arama yapıp urun bulunabildiğini test edin
    // 3- ilk ürüne tıklayıp ürün isminde case sensitive olmadan "phone" bulunduğunu test edin

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
        WebElement aramaKutusu = Driver.getDriver().findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);
        String unExpectedUrun = "0 Products Found";
        WebElement aramaSonucElementi = Driver.getDriver().findElement(By.className("product-count-text"));
        String actualUrun = aramaSonucElementi.getText();
        Assert.assertNotEquals(actualUrun, unExpectedUrun);
    }

    @Test(dependsOnMethods = "phoneAramaTesti")
    public void IlkUrunIsimTesti() {
        // 3- ilk ürüne tıklayıp ürün isminde case sensitive olmadan "phone" bulunduğunu test edin
        Driver.getDriver().findElement(By.xpath("(//*[@*='lazy'])[1]")).click();
        WebElement ilkUrunIsimText = Driver.getDriver().findElement(By.xpath("//*[@*=' heading-sm mb-4']"));
        String expectedIsim = "phone";
        String actualIsim = ilkUrunIsimText.getText().toLowerCase();
        Assert.assertTrue(actualIsim.contains(expectedIsim));
        Driver.quitDriver();
    }
}
