package tests.practices;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TOPracticePage;
import utilities.Driver;

public class P08_Relative {

    // 1- https://testotomasyonu.com/addremove/ adresine gidin
    // 2- Add Element butonuna basin
    // 3- Remove butonu’nun gorunur oldugunu test edin
    // 4- Remove tusuna basin
    // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin

    @Test
    public void relativeTest() {
        // 1- https://testotomasyonu.com/addremove/ adresine gidin
        Driver.getDriver().get("https://testotomasyonu.com/addremove/");
        TOPracticePage toPracticePage = new TOPracticePage();

        // 2- Add Element butonuna basin
        toPracticePage.addElementButonu.click();

        // 3- Remove butonu’nun gorunur oldugunu test edin
        Assert.assertTrue(toPracticePage.removeElementButonu.isDisplayed());

        // 4- Remove tusuna basin
        toPracticePage.removeElementButonu.click();

        // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        Assert.assertTrue(toPracticePage.addRemoveElementsText.isDisplayed());
        Driver.quitDriver();
    }
}
