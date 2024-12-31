package tests.practices;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P01_Navigate {

    // 1. Youtube ana sayfasina gidelim
    // 2. Testotomasyonu sayfasina gidelim
    // 3. Tekrar YouTube’sayfasina donelim
    // 4. Yeniden testotomasyonu sayfasina gidelim
    // 5. Sayfayi Refresh(yenile) yapalim
    // 6. Tum sayfalari kapatalim

    @Test
    public void goPages() {
        // 1. Youtube ana sayfasina gidelim
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));
        ReusableMethods.bekle(2);

        // 2. Testotomasyonu sayfasina gidelim
        Driver.getDriver().navigate().to(ConfigReader.getProperty("toUrl"));
        ReusableMethods.bekle(2);

        // 3. Tekrar YouTube’sayfasina donelim
        Driver.getDriver().navigate().back();
        ReusableMethods.bekle(1);

        // 4. Yeniden testotomasyonu sayfasina gidelim
        Driver.getDriver().navigate().forward();
        ReusableMethods.bekle(1);

        // 5. Sayfayi Refresh(yenile) yapalim
        Driver.getDriver().navigate().refresh();
        ReusableMethods.bekle(1);

        // 6. Tum sayfalari kapatalim
        Driver.quitDriver();
    }
}
