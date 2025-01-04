package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroPracticePage {

    public ZeroPracticePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "signin_button")
    public WebElement anasayfaSignInButonu;

    @FindBy(id = "user_login")
    public WebElement loginKutusu;

    @FindBy(id = "user_password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//*[@*='btn btn-primary']")
    public WebElement signInButonu;

    @FindBy(id = "onlineBankingMenu")
    public WebElement onlineBankingMenuLinki;

    @FindBy(id = "pay_bills_link")
    public WebElement payBillsLink;

}
