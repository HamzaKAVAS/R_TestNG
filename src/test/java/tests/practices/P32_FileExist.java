package tests.practices;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class P32_FileExist {

    // 1. https://the-internet.herokuapp.com/download adresine gidelim.
    // 2. logo.png dosyasını indirelim
    // 3. Dosyanın başarıyla indirilip indirilmediğini test edelim

    @Test
    public void fileExistTest(){
        // 1. https://the-internet.herokuapp.com/download adresine gidelim.
        Driver.getDriver().get(ConfigReader.getProperty("herOkuDownload"));

        // 2. logo.png dosyasını indirelim
        // 3. Dosyanın başarıyla indirilip indirilmediğini test edelim
        Driver.quitDriver();
    }
}
