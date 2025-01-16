package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerOkuPage {

    public HerOkuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "dropdown")
    public WebElement optionsDdm;

    @FindBy(tagName = "h3")
    public WebElement h3TagYaziElementi;

    @FindBy(xpath = "//*[.='Click Here']")
    public WebElement clickHereLinki;

}
