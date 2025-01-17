package tests.practices;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class P23_ActionClass {

    // 1- https://testotomasyonu.com/click sitesine gidin
    // 2- “DGI Drones” uzerinde sag click yapin
    // 3- Alert’te cikan yazinin “Tebrikler!... Sağ click yaptınız.” oldugunu test edin.
    // 4- Tamam diyerek alert’i kapatalim

    @Test
    public void actionsClassTest(){
        // 1- https://testotomasyonu.com/click sitesine gidin
        Driver.getDriver().get(ConfigReader.getProperty("toClick"));

        // 2- “DGI Drones” uzerinde sag click yapin
        // 3- Alert’te cikan yazinin “Tebrikler!... Sağ click yaptınız.” oldugunu test edin.
        // 4- Tamam diyerek alert’i kapatalim
        Driver.quitDriver();
    }
}
