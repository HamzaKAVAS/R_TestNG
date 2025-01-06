package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SauceDemoPage {

    public SauceDemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user-name")
    public WebElement sauceUsernameKutusu;

    @FindBy(id = "password")
    public WebElement saucePasswordKutusu;

    @FindBy(id = "login-button")
    public WebElement sauceAnasayfaLoginButonu;



}
