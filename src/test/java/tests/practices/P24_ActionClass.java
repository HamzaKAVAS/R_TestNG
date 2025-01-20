package tests.practices;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class P24_ActionClass {

    // 1- https://the-internet.herokuapp.com/context_menu sitesine gidin
    // 2- Cizili alan uzerinde sag click yapin
    // 3- Alert’te cikan yazinin “You selected a context menu” oldugunu test edin.
    // 4- Tamam diyerek alert’i kapatalim
    // 5- Elemental Selenium linkine tiklayalim
    // 6- Acilan sayfada h1 taginda “Make sure your code lands” yazdigini test edelim

    @Test
    public void actionClassTest(){
        // 1- https://the-internet.herokuapp.com/context_menu sitesine gidin
        Driver.getDriver().get(ConfigReader.getProperty("herOkuActionsUrl"));

        // 2- Cizili alan uzerinde sag click yapin
        // 3- Alert’te cikan yazinin “You selected a context menu” oldugunu test edin.
        // 4- Tamam diyerek alert’i kapatalim
        // 5- Elemental Selenium linkine tiklayalim
        // 6- Acilan sayfada h1 taginda “Make sure your code lands” yazdigini test edelim
        Driver.quitDriver();
    }
}
