package tests.practices;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

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

        // 2- Accept bolumunde “Acceptable” butonunu tutup “Drop Here” kutusunun ustune birakalim
        // 3- “Drop here” yazisi yerine “Dropped!” oldugunu test edin
        // 4- Sayfayi yenileyin
        // 5- “Not Acceptable” butonunu tutup “Drop Here” kutusunun ustune birakalim
        // 6- “Drop Here” yazisinin degismedigini test edin
        Driver.quitDriver();
    }
}
