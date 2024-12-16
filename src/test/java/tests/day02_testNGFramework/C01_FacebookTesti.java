package tests.day02_testNGFramework;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPages;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_FacebookTesti {

    // 1- https://www.facebook.com/ adresine gidin
    // 2- Cookies cikiyorsa kabul edin
    // 3- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
    // 4- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
    // 5- Basarili giris yapilamadigini test edin

    @Test
    public void negativeFacebookLoginTesti() {
        // 1- https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");

        // 2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
              // **** FacebookPages'da locate yapıldı ****

        // 3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        FacebookPages facebookPages = new FacebookPages();
        Faker faker = new Faker();
        facebookPages.emailBox.sendKeys(faker.internet().emailAddress());
        facebookPages.passwordBox.sendKeys(faker.internet().password());
        facebookPages.loginButton.click();

        // 4- Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPages.nextPageLoginButton.isDisplayed());
        ReusableMethods.bekle(2);
        Driver.quitDriver();
    }
}
