package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroPracticePage {

    public ZeroPracticePage() {
        PageFactory.initElements(Driver.getDriver(), this);
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

    @FindBy(id = "sp_amount")
    public WebElement amountKutusu;

    @FindBy(id = "sp_date")
    public WebElement dateKutusu;

    @FindBy(id = "pay_saved_payees")
    public WebElement payButton;

    @FindBy(id = "alert_content")
    public WebElement warningText;

    @FindBy(xpath = "//a[.='Purchase Foreign Currency']")
    public WebElement purchaseForeignCurrencyButtonu;

    @FindBy(id = "pc_currency")
    public WebElement currencyDdm;

    @FindBy(id = "pc_amount")
    public WebElement amountKutusuCurrency;

    @FindBy(id = "pc_inDollars_true")
    public WebElement usDollarsRadio;

    @FindBy(id = "pc_inDollars_false")
    public WebElement selectedCurrency;

    @FindBy(id = "pc_calculate_costs")
    public WebElement calculateCostsButonu;

    @FindBy(id = "purchase_cash")
    public WebElement purchaseButonu;

}
