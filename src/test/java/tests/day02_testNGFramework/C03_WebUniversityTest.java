package tests.day02_testNGFramework;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebUniversityPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_WebUniversityTest {

    // 1."https://webdriveruniversity.com/" adresine gidin
    // 2."Login Portal" a kadar asagi inin
    // 3."Login Portal" a tiklayin
    // 4.Diger window'a gecin
    // 5."username" ve "password" kutularina deger yazdirin
    // 6."login" butonuna basin
    // 7.Popup'ta cikan yazinin "validation failed" oldugunu test edin
    // 8.Ok diyerek Popup'i kapatin
    // 9.Ilk sayfaya geri donun
    // 10.Ilk sayfaya donuldugunu test edin

    @Test
    public void webUniversityPopupTest(){
        // 1."https://webdriveruniversity.com/" adresine gidin
        Driver.getDriver().get("https://webdriveruniversity.com/");

        // 2."Login Portal" a kadar asagi inin
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        // 3."Login Portal" a tiklayin
        ReusableMethods.bekle(1);
        WebUniversityPage webUniversityPage = new WebUniversityPage();
        webUniversityPage.loginPortalButton.click();

        // 4.Diger window'a gecin
        ReusableMethods.UrlIleWindowDegistir(Driver.getDriver(),"https://webdriveruniversity.com/Login-Portal/index.html");

        // 5."username" ve "password" kutularina deger yazdirin
        Faker faker = new Faker();
        webUniversityPage.usernameBox.sendKeys(faker.name().username());
        webUniversityPage.passwordBox.sendKeys(faker.internet().password());

        // 6."login" butonuna basin
        webUniversityPage.nextLoginButton.click();

        // 7.Popup'ta cikan yazinin "validation failed" oldugunu test edin
        String expectedPopupYazi = "validation failed";
        String actualPopupYazi = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(actualPopupYazi,expectedPopupYazi);

        // 8.Ok diyerek Popup'i kapatin
        Driver.getDriver().switchTo().alert().accept();

        // 9.Ilk sayfaya geri donun
        ReusableMethods.UrlIleWindowDegistir(Driver.getDriver(),"https://webdriveruniversity.com/");

        // 10.Ilk sayfaya donuldugunu test edin
        Assert.assertTrue(webUniversityPage.loginPortalButton.isDisplayed());
        ReusableMethods.bekle(2);
        Driver.quitDriver();
    }
}
