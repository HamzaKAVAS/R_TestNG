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

    @FindBy(id = "hot-spot")
    public WebElement ciziliAlanElementi;

    @FindBy(xpath = "//*[@*='_blank']")
    public WebElement elementalSeleniumLinki;

    @FindBy(tagName = "h1")
    public WebElement h1tagElement;

    @FindBy(id = "file-upload")
    public WebElement chooseFileButton;

    @FindBy(id = "file-submit")
    public WebElement uploadButton;

    @FindBy(tagName = "h3")
    public WebElement fileUploadedTextElement;

    @FindBy(xpath = "//*[.='pic.jpeg']")
    public WebElement picJpegElement;

}
