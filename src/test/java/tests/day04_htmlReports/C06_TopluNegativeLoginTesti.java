package tests.day04_htmlReports;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C06_TopluNegativeLoginTesti {

    // 1- https://www.testotomasyonu.com/ anasayfasina gidin
    // 2- account linkine basin
    // 3- asagidaki listede verilen email ve sifreleri yazin
    // 4- Login butonuna basarak login olmayi deneyin
    // 5- Basarili olarak giris yapilamadigini test edin
    // 6- anil@hotmail.com  13579

    @DataProvider
    public static Object[][] loginProvider() {
        String[][] emailPassword = {{"anil@hotmail.com", "13579"}, {"hmzkavas@hotmail.com", "12558"}, {"oznur@yahoo.com", "45698a"}};
        return emailPassword;
    }

    @Test(dataProvider = "loginProvider")
    public void negatifLoginTesti(String verilenEmail, String verilenSifre) {
        // 1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        // 2- account linkine basin
        TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();
        testotomasyonuPage.accountlinkButton.click();

        // 3- asagidaki listede verilen email ve sifreleri yazin
        testotomasyonuPage.emailKutusu.sendKeys(verilenEmail);
        testotomasyonuPage.passwordKutusu.sendKeys(verilenSifre);

        // 4- Login butonuna basarak login olmayi deneyin
        testotomasyonuPage.signInButton.click();

        // 5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(testotomasyonuPage.emailKutusu.isDisplayed());
        Driver.quitDriver();
    }
}
