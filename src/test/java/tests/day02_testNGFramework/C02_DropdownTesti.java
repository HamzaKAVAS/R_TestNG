package tests.day02_testNGFramework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestotomasyonuFormPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Set;

public class C02_DropdownTesti {

    // 1- https://testotomasyonu.com/form adresine gidin
    // 2- Dogum tarihi gun seçeneğinden index kullanarak 5’i secin
    // 3- Dogum tarihi ay seçeneğinden value kullanarak Nisan’i secin
    // 4- Dogum tarihi yil seçeneğinden visible text kullanarak 1990’i secin
    // 5- Secilen değerleri konsolda yazdirin
    // 6- Ay dropdown menüdeki tum değerleri(value) yazdırın
    // 7- Ay Dropdown menusunun boyutunun 13 olduğunu test edin

    @Test
    public void testotomasyonuDropdownTest(){
        // 1- https://testotomasyonu.com/form adresine gidin
        Driver.getDriver().get("https://testotomasyonu.com/form");
        TestotomasyonuFormPage testotomasyonuFormPage = new TestotomasyonuFormPage();

        // 2- Dogum tarihi gun seçeneğinden index kullanarak 5’i secin
        Select selectGun = new Select(testotomasyonuFormPage.gunDdmKutusu);
        selectGun.selectByIndex(5);

        // 3- Dogum tarihi ay seçeneğinden value kullanarak Nisan’i secin
        Select selectAy = new Select(testotomasyonuFormPage.ayDdmKutusu);
        selectAy.selectByValue("nisan");

        // 4- Dogum tarihi yil seçeneğinden visible text kullanarak 1990’i secin
        Select selectYil = new Select(testotomasyonuFormPage.yilDdmKutusu);
        selectYil.selectByVisibleText("1990");

        // 5- Secilen değerleri konsolda yazdirin
        System.out.println(selectGun.getFirstSelectedOption().getText() + " " +
                selectAy.getFirstSelectedOption().getText() + " " +
                selectYil.getFirstSelectedOption().getText());

        // 6- Ay dropdown menüdeki tum değerleri(value) yazdırın
        System.out.println(ReusableMethods.stringListeyeDonustur(selectAy.getOptions()));

        // 7- Ay Dropdown menusunun boyutunun 13 olduğunu test edin
        int expectedBoyut = 13;
        int actualBoyut = selectAy.getOptions().size();
        Assert.assertEquals(actualBoyut,expectedBoyut);
        ReusableMethods.bekle(2);
        Driver.quitDriver();
    }
}