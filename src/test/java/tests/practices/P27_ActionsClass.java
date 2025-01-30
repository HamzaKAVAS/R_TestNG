package tests.practices;

import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P27_ActionsClass {

    // 1- https://demoqa.com/droppable adresine gidelim
    // 2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
    // 3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin

    @Test
    public void demoqaActionsTest(){
        // 1- https://demoqa.com/droppable adresine gidelim
        Driver.getDriver().get(ConfigReader.getProperty("demoqaDroppableUrl"));
        DemoqaPage demoqaPage = new DemoqaPage();

        // 2- “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim


        // 3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin
        Driver.quitDriver();
    }
}
