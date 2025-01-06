package tests.practices;

import org.testng.annotations.Test;
import pages.SauceDemoPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P12_SauceTest {

    // 1. “https://www.saucedemo.com/” Adresine gidin
    // 2. Username kutusuna “standard_user” yazdirin
    // 3. Password kutusuna “secret_sauce” yazdirin
    // 4. Login tusuna basin
    // 5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
    // 6. Add to Cart butonuna basin
    // 7. Alisveris sepetine tiklayin
    // 8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
    // 9. Sayfayi kapatin

    @Test
    public void sauceTest(){
        // 1. “https://www.saucedemo.com/” Adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("sauceUrl"));
        SauceDemoPage sauceDemoPage = new SauceDemoPage();

        // 2. Username kutusuna “standard_user” yazdirin
        sauceDemoPage.sauceUsernameKutusu.sendKeys("standard_user");

        // 3. Password kutusuna “secret_sauce” yazdirin
        sauceDemoPage.saucePasswordKutusu.sendKeys("secret_sauce");

        // 4. Login tusuna basin
        sauceDemoPage.sauceAnasayfaLoginButonu.click();

        // 5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        // 6. Add to Cart butonuna basin
        // 7. Alisveris sepetine tiklayin
        // 8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        // 9. Sayfayi kapatin
        Driver.quitDriver();
    }
}
