package tests.practices;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TOFormPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P13_RadioButtons {

    // a. Verilen web sayfasına gidin https://testotomasyonu.com/form
    // b. Cinsiyet Radio button elementlerini locate edin
    // c. Iki farkli test method’u oluşturup yazidan veya direk buton’dan size uygun olani secin
    // d. Sectiginiz radio button’un seçili, ötekilerin seçili olmadigini test edin

    @Test
    public void radioButtonsTest() {
        // a. Verilen web sayfasına gidin https://testotomasyonu.com/form
        Driver.getDriver().get(ConfigReader.getProperty("toForm"));

        // b. Cinsiyet Radio button elementlerini locate edin
        TOFormPage toFormPage = new TOFormPage();

        // c. Iki farkli test method’u oluşturup yazidan veya direk buton’dan size uygun olani secin
        toFormPage.erkekButtonu.click();

        // d. Sectiginiz radio button’un seçili, ötekilerin seçili olmadigini test edin
        Assert.assertTrue(toFormPage.erkekButtonu.isSelected());
        Assert.assertFalse(toFormPage.kadinButtonu.isSelected());
        Assert.assertFalse(toFormPage.digerButtonu.isSelected());
        Driver.quitDriver();
    }
}
