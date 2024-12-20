package tests.day05_crossBrowserCalistirilacakTestler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.TestBaseCross;

public class C03_UrunAramaTesti extends TestBaseCross {

    @Test
    public void test01() {
        //1- https://www.testotomasyonu.com/ anasayfasina gidin
        driver.get(ConfigReader.getProperty("toUrl"));

        // phone icin arama yapin
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);

        // arama sonucunda urun bulunabildigini test edin
        WebElement aramaSonucuElementi = driver.findElement(By.className("product-count-text"));
        String unExpectedSonuc = "0 Products Found";
        String actualSonuc = aramaSonucuElementi.getText();
        Assert.assertNotEquals(actualSonuc, unExpectedSonuc);
    }
}
