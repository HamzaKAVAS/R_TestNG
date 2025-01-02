package tests.practices;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TOPracticePage;
import utilities.ConfigReader;
import utilities.Driver;

public class P07_AramaTesti {

    // 1- https://www.testotomasyonu.com/ sayfasına gidin.
    // 2- Arama kutusuna “dress” yazip aratin
    // 3- Görüntülenen sonuçların sayısını yazdırın
    // 4- Listeden ilk urunun resmine tıklayın.
    // 5- Urun detayinda dress kelimesi geçtiğini test edin.

    @Test
    public void aramaTesti() {
        // 1- https://www.testotomasyonu.com/ sayfasına gidin.
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        TOPracticePage toPracticePage = new TOPracticePage();

        // 2- Arama kutusuna “dress” yazip aratin
        toPracticePage.searchBox.sendKeys("dress" + Keys.ENTER);

        // 3- Görüntülenen sonuçların sayısını yazdırın
        String aramaSonucuElementiText = toPracticePage.aramaSonucuElementi.getText(); // 10 Products Found
        String aramaSonucuElementiTextSayisiStr = aramaSonucuElementiText.replaceAll("\\D", ""); // 10 (String)
        int aramaSonucElementiSayisi = Integer.parseInt(aramaSonucuElementiTextSayisiStr); // 10 (int)
        System.out.println("Görüntülenen sonuç sayısı: " + aramaSonucElementiSayisi);

        // 4- Listeden ilk urunun resmine tıklayın.
        toPracticePage.ilkUrunResmiElementi.click();

        // 5- Urun detayinda dress kelimesi geçtiğini test edin
        String expectedUrunYaziIcerik = "dress";
        String actualUrunYazisi = toPracticePage.ilkUrunTextElementi.getText().toLowerCase();
        Assert.assertTrue(actualUrunYazisi.contains(expectedUrunYaziIcerik));
        Driver.quitDriver();
    }
}
