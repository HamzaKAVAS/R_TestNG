package tests.practices;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerOkuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class P32_FileExist {

    // 1. https://the-internet.herokuapp.com/download adresine gidelim.
    // 2. logo.png dosyasını indirelim
    // 3. Dosyanın başarıyla indirilip indirilmediğini test edelim

    @Test
    public void fileExistTest() {
        // 1. https://the-internet.herokuapp.com/download adresine gidelim.
        Driver.getDriver().get(ConfigReader.getProperty("herOkuDownload"));
        HerOkuPage herOkuPage = new HerOkuPage();

        // 2. logo.png dosyasını indirelim
        herOkuPage.picJpegElement.click();
        ReusableMethods.bekle(3);

        // 3. Dosyanın başarıyla indirilip indirilmediğini test edelim
        String filePath = System.getProperty("user.home") + "\\Downloads\\pic.jpeg";
        Assert.assertTrue(Files.exists(Paths.get(filePath)));
        Driver.quitDriver();
    }
}
