package tests.practices;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

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
    public void zeroDropdownTest(){
        // 1. http://zero.webappsecurity.com/ Adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("zeroUrl"));

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
        Driver.quitDriver();
    }
}
