package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorPage {

    public EditorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@*='button'])[1]")
    public WebElement newButton;

    @FindBy(xpath = "//*[@*='btn']")
    public WebElement createButton;

    @FindBy(xpath = "//*[@*='search']")
    public WebElement searchBox;

    @FindBy(className = "sorting_1")
    public WebElement nameElement;
}
