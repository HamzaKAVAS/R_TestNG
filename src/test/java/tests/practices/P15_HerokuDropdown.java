package tests.practices;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerOkuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P15_HerokuDropdown {

    // 1. https://the-internet.herokuapp.com/dropdown adresine gidin.
    // 2. Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
    // 3. Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
    // 4. Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
    // 5. Tüm dropdown değerleri(value) yazdırın
    // 6. Dropdown’un boyutunun 4 olmadığını test edin

    @Test
    public void herOkuTesti() {
        // 1. https://the-internet.herokuapp.com/dropdown adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("herOkuUrl"));
        HerOkuPage herOkuPage = new HerOkuPage();

        // 2. Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        Select optionSelect = new Select(herOkuPage.optionsDdm);
        optionSelect.selectByIndex(1);
        System.out.println("Seçenek1: " + optionSelect.getFirstSelectedOption().getText());

        // 3. Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
        optionSelect.selectByValue("2");
        System.out.println("Seçenek2: " + optionSelect.getFirstSelectedOption().getText());

        // 4. Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        optionSelect.selectByVisibleText("Option 1");
        System.out.println("Seçenek3: " + optionSelect.getFirstSelectedOption().getText());

        // 5. Tüm dropdown değerleri(value) yazdırın
        int sayac = 1;
        for (WebElement eachOptions : optionSelect.getOptions()) {
            System.out.println(sayac + ".Seçenek: " + eachOptions.getText());
            sayac++;
        }

        // 6. Dropdown’un boyutunun 4 olmadığını test edin
        int unExpectedDdmBoyutu = 4;
        int actualDdmBoyutu = optionSelect.getOptions().size();
        Assert.assertNotEquals(actualDdmBoyutu, unExpectedDdmBoyutu);
        Driver.quitDriver();
    }
}
