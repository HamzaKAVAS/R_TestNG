package tests.practices;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerOkuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

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
        HerOkuPage herOkuPage = new HerOkuPage();

        // 2- Cizili alan uzerinde sag click yapin
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(herOkuPage.ciziliAlanElementi).perform();

        // 3- Alert’te cikan yazinin “You selected a context menu” oldugunu test edin.
        String expectedAlertText = "You selected a context menu";
        String actualAlertText = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(actualAlertText,expectedAlertText);

        // 4- Tamam diyerek alert’i kapatalim
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.bekle(2);

        // 5- Elemental Selenium linkine tiklayalim
        // 6- Acilan sayfada h1 taginda “Make sure your code lands” yazdigini test edelim
        Driver.quitDriver();
    }
}
