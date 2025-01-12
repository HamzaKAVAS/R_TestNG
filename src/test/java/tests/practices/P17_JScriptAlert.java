package tests.practices;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TOJScriptPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P17_JScriptAlert {

    // 1. Test
    //   - https://testotomasyonu.com/javascriptAlert adresine gidin
    //   - 1.alert'e tiklayin
    //   - Alert'deki yazinin "I am a JS Alert" oldugunu test edin
    //   - OK tusuna basip alert'i kapatin
    // 2.Test
    //   - https://testotomasyonu.com/javascriptAlert adresine gidin
    //   - 2.alert'e tiklayalim
    //   - Cancel'a basip, cikan sonuc yazisinin "You clicked: Cancel" oldugunu test edin
    // 3.Test
    //   - https://testotomasyonu.com/javascriptAlert adresine gidin
    //   - 3.alert'e tiklayalim
    //   - Cikan prompt ekranina "Abdullah" yazdiralim
    //   - OK tusuna basarak alert'i kapatalim
    //   - Cikan sonuc yazisinin Abdullah icerdigini test edelim

    @Test
    public void test01() {
        // 1. Test
        //   - https://testotomasyonu.com/javascriptAlert adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("toJScript"));
        TOJScriptPage tojScriptPage = new TOJScriptPage();

        //   - 1.alert'e tiklayin
        tojScriptPage.jsAlertButonu.click();

        //   - Alert'deki yazinin "I am a JS Alert" oldugunu test edin
        String expectedAlertYazi = "I am a JS Alert";
        String actualAlertYazi = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(actualAlertYazi, expectedAlertYazi);

        //   - OK tusuna basip alert'i kapatin
        Driver.getDriver().switchTo().alert().accept();
        Driver.quitDriver();
    }

    @Test
    public void test02(){
        // 2.Test
        //   - https://testotomasyonu.com/javascriptAlert adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("toJScript"));
        TOJScriptPage tojScriptPage = new TOJScriptPage();

        //   - 2.alert'e tiklayalim
        tojScriptPage.jsConfirmButonu.click();

        //   - Cancel'a basip, cikan sonuc yazisinin "You clicked: Cancel" oldugunu test edin
        Driver.getDriver().switchTo().alert().dismiss();
        String expectedText = "You clicked: Cancel";
        String actualText = tojScriptPage.resultYazisiElementi.getText();
        Assert.assertEquals(actualText,expectedText);
        Driver.quitDriver();
    }

}
