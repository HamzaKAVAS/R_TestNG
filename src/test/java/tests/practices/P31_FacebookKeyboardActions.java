package tests.practices;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P31_FacebookKeyboardActions {

    // 1. "https://facebook.com" Adresine gidin.
    // 2. “create new account” butonuna basin.
    // 3. “firstName” giris kutusuna bir isim yazin.
    // 4. “surname” giris kutusuna bir soyisim yazin.
    // 5. “email” giris kutusuna bir email yazin.
    // 6. “email” onay kutusuna emaili tekrar yazin.
    // 7. Bir sifre girin.
    // 8. Tarih icin gun secin.
    // 9. Tarih icin ay secin.
    // 10. Tarih icin yil secin.
    // 11. Cinsiyeti secin.
    // 12. Isaretlediginiz cinsiyetin secili, diger cinsiyet kutusunun secili olmadigini test edin.
    // 13. Sayfayi kapatin.

    @Test
    public void facebookActionsTest(){
        // 1. "https://facebook.com" Adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("faceUrl"));
        FacebookPage facebookPage = new FacebookPage();
        Faker faker = new Faker();
        Actions actions = new Actions(Driver.getDriver());

        // 2. “create new account” butonuna basin.
        facebookPage.createNewAccount.click();

        // 3. “firstName” giris kutusuna bir isim yazin.
        ReusableMethods.bekle(1);
        actions.sendKeys(facebookPage.firstNameBox,faker.harryPotter().character() + Keys.TAB).perform();

        // 4. “surname” giris kutusuna bir soyisim yazin.
        actions.sendKeys(faker.name().lastName() + Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();

        // 5. Tarih icin gun secin.
        actions.sendKeys("12" + Keys.TAB).perform();

        // 6. Tarih icin ay secin.
        actions.sendKeys("Haz" + Keys.TAB).perform();

        // 7. Tarih icin yil secin.
        actions.sendKeys("1985" + Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();

        // 8. Cinsiyeti secin.
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        ReusableMethods.bekle(2);

        // 9. “email” giris kutusuna bir email yazin.


        // 10. “email” onay kutusuna emaili tekrar yazin.
        // 11. Bir sifre girin.
        // 12. Kaydol tıklayın.
        // 13. Sayfayi kapatin.
        Driver.quitDriver();
    }
}
