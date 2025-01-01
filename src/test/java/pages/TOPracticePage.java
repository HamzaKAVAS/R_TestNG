package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TOPracticePage {

    public TOPracticePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "global-search")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@*='panel-list']")
    public List<WebElement> categoryList;


}
