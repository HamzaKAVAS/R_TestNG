package tests.practices;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P06_LinkTesti {

    // 1- https://www.automationexercise.com/ adresine gidin
    // 2- Sayfada 147 adet link bulundugunu test edin.
    // 3- Products linkine tiklayin
    // 4- special offer yazisinin gorundugunu test edin
    // 5- Sayfayi kapatin

    @Test
    public void linkTesti() {
        // 1- https://www.automationexercise.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));
        AutomationPage automationPage = new AutomationPage();

        // 2- Sayfada 147 adet link bulundugunu test edin
        int expectedLinkSayisi = 147;
        int actualLinkSayisi = automationPage.linkSections.size();
        Assert.assertEquals(actualLinkSayisi, expectedLinkSayisi);

        // 3- Products linkine tiklayin
        automationPage.productsButton.click();

        // 4- special offer yazisinin gorundugunu test edin
        ReusableMethods.bekle(3);
        Assert.assertTrue(automationPage.specialOfferYaziElementi.isDisplayed());

        // 5- Sayfayi kapatin
        Driver.quitDriver();
    }
}
