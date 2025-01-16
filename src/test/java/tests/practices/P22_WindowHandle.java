package tests.practices;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerOkuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class P22_WindowHandle {

    // 1- https://the-internet.herokuapp.com/windows adresine gidin.
    // 2- Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
    // 3- Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
    // 4- Click Here butonuna basın.
    // 5- Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
    // 6- Sayfadaki textin “New Window” olduğunu doğrulayın.
    // 7- Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.

    @Test
    public void windowHandleHerOkuTesti(){
        // 1- https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get(ConfigReader.getProperty("herOkuWhdUrl"));
        HerOkuPage herOkuPage = new HerOkuPage();
        String ilkWhd = Driver.getDriver().getWindowHandle();

        // 2- Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        String expectedText = "Opening a new window";
        String actualText = herOkuPage.openingANewWindowYaziElementi.getText();
        Assert.assertEquals(actualText,expectedText);

        // 3- Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String expectedTitle = "The Internet";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

        // 4- Click Here butonuna basın.
        herOkuPage.clickHereLinki.click();
        ReusableMethods.bekle(2);

        // 5- Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
        String ikinciWhd = "";
        Set<String> windowHandlesDegerleri = Driver.getDriver().getWindowHandles();
        for (String eachWhd : windowHandlesDegerleri){
            if (!eachWhd.equals(ilkWhd)){
                ikinciWhd = eachWhd;
            }
        }
        Driver.getDriver().switchTo().window(ikinciWhd);
        expectedTitle = "New Window";
        actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

        // 6- Sayfadaki textin “New Window” olduğunu doğrulayın.
        // 7- Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.
        Driver.quitDriver();
    }
}
