package tests.day05_crossBrowserCalistirilacakTestler;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import utilities.TestBaseCross;

public class C04_KullaniciOlusturmaTesti extends TestBaseCross {

    // testotomasyonu anasayfaya gidin
    // account linkine basin
    // sign-up linkine tıklayın
    // Formdaki bilgileri fake değerlerle doldurun
    // sign-up butonuna basın

    // Kayıt oluşturulduğunu test edin
    // kayıt oluşturunca bizi login sayfasına yönlendiriyor
    // kayıt olustuğunu test etmek için
    // kullandığımız fake email ve şifre ile giriş yapın
    // giriş yapabildiğimizi test edelim

    // Basarili olarak giris yapilabildigini test edin

    @Test
    public void kullaniciOlusturmaTesti() {
        // testotomasyonu anasayfaya gidin
        driver.get(ConfigReader.getProperty("toUrl"));

        // account linkine basin
        driver.findElement(By.xpath("(//*[.='Account'])[1]")).click();

        // sign-up linkine tıklayın
        driver.findElement(By.xpath("//a[@*='sign-up ']")).click();

        // Formdaki bilgileri fake değerlerle doldurun
        WebElement firstNameKutusu = driver.findElement(By.id("firstName"));
        Faker faker = new Faker();
        Actions actions = new Actions(driver);
        String emailAdress = faker.internet().emailAddress();
        String password = faker.internet().password();
        actions.click(firstNameKutusu)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(emailAdress)
                .sendKeys(Keys.TAB)
                .sendKeys(password)
                .sendKeys(Keys.TAB)
                .sendKeys(password).perform();
        ReusableMethods.bekle(2);

        // sign-up butonuna basın
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        driver.findElement(By.id("btn-submit-form")).click();
        ReusableMethods.bekle(2);

        // Kayıt oluşturulduğunu test edin
        // kayıt oluşturunca bizi login sayfasına yönlendiriyor
        // kayıt olustuğunu test etmek için
        // kullandığımız fake email ve şifre ile giriş yapın
        // giriş yapabildiğimizi test edelim
        WebElement emailKutusu = driver.findElement(By.id("email"));
        WebElement passwordKutusu = driver.findElement(By.id("password"));
        WebElement signInButonu = driver.findElement(By.id("submitlogin"));
        emailKutusu.sendKeys(emailAdress);
        passwordKutusu.sendKeys(password);
        signInButonu.click();
        ReusableMethods.bekle(2);

        // Basarili olarak giris yapilabildigini test edin
        WebElement logoutButonu = driver.findElement(By.xpath("//span[.='Logout']"));
        Assert.assertTrue(logoutButonu.isDisplayed());
        logoutButonu.click();
        ReusableMethods.bekle(2);
        driver.quit();
    }
}
