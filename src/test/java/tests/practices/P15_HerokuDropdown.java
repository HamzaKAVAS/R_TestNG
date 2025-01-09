package tests.practices;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class P15_HerokuDropdown {

    // 1. https://the-internet.herokuapp.com/dropdown adresine gidin.
    // 2. Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
    // 3. Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
    // 4. Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
    // 5. Tüm dropdown değerleri(value) yazdırın
    // 6. Dropdown’un boyutunun 4 olduğunu test edin

    @Test
    public void herOkuTesti(){
        // 1. https://the-internet.herokuapp.com/dropdown adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("herOkuUrl"));

        // 2. Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        // 3. Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
        // 4. Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
        // 5. Tüm dropdown değerleri(value) yazdırın
        // 6. Dropdown’un boyutunun 4 olduğunu test edin
        Driver.quitDriver();
    }
}
