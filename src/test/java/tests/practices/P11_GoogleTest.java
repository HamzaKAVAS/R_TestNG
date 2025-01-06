package tests.practices;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P11_GoogleTest {

    // 1- https://www.google.com/ adresine gidin
    // 2- cookies uyarisini kabul ederek kapatin
    // 3- Sayfa basliginin “Google” ifadesi icerdigini test edin
    // 4- Arama cubuguna “Nutella” yazip aratin
    // 5- Bulunan sonuc sayisini yazdirin
    // 6- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
    // 7- Sayfayi kapatin

    @Test
    public void googleTest() {
        // 1- https://www.google.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));
        GooglePage googlePage = new GooglePage();

        // 2- cookies uyarisini kabul ederek kapatin
              // cookies aren't visible.

        // 3- Sayfa basliginin “Google” ifadesi icerdigini test edin
        String expectedTitleIcerik = "Google";
        String actualTitleIcerik = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitleIcerik.contains(expectedTitleIcerik));

        // 4- Arama cubuguna “Nutella” yazip aratin
        googlePage.googleAramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        googlePage.araclarButonu.click();

        // 5- Bulunan sonuc sayisini yazdirin
        System.out.println(googlePage.sonucYazisiElementi.getText());

        // 6- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        String sonucYazisiText = googlePage.sonucYazisiElementi.getText();
        System.out.println(sonucYazisiText.indexOf("s")); // 21
        System.out.println(sonucYazisiText.substring(0, 20)); // Yaklaşık 174.000.000
        String sonucYazisiStr = sonucYazisiText.substring(0, 20);
        String sonucYazisi = sonucYazisiStr.replaceAll("\\D", ""); // 175000000 (String)
        int sonucYazisiSayisi = Integer.parseInt(sonucYazisi); // 175000000 (int)
        Assert.assertTrue(sonucYazisiSayisi > 10000000);

        // 7- Sayfayi kapatin
        Driver.quitDriver();
    }
}
