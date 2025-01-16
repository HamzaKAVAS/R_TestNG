package tests.practices;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class P22_WindowHandle {

    // 1- https://the-internet.herokuapp.com/windows adresine gidin.
    // 2- Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
    // 3- Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
    // 4- Click Here butonuna basın.
    // 5- Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
    // 6- Sayfadaki textin “New Window” olduğunu doğrulayın.
    // 7- Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.

    @Test
    public void windowHandleHerOkuTesti(){
        // 1- https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("herOkuWhdUrl"));

        // 2- Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        // 3- Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        // 4- Click Here butonuna basın.
        // 5- Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        // 6- Sayfadaki textin “New Window” olduğunu doğrulayın.
        // 7- Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.
        Driver.quitDriver();
    }
}
