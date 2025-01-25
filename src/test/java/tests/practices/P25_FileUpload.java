package tests.practices;

import org.testng.annotations.Test;
import pages.HerOkuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P25_FileUpload {

    // 1. https://the-internet.herokuapp.com/upload adresine gidelim
    // 2. chooseFile butonuna basalim
    // 3. Yuklemek istediginiz dosyayi secelim.
    // 4. Upload butonuna basalim.
    // 5. “File Uploaded!” textinin goruntulendigini test edelim.

    @Test
    public void photoUploadTest(){
        // 1. https://the-internet.herokuapp.com/upload adresine gidelim
        Driver.getDriver().get(ConfigReader.getProperty("herOkuPhotoUploadUrl"));
        HerOkuPage herOkuPage = new HerOkuPage();

        // 2. chooseFile butonuna basalim
        // 3. Yuklemek istediginiz dosyayi secelim.
        String dosyaYolu = System.getProperty("user.home") + "\\Downloads\\shark.png";
        herOkuPage.chooseFileButton.sendKeys(dosyaYolu);
        ReusableMethods.bekle(2);

        // 4. Upload butonuna basalim.
        // 5. “File Uploaded!” textinin goruntulendigini test edelim.
        Driver.quitDriver();
    }
}
