package tests.practices;

import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class P20_WindowHandles {

    // 1- Testotomasyonu anasayfa adresine gidin.
    // 2- Sayfa’nin window handle degerini String bir degiskene atayin
    // 3- Sayfa title’nin “Otomasyon” icerdigini test edin
    // 4- Yeni bir tab olusturup, acilan tab’da wisequarter.com adresine gidin
    // 5- Sayfa title’nin “Wise Quarter” icerdigini test edin
    // 6- Yeni bir window olusturup, acilan sayfada youtube.com adresine gidin
    // 7- Sayfa title’nin “YouTube” icerdigini test edin
    // 8- Ilk acilan sayfaya donun ve testotomasyonu sayfasina dondugunuzu test edin

    @Test
    public void windowHandleTest() {
        // 1- Testotomasyonu anasayfa adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        // 2- Sayfa’nin window handle degerini String bir degiskene atayin
        String ilkSayfaHandleDegeri = Driver.getDriver().getWindowHandle();
        System.out.println("Testotomasyonu window handle değeri: " + ilkSayfaHandleDegeri);

        // 3- Sayfa title’nin “Otomasyon” icerdigini test edin
        String expectedTitleIcerik = "Otomasyon";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitleIcerik));

        // 4- Yeni bir tab olusturup, acilan tab’da wisequarter.com adresine gidin
        Driver.getDriver().switchTo().newWindow(WindowType.TAB).get(ConfigReader.getProperty("wiseUrl"));

        // 5- Sayfa title’nin “Wise Quarter” icerdigini test edin
        expectedTitleIcerik = "Wise Quarter";
        actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitleIcerik));

        // 6- Yeni bir window olusturup, acilan sayfada youtube.com adresine gidin
        Driver.getDriver().switchTo().newWindow(WindowType.WINDOW).get(ConfigReader.getProperty("youtubeUrl"));

        // 7- Sayfa title’nin “YouTube” icerdigini test edin
        expectedTitleIcerik = "YouTube";
        actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitleIcerik));

        // 8- Ilk acilan sayfaya donun ve testotomasyonu sayfasina dondugunuzu test edin
        ReusableMethods.bekle(1);
        Driver.getDriver().switchTo().window(ilkSayfaHandleDegeri);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://www.testotomasyonu.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
        Driver.quitDriver();
    }
}
