package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AutomationPage {

    public AutomationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@*='panel panel-default']")
    public List<WebElement> categorySections;

    @FindBy(tagName = "a")
    public List<WebElement> linkSections;

    @FindBy(xpath = "//*[@*=\"/products\"]")
    public WebElement productsButton;

    @FindBy(id = "sale_image")
    public WebElement specialOfferYaziElementi;
}
