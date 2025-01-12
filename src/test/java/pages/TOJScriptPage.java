package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TOJScriptPage {

    public TOJScriptPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@*='j-button'])[1]")
    public WebElement jsAlertButonu;

    @FindBy(xpath = "(//*[@*='j-button'])[2]")
    public WebElement jsConfirmButonu;

    @FindBy(xpath = "(//*[@*='j-button'])[3]")
    public WebElement jsPromptButonu;

    @FindBy(id = "result")
    public WebElement resultYazisiElementi;

}
