package tests.day03_TestNGAssertions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ZeroPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class C03_SoftAssert {

    // 1. “http://zero.webappsecurity.com/” Adresine gidin
    // 2. webbappsecurity ana sayafaya gittiginizi dogrulayin
    // 3. Sign in butonuna basin
    // 4. Login kutusuna “username” yazin
    // 5. Password kutusuna “password” yazin
    // 6. Sign in tusuna basin
    // 7. Back tusuna basin
    // 8. Giris yapilabildigini dogrulayin
    // 9. Online banking menusunu tiklayin
    //10. Pay Bills sayfasina gidin
    //11. “Purchase Foreign Currency” tusuna basin
    //12. Currency dropdown menusunun erisilebilir oldugunu dogrulayin
    //13. “Currency” dropdown menusunden Eurozone’u secin
    //14. "Eurozone (euro)" secildigini dogrulayin
    //15. Dropdown menude 16 option bulundugunu dogrulayin.
    //16. Dropdown menude "Canada (dollar)" bulunduğunu dogrulayin
    //17. Sayfayi kapatin

    @Test
    public void zeroWebTesti() {
        // 1. “http://zero.webappsecurity.com/” Adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("zeroUrl"));

        // 2. webbappsecurity ana sayafaya gittiginizi dogrulayin
        SoftAssert softAssert = new SoftAssert();
        String expectedUrlIcerik = ConfigReader.getProperty("zeroUrl");
        String actualUrlIcerik = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrlIcerik, expectedUrlIcerik, "zero sayfasına gidilemedi");

        // 3. Sign in butonuna basin
        ZeroPage zeroPage = new ZeroPage();
        zeroPage.anasayfaSignInButonu.click();

        // 4. Login kutusuna “username” yazin
        zeroPage.usernameKutusu.sendKeys(ConfigReader.getProperty("zeroGecerliUsername"));

        // 5. Password kutusuna “password” yazin
        zeroPage.passwordKutusu.sendKeys(ConfigReader.getProperty("zeroGecerliPassword"));

        // 6. Sign in tusuna basin
        zeroPage.loginPageSignInButonu.click();

        // 7. Back tusuna basin
        Driver.getDriver().navigate().back();

        // 8. Giris yapilabildigini dogrulayin
        softAssert.assertTrue(zeroPage.usernameMenu.isDisplayed(), "Giriş yapılamadı");

        // 9. Online banking menusunu tiklayin
        zeroPage.onlineBankingButonu.click();

        //10. Pay Bills sayfasina gidin
        zeroPage.payBillsButonu.click();

        //11. “Purchase Foreign Currency” tusuna basin
        zeroPage.PurchaseButonu.click();

        //12. Currency dropdown menusunun erisilebilir oldugunu dogrulayin
        softAssert.assertTrue(zeroPage.currencyDdm.isEnabled(), "Currency dropdown menusune erişilemedi");

        //13. “Currency” dropdown menusunden Eurozone’u secin
        Select select = new Select(zeroPage.currencyDdm);
        select.selectByValue("EUR");

        //14. "Eurozone (euro)" secildigini dogrulayin
        String expectedSecim = "Eurozone (euro)";
        String actualSecim = select.getFirstSelectedOption().getText();
        softAssert.assertEquals(actualSecim, expectedSecim, "Dropdown seçimi yanlış");

        //15. Dropdown menude 16 option bulundugunu dogrulayin.
        List<WebElement> dropdownMenuList = select.getOptions();
        int expectedOptions = 16;
        int actualOptions = dropdownMenuList.size();
        softAssert.assertEquals(actualOptions, expectedOptions, "Options sayısı 16 değil");

        //16. Dropdown menude "Canada (dollar)" bulunduğunu dogrulayin
        List<String> optionsYazilariList = ReusableMethods.stringListeyeDonustur(dropdownMenuList);
        String expectedOption = "Canada (dollar)";
        softAssert.assertTrue(optionsYazilariList.contains(expectedOption), "Dropdown canada doları içermiyor");

        //17. Sayfayi kapatin
        softAssert.assertAll();
        Driver.quitDriver();
    }
}
