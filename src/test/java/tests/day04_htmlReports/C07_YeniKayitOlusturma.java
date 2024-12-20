package tests.day04_htmlReports;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.EditorPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C07_YeniKayitOlusturma {

    // Farkli datalarla tabloya 5 kayit ekleyip, asagidaki testi yapin.
    // kullanici https://editor.datatables.net/ adresine gider
    // new butonuna basar
    // tum bilgileri girer
    // Create tusuna basar
    // kullanici ilk isim ile arama yapar
    // isim bolumunde isminin oldugunu dogrular

    // First name:
    // Last name:
    // Position:
    // Office:
    // Extension:
    // Start date:
    // Salary:

    @DataProvider
    public static Object[][] kisiKayitProvider() {
        String[][] kisilerArr = { {"Cansu","Altınsoy","QA","Istanbul","Junior","2025-10-11","45000"},
                                  {"Hayri","Koru","QA","Bursa","Senior","2025-08-07","35000"},
                                  {"Serat","Somkan","Scrum Master","Izmir","Junior","2025-06-22","60000"},
                                  {"Lütfu","Beyt","Product Owner","Ankara","Senior","2025-07-25","75000"},
                                  {"Halit","Velid","Business Analyst","Berlin","Prof","2025-01-15","95000"} };
        return kisilerArr;
    }

    @Test(dataProvider = "kisiKayitProvider")
    public void yeniKayitOlusturmaTesti(String firstName, String lastName, String position, String office, String extension, String startDate, String salary){
        // kullanici https://editor.datatables.net/ adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("editorUrl"));

        // new butonuna basar
        EditorPage editorPage = new EditorPage();
        editorPage.newButton.click();

        // tum bilgileri girer
        Actions actions = new Actions(Driver.getDriver());
        ReusableMethods.bekle(2);
        actions.sendKeys(firstName)
                .sendKeys(Keys.TAB)
                .sendKeys(lastName)
                .sendKeys(Keys.TAB)
                .sendKeys(position)
                .sendKeys(Keys.TAB)
                .sendKeys(office)
                .sendKeys(Keys.TAB)
                .sendKeys(extension)
                .sendKeys(Keys.TAB)
                .sendKeys(startDate)
                .sendKeys(Keys.TAB)
                .sendKeys(salary).perform();
        ReusableMethods.bekle(1);

        // Create tusuna basar
        editorPage.createButton.click();

        // kullanici ilk isim ile arama yapar
        editorPage.searchBox.sendKeys(firstName);
        ReusableMethods.bekle(1);

        // isim bolumunde isminin oldugunu dogrular
        String expectedIsim = firstName + " " + lastName;
        String actualIsim = editorPage.nameElement.getText();
        Assert.assertEquals(actualIsim,expectedIsim);
        Driver.quitDriver();
    }
}
