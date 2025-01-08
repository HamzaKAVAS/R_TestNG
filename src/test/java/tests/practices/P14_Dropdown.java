package tests.practices;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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
    public void dropDownTesti() {
        // 1. https://testotomasyonu.com/form adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("toForm"));
        TOFormPage toFormPage = new TOFormPage();

        // 2. Dogum tarihi gun seçeneğinden index kullanarak 5’i secin
        Select select1 = new Select(toFormPage.gunDdm);
        select1.selectByIndex(5);

        // 3. Dogum tarihi ay seçeneğinden value kullanarak Nisan’i secin
        Select select2 = new Select(toFormPage.ayDdm);
        select2.selectByValue("nisan");

        // 4. Dogum tarihi yil seçeneğinden visible text kullanarak 1990’i secin
        Select select3 = new Select(toFormPage.yilDdm);
        select3.selectByVisibleText("1990");

        // 5. Secilen değerleri konsolda yazdirin
        System.out.println("Gün: " + select1.getFirstSelectedOption().getText() + "\n" +
                "Ay: " + select2.getFirstSelectedOption().getText() + "\n" +
                "Yıl: " + select3.getFirstSelectedOption().getText());

        // 6. Ay dropdown menüdeki tum değerleri(value) yazdırın
        int sayac = 1;
        for (WebElement each : select2.getOptions()) {
            System.out.println(sayac + ". değer: " + each.getText());
            sayac++;
        }

        // 7. Ay Dropdown menusunun boyutunun 13 olduğunu test edin
        int expectedAyDdmBoyutu = 13;
        int actualAyDdmBoyutu = select2.getOptions().size();
        Assert.assertEquals(actualAyDdmBoyutu, expectedAyDdmBoyutu);
        Driver.quitDriver();
    }
}
