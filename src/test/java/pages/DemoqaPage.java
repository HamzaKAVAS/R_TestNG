package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoqaPage {

    public DemoqaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "draggable")
    public WebElement dragMeBoxElement;

    @FindBy(xpath = "(//*[@*='drop-box ui-droppable'])[1]")
    public WebElement dropHereBoxElement;

    @FindBy(xpath = "//p[.='Dropped!']")
    public WebElement droppedTextElement;
}
