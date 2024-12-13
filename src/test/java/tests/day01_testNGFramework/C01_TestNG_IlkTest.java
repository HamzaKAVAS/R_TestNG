package tests.day01_testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01_TestNG_IlkTest {

    @Test
    public void test01() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.testotomasyonu.com");

        // phone için arama yapın
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);

        // arama sonucunda urun bulunabildiğini test edin
        String unExpectedUrun = "0 Products Found";
        WebElement aramaSonucuElementi = driver.findElement(By.className("product-count-text"));
        String actualSonuc = aramaSonucuElementi.getText();
        Assert.assertNotEquals(actualSonuc, unExpectedUrun);
         /*
             JUnit Assertions ile 2 küçük fark var
             1- Class ismi Assertions değil Assert
             2- JUnit'de once expected, sonra actual yazılıyordu
                TestNG'de once actual, sonra expected yazılıyor
         */

        // driver'ı kapatın
        driver.quit();
    }
}
