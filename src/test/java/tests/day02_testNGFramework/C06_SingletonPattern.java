package tests.day02_testNGFramework;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C06_SingletonPattern {

    @Test
    public void testing(){

        // testotomasyonu anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        //Driver driver = new Driver();
        //driver.driver.get(ConfigReader.getProperty("toUrl"));
        //Driver.driver.get(ConfigReader.getProperty("toUrl"));

        ReusableMethods.bekle(1);
        Driver.quitDriver();
    }
}
