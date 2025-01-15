package tests.practices;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class P21_WindowHandle {

    // 1- https://testotomasyonu.com/addremove/ adresine gidin.
    // 2- Sayfadaki textin “Add/Remove Elements” olduğunu doğrulayın.
    // 3- Sayfa başlığının(title) “Test Otomasyonu” olduğunu doğrulayın.
    // 4- ’Please click for Electronics Products’ linkine tiklayin.
    // 5- Electronics sayfasinin acildigini test edin.
    // 6- Bulunan urun sayisinin 16 olduğunu test edin.
    // 7- Ilk actiginiz addremove sayfasina donun.
    // 8- Url’in addremove icerdigini test edin.

    @Test
    public void windowHandleTest(){
        // 1- https://testotomasyonu.com/addremove/ adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("toAddRemove"));

        // 2- Sayfadaki textin “Add/Remove Elements” olduğunu doğrulayın.
        // 3- Sayfa başlığının(title) “Test Otomasyonu” olduğunu doğrulayın.
        // 4- ’Please click for Electronics Products’ linkine tiklayin.
        // 5- Electronics sayfasinin acildigini test edin.
        // 6- Bulunan urun sayisinin 16 olduğunu test edin.
        // 7- Ilk actiginiz addremove sayfasina donun.
        // 8- Url’in addremove icerdigini test edin.
        Driver.quitDriver();
    }
}
