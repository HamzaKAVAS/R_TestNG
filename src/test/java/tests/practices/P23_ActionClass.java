package tests.practices;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TOPracticePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P23_ActionClass {

    // 1- https://testotomasyonu.com/click sitesine gidin
    // 2- “DGI Drones” uzerinde sag click yapin
    // 3- Alert’te cikan yazinin “Tebrikler!... Sağ click yaptınız.” oldugunu test edin.
    // 4- Tamam diyerek alert’i kapatalim

    @Test
    public void actionsClassTest() {
        // 1- https://testotomasyonu.com/click sitesine gidin
        Driver.getDriver().get(ConfigReader.getProperty("toClick"));
        TOPracticePage toPracticePage = new TOPracticePage();

        // 2- “DGI Drones” uzerinde sag click yapin
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(toPracticePage.dgiDronesPaintingElementi).perform();
        ReusableMethods.bekle(1);

        // 3- Alert’te cikan yazinin “Tebrikler!... Sağ click yaptınız.” oldugunu test edin.
        String expectedAlertYazisi = "Tebrikler!... Sağ click yaptınız.";
        String actualAlertYazisi = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(actualAlertYazisi, expectedAlertYazisi);

        // 4- Tamam diyerek alert’i kapatalim
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.bekle(1);
        Driver.quitDriver();
    }
}
