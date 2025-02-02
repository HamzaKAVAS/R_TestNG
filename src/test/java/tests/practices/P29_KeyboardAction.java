package tests.practices;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P29_KeyboardAction {

    // 1- https://www.testotomasyonu.com sayfasina gidelim
    // 2- Arama kutusuna actions method’larini kullanarak “DELL Core I3” yazdirin ve Enter’a basarak arama yaptirin
    // 3- Bulunan urun isminde “DELL Core I3” bulundugunu test edin

    @Test
    public void keyboardActionsTest(){
        // 1- https://www.testotomasyonu.com sayfasina gidelim
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();
        Actions actions = new Actions(Driver.getDriver());

        // 2- Arama kutusuna actions method’larini kullanarak “DELL Core I3” yazdirin ve Enter’a basarak arama yaptirin
        actions.sendKeys(testotomasyonuPage.aramaKutusu)
                .keyDown(Keys.SHIFT)
                .sendKeys("dell")
                .keyDown(Keys.SPACE)
                .keyDown(Keys.SHIFT)
                .sendKeys("c").perform();
        ReusableMethods.bekle(1);

        // 3- Bulunan urun isminde “DELL Core I3” bulundugunu test edin
        Driver.quitDriver();
    }
}
