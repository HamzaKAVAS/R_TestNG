package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroPage {

    public ZeroPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "signin_button")
    public WebElement anasayfaSignInButonu;

    @FindBy(id = "user_login")
    public WebElement usernameKutusu;

    @FindBy(id = "user_password")
    public WebElement passwordKutusu;

    @FindBy(name = "submit")
    public WebElement loginPageSignInButonu;

    @FindBy(partialLinkText = "username")
    public WebElement usernameMenu;

    @FindBy(id = "onlineBankingMenu")
    public WebElement onlineBankingButonu;

    @FindBy(id = "pay_bills_link")
    public WebElement payBillsButonu;

    @FindBy(xpath = "//a[.='Purchase Foreign Currency']")
    public WebElement PurchaseButonu;

    @FindBy(id = "pc_currency")
    public WebElement currencyDdm;

}
