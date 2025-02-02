package tests.practices;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class P29_KeyboardAction {

    // 1- https://www.testotomasyonu.com sayfasina gidelim
    // 2- Arama kutusuna actions method’larini kullanarak “DELL Core I3” yazdirin ve Enter’a basarak arama yaptirin
    // 3- Bulunan urun isminde “DELL Core I3” bulundugunu test edin

    @Test
    public void keyboardActionsTest(){
        // 1- https://www.testotomasyonu.com sayfasina gidelim
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        // 2- Arama kutusuna actions method’larini kullanarak “DELL Core I3” yazdirin ve Enter’a basarak arama yaptirin
        // 3- Bulunan urun isminde “DELL Core I3” bulundugunu test edin
        Driver.quitDriver();
    }
}
