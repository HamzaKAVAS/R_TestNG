package tests.practices;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TOPracticePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P26_ActionClass {

    // 1- https://testotomasyonu.com/droppable adresine gidelim
    // 2- Accept bolumunde “Acceptable” butonunu tutup “Drop Here” kutusunun ustune birakalim
    // 3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin
    // 4- Sayfayi yenileyin
    // 5- “Not Acceptable” butonunu tutup “Drop Here” kutusunun ustune birakalim
    // 6- “Drop Here” yazisinin degismedigini test edin

    @Test
    public void actionDropTest(){
        // 1- https://testotomasyonu.com/droppable adresine gidelim
        Driver.getDriver().get(ConfigReader.getProperty("toDroppableUrl"));
        Actions actions = new Actions(Driver.getDriver());
        TOPracticePage toPracticePage = new TOPracticePage();

        // 2- Accept bolumunde “Acceptable” butonunu tutup “Drop Here” kutusunun ustune birakalim
        actions.dragAndDrop(toPracticePage.acceptableBoxElement,toPracticePage.dropHereBoxElement).perform();
        ReusableMethods.bekle(2);

        // 3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin
        String expectedText = "Dropped!";
        String actualText = toPracticePage.dropHereBoxElement.getText();
        Assert.assertEquals(actualText,expectedText);

        // 4- Sayfayi yenileyin
        Driver.getDriver().navigate().refresh();

        // 5- “Not Acceptable” butonunu tutup “Drop Here” kutusunun ustune birakalim
        // 6- “Drop Here” yazisinin degismedigini test edin
        Driver.quitDriver();
    }
}
