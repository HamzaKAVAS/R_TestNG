package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestotomasyonuPage {

    @FindBy(id = "global-search")
    public WebElement aramaKutusu;

    @FindBy(className = "product-count-text")
    public WebElement aramaSonucElementi;

    @FindBy(xpath = "(//*[@*='lazy'])[1]")
    public WebElement ilkUrunElementi;

    @FindBy(xpath = "//*[@*=' heading-sm mb-4']")
    public WebElement ilkUrunIsimText;

}
