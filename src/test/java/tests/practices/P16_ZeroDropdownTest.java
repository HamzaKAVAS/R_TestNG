package tests.practices;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ZeroPracticePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P16_ZeroDropdownTest {

    // 1. http://zero.webappsecurity.com/ Adresine gidin
    // 2. Sign in butonuna basin
    // 3. Login kutusuna “username” yazin
    // 4. Password kutusuna “password” yazin
    // 5. Sign in tusuna basin, back tusuna basarak sayfaya donun
    // 6. Online banking menusunden Pay Bills sayfasina gidin
    // 7. “Purchase Foreign Currency” tusuna basin
    // 8. “Currency” drop down menusunden Eurozone’u secin
    // 9. “amount” kutusuna bir sayi girin
    // 10. “US Dollars” in secilmedigini test edin
    // 11. “Selected currency” butonunu secin
    // 12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
    // 13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini kontrol edin.

    @Test
    public void zeroDropdownTest() {
        // 1. http://zero.webappsecurity.com/ Adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("zeroUrl"));
        ZeroPracticePage zeroPracticePage = new ZeroPracticePage();

        // 2. Sign in butonuna basin
        zeroPracticePage.anasayfaSignInButonu.click();

        // 3. Login kutusuna “username” yazin
        zeroPracticePage.loginKutusu.sendKeys("username");

        // 4. Password kutusuna “password” yazin
        zeroPracticePage.passwordKutusu.sendKeys("password");

        // 5. Sign in tusuna basin, back tusuna basarak sayfaya donun
        zeroPracticePage.signInButonu.click();
        Driver.getDriver().navigate().back();

        // 6. Online banking menusunden Pay Bills sayfasina gidin
        zeroPracticePage.onlineBankingMenuLinki.click();
        zeroPracticePage.payBillsLink.click();

        // 7. “Purchase Foreign Currency” tusuna basin
        zeroPracticePage.purchaseForeignCurrencyButtonu.click();

        // 8. “Currency” drop down menusunden Eurozone’u secin
        Select select = new Select(zeroPracticePage.currencyDdm);
        select.selectByValue("EUR");

        // 9. “amount” kutusuna bir sayi girin
        zeroPracticePage.amountKutusuCurrency.sendKeys("100");

        // 10. “US Dollars” in secilmedigini test edin
        Assert.assertFalse(zeroPracticePage.usDollarsRadio.isSelected());

        // 11. “Selected currency” butonunu secin
        zeroPracticePage.selectedCurrency.click();

        // 12. “Calculate Costs” butonuna basin sonra “purchase” butonuna basin
        zeroPracticePage.calculateCostsButonu.click();
        zeroPracticePage.purchaseButonu.click();

        // 13. “Foreign currency cash was successfully purchased.” yazisinin ciktigini kontrol edin.
        String expectedAlertText = "Foreign currency cash was successfully purchased.";
        String actualAlertText = zeroPracticePage.warningText.getText();
        Assert.assertEquals(actualAlertText, expectedAlertText);
        Driver.quitDriver();
    }
}
