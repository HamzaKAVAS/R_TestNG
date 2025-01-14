package tests.practices;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class P20_WindowHandles {

    // 1- Testotomasyonu anasayfa adresine gidin.
    // 2- Sayfa’nin window handle degerini String bir degiskene atayin
    // 3- Sayfa title’nin “Otomasyon” icerdigini test edin
    // 4- Yeni bir tab olusturup, acilan tab’da wisequarter.com adresine gidin
    // 5- Sayfa title’nin “wisequarter” icerdigini test edin
    // 6- Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
    // 7- Sayfa title’nin “Walmart” icerdigini test edin
    // 8- Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin

    @Test
    public void windowHandleTest(){
        // 1- Testotomasyonu anasayfa adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        // 2- Sayfa’nin window handle degerini String bir degiskene atayin
        String toWindowHandle = Driver.getDriver().getWindowHandle();

        // 3- Sayfa title’nin “Otomasyon” icerdigini test edin
        String expectedTitleIcerik = "Otomasyon";
        String actualTitle = Driver.getDriver().getTitle();

        // 4- Yeni bir tab olusturup, acilan tab’da wisequarter.com adresine gidin
        Driver.getDriver().switchTo().newWindow(WindowType.TAB).get(ConfigReader.getProperty("wiseUrl"));

        // 5- Sayfa title’nin “wisequarter” icerdigini test edin
        // 6- Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
        // 7- Sayfa title’nin “Walmart” icerdigini test edin
        // 8- Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin

        Driver.quitDriver();
    }
}
