package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "pass")
    public WebElement passwordBox;

    @FindBy(name = "login")
    public WebElement loginButton;

    @FindBy(id = "loginbutton")
    public WebElement nextPageLoginButton;

    @FindBy(xpath = "(//*[@*='button'])[2]")
    public WebElement createNewAccount;

    @FindBy(xpath = "//*[@*='firstname']")
    public WebElement firstNameBox;

    @FindBy(name = "websubmit")
    public WebElement submitButton;
}
