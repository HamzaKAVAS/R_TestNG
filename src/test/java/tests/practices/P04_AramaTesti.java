package tests.practices;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TOPracticePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P04_AramaTesti {

    // 1- https://www.testotomasyonu.com/ adresine gidin
    // 2- arama kutusuna phone yazip aratin
    // 3- Category bolumunde 8 element oldugunu test edin
    // 4- Category isimlerini yazdirin
    // 5- Sayfayi kapatin

    @Test
    public void phoneAramaTesti() {
        // 1- https://www.testotomasyonu.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        // 2- arama kutusuna phone yazip aratin
        TOPracticePage toPracticePage = new TOPracticePage();
        toPracticePage.searchBox.sendKeys("phone" + Keys.ENTER);
        ReusableMethods.bekle(2);

        // 3- Category bolumunde 8 element oldugunu test edin
        int expectedCategoryElementSize = 8;
        int actualCategoryElementSize = toPracticePage.categoryList.size();
        Assert.assertEquals(actualCategoryElementSize, expectedCategoryElementSize);

        // 4- Category isimlerini yazdirin
        int sayac = 1;
        for (WebElement eachElement : toPracticePage.categoryList) {
            System.out.println(sayac + ".Element: " + eachElement.getText());
            sayac++;
        }

        // 5- Sayfayi kapatin
        Driver.quitDriver();
    }
}
