package tests.practices;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.TOFormPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P14_Dropdown {

    // 1. https://testotomasyonu.com/form adresine gidin.
    // 2. Dogum tarihi gun seçeneğinden index kullanarak 5’i secin
    // 3. Dogum tarihi ay seçeneğinden value kullanarak Nisan’i secin
    // 4. Dogum tarihi yil seçeneğinden visible text kullanarak 1990’i secin
    // 5. Secilen değerleri konsolda yazdirin
    // 6. Ay dropdown menüdeki tum değerleri(value) yazdırın
    // 7. Ay Dropdown menusunun boyutunun 13 olduğunu test edin

    @Test
    public void dropDownTesti(){
        // 1. https://testotomasyonu.com/form adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("toForm"));
        TOFormPage toFormPage = new TOFormPage();

        // 2. Dogum tarihi gun seçeneğinden index kullanarak 5’i secin
        Select select = new Select(toFormPage.gunDdm);
        select.selectByIndex(5);

        // 3. Dogum tarihi ay seçeneğinden value kullanarak Nisan’i secin
        select = new Select(toFormPage.ayDdm);
        select.selectByValue("nisan");

        // 4. Dogum tarihi yil seçeneğinden visible text kullanarak 1990’i secin
        select = new Select(toFormPage.yilDdm);
        select.selectByVisibleText("1990");

        // 5. Secilen değerleri konsolda yazdirin
        // 6. Ay dropdown menüdeki tum değerleri(value) yazdırın
        // 7. Ay Dropdown menusunun boyutunun 13 olduğunu test edin

        Driver.quitDriver();
    }
}
