package tests.practices;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class P10_ZeroTest {

    // 1. http://zero.webappsecurity.com sayfasina gidin
    // 2. Signin buttonuna tiklayin
    // 3. Login alanine “username” yazdirin
    // 4. Password alanina “password” yazdirin
    // 5. Sign in buttonuna tiklayin
    // 6. Back tusu ile sayfaya donun
    // 7. Online Banking menusunden Pay Bills sayfasina gidin
    // 8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
    // 9. tarih kismina “2023-09-10” yazdirin
    // 10. Pay buttonuna tiklayin
    // 11. “The payment was successfully submitted.” mesajinin ciktigini test edin

    @Test
    public void zeroTesti(){
        // 1. http://zero.webappsecurity.com sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("zeroUrl"));

        // 2. Signin buttonuna tiklayin
        // 3. Login alanine “username” yazdirin
        // 4. Password alanina “password” yazdirin
        // 5. Sign in buttonuna tiklayin
        // 6. Back tusu ile sayfaya donun
        // 7. Online Banking menusunden Pay Bills sayfasina gidin
        // 8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        // 9. tarih kismina “2023-09-10” yazdirin
        // 10. Pay buttonuna tiklayin
        // 11. “The payment was successfully submitted.” mesajinin ciktigini test edin

        Driver.quitDriver();
    }
}
