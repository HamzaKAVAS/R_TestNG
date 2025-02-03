package tests.practices;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P30_KeyboardAction {

    // 1- https://www.testotomasyonu.com adresine gidelim
    // 2- Account linkine tiklayin
    // 3- Sign Up linkine basalim
    // 4- Ad, soyad, mail ve sifre kutularina deger yazalim ve Sign Up butonuna basalim
    // 5- Kaydin olusturuldugunu test edin

    @Test
    public void testOtomasyonuRegisterTest(){
        // 1- https://www.testotomasyonu.com adresine gidelim
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();
        Actions actions = new Actions(Driver.getDriver());

        // 2- Account linkine tiklayin


        // 3- Sign Up linkine basalim
        // 4- Ad, soyad, mail ve sifre kutularina deger yazalim ve Sign Up butonuna basalim
        // 5- Kaydin olusturuldugunu test edin
    }
}
