package tests.practices;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P28_ActionClass {

    // 1- https://www.testotomasyonu.com/ adresine gidin
    // 2- “Kids Wear” menusunun acilmasi icin mouse’u bu menunun ustune getirin
    // 3- “Boys” linkine basin
    // 4- Acilan sayfadaki ilk urunu tiklayin
    // 5- Acilan sayfada urun isminin “Boys Shirt White Color” oldugunu test edin

    @Test
    public void testotomasyonuActionsTest(){
        // 1- https://www.testotomasyonu.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        Actions actions = new Actions(Driver.getDriver());
        TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

        // 2- “Kids Wear” menusunun acilmasi icin mouse’u bu menunun ustune getirin
        actions.moveToElement(testotomasyonuPage.kidsWearElement).perform();
        ReusableMethods.bekle(2);

        // 3- “Boys” linkine basin
        testotomasyonuPage.boysElement.click();

        // 4- Acilan sayfadaki ilk urunu tiklayin
        // 5- Acilan sayfada urun isminin “Boys Shirt White Color” oldugunu test edin
        Driver.quitDriver();
    }
}
