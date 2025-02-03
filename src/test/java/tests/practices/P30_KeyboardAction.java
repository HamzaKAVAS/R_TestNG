package tests.practices;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P30_KeyboardAction {

    // 1- https://www.testotomasyonu.com adresine gidelim
    // 2- Account linkine tiklayin
    // 3- Sign Up linkine basalim
    // 4- Ad, soyad, mail ve sifre kutularina deger yazalim ve Sign Up butonuna basalim
    // 5- Kaydin olusturuldugunu test edin

    @Test
    public void testOtomasyonuRegisterTest() {
        // 1- https://www.testotomasyonu.com adresine gidelim
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();
        String fakeMail = faker.internet().emailAddress();
        String password = faker.internet().password();

        // 2- Account linkine tiklayin
        testotomasyonuPage.accountlinkButton.click();

        // 3- Sign Up linkine basalim
        testotomasyonuPage.signUpButton.click();

        // 4- Ad, soyad, mail ve sifre kutularina deger yazalim ve Sign Up butonuna basalim
        ReusableMethods.bekle(1);
        actions.sendKeys(testotomasyonuPage.firstNameBoxElement, "Hayri" + Keys.TAB).perform();
        actions.sendKeys("KORU" + Keys.TAB).perform();
        actions.sendKeys(fakeMail + Keys.TAB).perform();
        actions.sendKeys(password + Keys.TAB).perform();
        actions.sendKeys(password + Keys.TAB).perform();
        ReusableMethods.bekle(1);
        testotomasyonuPage.formSignUpButtonElement.click();

        // 5- Kaydin olusturuldugunu test edin
        testotomasyonuPage.emailKutusu.sendKeys(fakeMail);
        testotomasyonuPage.passwordKutusu.sendKeys(password);
        testotomasyonuPage.signInButton.click();
        Assert.assertTrue(testotomasyonuPage.LogoutButton.isDisplayed());
        Driver.quitDriver();
    }
}
