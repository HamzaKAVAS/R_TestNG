package tests.practices;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P31_FacebookKeyboardActions {

    // 1. "https://facebook.com" Adresine gidin
    // 2. “create new account” butonuna basin
    // 3. “firstName” giris kutusuna bir isim yazin
    // 4. “surname” giris kutusuna bir soyisim yazin
    // 5. “email” giris kutusuna bir email yazin
    // 6. “email” onay kutusuna emaili tekrar yazin
    // 7. Bir sifre girin
    // 8. Tarih icin gun secin
    // 9. Tarih icin ay secin
    // 10. Tarih icin yil secin
    // 11. Cinsiyeti secin
    // 12. Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.
    // 13. Sayfayi kapatin

    @Test
    public void facebookActionsTest(){
        // 1. "https://facebook.com" Adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("faceUrl"));
        FacebookPage facebookPage = new FacebookPage();
        Faker faker = new Faker();

        // 2. “create new account” butonuna basin
        facebookPage.createNewAccount.click();

        // 3. “firstName” giris kutusuna bir isim yazin
        facebookPage.firstNameBox.sendKeys(faker.harryPotter().character());

        // 4. “surname” giris kutusuna bir soyisim yazin
        // 5. “email” giris kutusuna bir email yazin
        // 6. “email” onay kutusuna emaili tekrar yazin
        // 7. Bir sifre girin
        // 8. Tarih icin gun secin
        // 9. Tarih icin ay secin
        // 10. Tarih icin yil secin
        // 11. Cinsiyeti secin
        // 12. Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.
        // 13. Sayfayi kapatin
        Driver.quitDriver();
    }
}
