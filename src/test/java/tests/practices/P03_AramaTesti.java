package tests.practices;

import org.testng.annotations.Test;
import pages.TOPracticePage;
import utilities.ConfigReader;
import utilities.Driver;

public class P03_AramaTesti {

    // 1- https://www.testotomasyonu.com adresine gidin
    // 2- arama kutusuna “shoe” yazdirin
    // 3- arama islemini yapabilmek icin ENTER tusuna basin

    @Test
    public void aramaTest() {
        // 1- https://www.testotomasyonu.com adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        // 2- arama kutusuna “shoe” yazdirin
        TOPracticePage toPracticePage = new TOPracticePage();
        toPracticePage.searchBox.sendKeys("shoe");

        // 3- arama islemini yapabilmek icin ENTER tusuna basin
        toPracticePage.searchBox.submit();
        Driver.quitDriver();
    }
}
