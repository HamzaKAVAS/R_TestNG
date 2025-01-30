package tests.practices;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P27_ActionsClass {

    // 1- https://demoqa.com/droppable adresine gidelim
    // 2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
    // 3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin

    @Test
    public void demoqaActionsTest(){
        // 1- https://demoqa.com/droppable adresine gidelim
        Driver.getDriver().get(ConfigReader.getProperty("demoqaDroppableUrl"));
        DemoqaPage demoqaPage = new DemoqaPage();
        Actions actions = new Actions(Driver.getDriver());

        // 2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
        actions.dragAndDrop(demoqaPage.dragMeBoxElement,demoqaPage.dropHereBoxElement).perform();
        ReusableMethods.bekle(1);

        // 3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin


        Driver.quitDriver();
    }
}
