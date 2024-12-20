package tests.day05_crossBrowserCalistirilacakTestler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import utilities.TestBaseCross;

public class C01_PositiveLoginTesti extends TestBaseCross {

    // 1- https://www.testotomasyonu.com/ anasayfasina gidin
    // 2- account linkine basin
    // 3- Kullanici email'i olarak gecerli email girin
    // 4- Kullanici sifresi olarak gecerli password girin
    // 5- Login butonuna basarak login olun
    // 6- Basarili olarak giris yapilabildigini test edin

    @Test
    public void positiveLoginTesti() {
        // 1- https://www.testotomasyonu.com/ anasayfasina gidin
        driver.get(ConfigReader.getProperty("toUrl"));

        // 2- account linkine basin
        driver.findElement(By.xpath("(//*[.='Account'])[1]")).click();

        // 3- Kullanici email'i olarak gecerli email girin
        WebElement emailBox = driver.findElement(By.id("email"));
        emailBox.sendKeys(ConfigReader.getProperty("toGecerliEmail"));

        // 4- Kullanici sifresi olarak gecerli password girin
        WebElement passwordBox = driver.findElement(By.id("password"));
        passwordBox.sendKeys(ConfigReader.getProperty("toGecerliPassword"));

        // 5- Login butonuna basarak login olun
        WebElement signInButtonElement = driver.findElement(By.id("submitlogin"));
        signInButtonElement.click();
        ReusableMethods.bekle(2);

        // 6- Basarili olarak giris yapilabildigini test edin
        WebElement logoutButonu = driver.findElement(By.xpath("//span[.='Logout']"));
        Assert.assertTrue(logoutButonu.isDisplayed());
        driver.quit();
    }
}
