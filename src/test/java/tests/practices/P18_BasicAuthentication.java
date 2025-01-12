package tests.practices;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TOPracticePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class P18_BasicAuthentication {

    // 1- https://testotomasyonu.com/basicauth sayfasina gidin
    // 2- asagidaki yontem ve test datalarini kullanarak authentication’i yapin
    //    Html komutu : https://username:password@URL
    //    Username : membername
    //    Password : sunflower
    // 3- Basarili sekilde sayfaya girildigini dogrulayin

    @Test
    public void basicAutTest() {
        // 1- https://testotomasyonu.com/basicauth sayfasina gidin
        Driver.getDriver().get("https://testotomasyonu.com/basicauth");

        // 2- asagidaki yontem ve test datalarini kullanarak authentication’i yapin
        //    Html komutu : https://username:password@URL
        //    Username : membername
        //    Password : sunflower
        Driver.getDriver().get("https://membername:sunflower@testotomasyonu.com/basicauth");

        // 3- Basarili sekilde sayfaya girildigini dogrulayin
        TOPracticePage toPracticePage = new TOPracticePage();
        Assert.assertTrue(toPracticePage.basicAuthYaziElementi.isDisplayed());
        Driver.quitDriver();
    }
}
