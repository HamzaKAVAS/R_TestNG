package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestotomasyonuPage {

    public TestotomasyonuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "global-search")
    public WebElement aramaKutusu;

    @FindBy(className = "product-count-text")
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "(//*[@*='lazy'])[1]")
    public WebElement ilkUrunElementi;

    @FindBy(xpath = "//*[@*=' heading-sm mb-4']")
    public WebElement ilkUrunIsimText;

    @FindBy(xpath = "(//*[@*='menu-icon-text'])[1]")
    public WebElement accountlinkButton;

    @FindBy(id = "email")
    public WebElement emailKutusu;

    @FindBy(id = "password")
    public WebElement passwordKutusu;

    @FindBy(id = "submitlogin")
    public WebElement signInButton;

    @FindBy(xpath = "//span[.='Logout']")
    public WebElement LogoutButton;

    @FindBy(xpath = "//a[@*='sign-up ']")
    public WebElement signUpButton;

    @FindBy(xpath = "(//a[.='Kids Wear'])[3]")
    public WebElement kidsWearElement;

    @FindBy(xpath = "//*[.='Boys']")
    public WebElement boysElement;

    @FindBy(xpath = "//*[.='Boys Shirt White Color']")
    public WebElement firstElement;

    @FindBy(xpath = "//*[@*=' heading-sm mb-4']")
    public WebElement firstTextElement;

    @FindBy(xpath = "//*[@*='prod-title mb-3 ']")
    public WebElement dellCoreI3FirstElement;
}
