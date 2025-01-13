package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoPage {

    public DemoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//iframe")
    public List<WebElement> iframes;

    @FindBy(xpath = "(//iframe)[1]")
    public WebElement youtubeIframe;

    @FindBy(id = "movie_player")
    public WebElement youtubePlayElement;

    @FindBy(xpath = "//*[@*='http://www.guru99.com/live-selenium-project.html']")
    public WebElement jMeterLinki;

    @FindBy(xpath = "(//iframe)[2]")
    public WebElement jMeterIframe;
}
