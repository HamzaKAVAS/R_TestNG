package tests.practices;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TOPracticePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P09_UrunFiyatTesti {

    // 1- https://www.testotomasyonu.com/ adresine gidin
    // 2- Sayfayi “refresh” yapin
    // 3- Sayfa basliginin “Test Otomasyonu” ifadesi icerdigini test edin
    // 4- Furniture linkine tiklayin
    // 5- price range filtresinde min degere 40, max degere 200 yazip filtreleyin
    // 6- filtreleme sonucunda urun bulunabildigini test edin
    // 7- Ilk urunu tiklayin
    // 8- Urun fiyatinin 40 ile 200 arasinda oldugunu test edin
    // 9- Sayfayi kapatin

    @Test
    public void urunFiyatAralikTesti() {
        // 1- https://www.testotomasyonu.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        // 2- Sayfayi “refresh” yapin
        Driver.getDriver().navigate().refresh();

        // 3- Sayfa basliginin “Test Otomasyonu” ifadesi icerdigini test edin
        String expectedTitleIcerik = "Test Otomasyonu";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitleIcerik));

        // 4- Furniture linkine tiklayin
        TOPracticePage toPracticePage = new TOPracticePage();
        toPracticePage.furnitureLink.click();

        // 5- price range filtresinde min degere 40, max degere 200 yazip filtreleyin
        Actions actions = new Actions(Driver.getDriver());
        toPracticePage.filtrelemeMinKutusu.clear();
        toPracticePage.filtrelemeMinKutusu.sendKeys("40");
        toPracticePage.filtrelemeMaxKutusu.clear();
        toPracticePage.filtrelemeMaxKutusu.sendKeys("200");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        toPracticePage.filterPriceButonu.click();

        // 6- filtreleme sonucunda urun bulunabildigini test edin
        String unExpectedUrunSonucYazisi = "0 Products Found";
        String actualUrunSonucYazisi = toPracticePage.aramaSonucuElementi.getText();
        Assert.assertNotEquals(actualUrunSonucYazisi, unExpectedUrunSonucYazisi);

        // 7- Ilk urunu tiklayin
        toPracticePage.ilkUrunResmiElementi.click();

        // 8- Urun fiyatinin 40 ile 200 arasinda oldugunu test edin
        String urunFiyatiYazisiElementiText = toPracticePage.ilkUrunuTikladigindaUrunFiyatiYazisi.getText(); // $50.00 (String)
        String urunFiyatiYazisiElementiSayisiStr = urunFiyatiYazisiElementiText.replaceAll("\\D", ""); // 5000
        int urunFiyatiYazisiSayisi = Integer.parseInt(urunFiyatiYazisiElementiSayisiStr) / 100; // 50
        Assert.assertTrue(40 < urunFiyatiYazisiSayisi && urunFiyatiYazisiSayisi < 200);

        // 9- Sayfayi kapatin
        Driver.quitDriver();
    }
}
