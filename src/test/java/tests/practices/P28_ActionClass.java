package tests.practices;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class P28_ActionClass {

    // 1- https://www.testotomasyonu.com/ adresine gidin
    // 2- “Kids Wear” menusunun acilmasi icin mouse’u bu menunun ustune getirin
    // 3- “Boys” linkine basin
    // 4- Acilan sayfadaki ilk urunu tiklayin
    // 5- Acilan sayfada urun isminin “Boys Shirt White Color” oldugunu test edin

    @Test
    public void testotomasyonuActionsTest(){
        // 1- https://www.testotomasyonu.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        // 2- “Kids Wear” menusunun acilmasi icin mouse’u bu menunun ustune getirin
        // 3- “Boys” linkine basin
        // 4- Acilan sayfadaki ilk urunu tiklayin
        // 5- Acilan sayfada urun isminin “Boys Shirt White Color” oldugunu test edin
        Driver.quitDriver();
    }
}
