package tests.practices;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P05_CategoryTesti {

    // 1- https://www.automationexercise.com/ adresine gidin
    // 2- Category bolumundeki elementleri locate edin
    // 3- Category bolumunde 3 element oldugunu test edin
    // 4- Category isimlerini yazdirin
    // 5- Sayfayi kapatin

    @Test
    public void categoryTesti() {
        // 1- https://www.automationexercise.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));

        // 2- Category bolumundeki elementleri locate edin
        AutomationPage automationPage = new AutomationPage();

        // 3- Category bolumunde 3 element oldugunu test edin
        int expectedCategoryElement = 3;
        int actualCategoryElement = automationPage.categorySections.size();
        Assert.assertEquals(actualCategoryElement, expectedCategoryElement);

        // 4- Category isimlerini yazdirin
        int sayac = 1;
        for (WebElement eachElement : automationPage.categorySections) {
            System.out.println(sayac + ".ci Element: " + eachElement.getText());
            sayac++;
        }

        // 5- Sayfayi kapatin
        Driver.quitDriver();
    }
}
