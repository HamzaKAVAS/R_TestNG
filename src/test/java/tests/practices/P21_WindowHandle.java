package tests.practices;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TOPracticePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

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
    public void windowHandleTest() {
        // 1- https://testotomasyonu.com/addremove/ adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("toAddRemove"));
        TOPracticePage toPracticePage = new TOPracticePage();
        String ilkWhd = Driver.getDriver().getWindowHandle();

        // 2- Sayfadaki textin “Add/Remove Elements” olduğunu doğrulayın.
        Assert.assertTrue(toPracticePage.addRemoveElementsText.isDisplayed());

        // 3- Sayfa başlığının(title) “Test Otomasyonu” olduğunu doğrulayın.
        String expectedTitleIcerik = "Test Otomasyonu";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitleIcerik));

        // 4- ’Please click for Electronics Products’ linkine tiklayin.
        toPracticePage.electronicsProductsLinki.click();

        // 5- Electronics sayfasinin acildigini test edin.
        String ikinciWhd = "";
        Set<String> windowHandlesDegerleri = Driver.driver.getWindowHandles();
        for (String eachWhd : windowHandlesDegerleri) {
            if (!eachWhd.equals(ilkWhd)) {
                ikinciWhd = eachWhd;
            }
        }
        Driver.getDriver().switchTo().window(ikinciWhd);
        String expectedUrlText = "https://testotomasyonu.com/category/7/products";
        String actualUrlText = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrlText, expectedUrlText);

        // 6- Bulunan urun sayisinin 16 olduğunu test edin.
        String urunSayisiElementiText = toPracticePage.aramaSonucuElementi.getText(); // 16 Products Found
        urunSayisiElementiText = urunSayisiElementiText.replaceAll("\\D", ""); // 16
        int actualUrunSayisi = Integer.parseInt(urunSayisiElementiText); // 16 (int)
        int expectedUrunSayisi = 16;
        Assert.assertEquals(actualUrunSayisi, expectedUrunSayisi);

        // 7- Ilk actiginiz addremove sayfasina donun.
        Driver.getDriver().switchTo().window(ilkWhd);
        ReusableMethods.bekle(2);

        // 8- Url’in addremove icerdigini test edin.
        String expectedUrlIcerik = "addremove";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrlIcerik));
        Driver.quitDriver();
    }
}
