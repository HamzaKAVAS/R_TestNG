package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TOFormPage {

    public TOFormPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "inlineRadio1")
    public WebElement kadinButtonu;

    @FindBy(id = "inlineRadio2")
    public WebElement erkekButtonu;

    @FindBy(id = "inlineRadio3")
    public WebElement digerButtonu;

    @FindBy(xpath = "//*[.='Kadın']")
    public WebElement kadinTextButton;

    @FindBy(xpath = "//*[.='Erkek']")
    public WebElement erkekTextButton;

    @FindBy(xpath = "//*[.='Diğer']")
    public WebElement digerTextButton;

    @FindBy(xpath = "(//select[@*='form-control'])[1]")
    public WebElement gunDdm;

    @FindBy(xpath = "(//select[@*='form-control'])[2]")
    public WebElement ayDdm;

    @FindBy(xpath = "(//select[@*='form-control'])[3]")
    public WebElement yilDdm;

}
