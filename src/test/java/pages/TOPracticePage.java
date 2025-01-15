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

    @FindBy(className = "product-count-text")
    public WebElement aramaSonucuElementi;

    @FindBy(xpath = "(//*[@*='lazy'])[1]")
    public WebElement ilkUrunResmiElementi;

    @FindBy(xpath = "//*[@*=' heading-sm mb-4']")
    public WebElement ilkUrunTextElementi;

    @FindBy(id = "sub-btn")
    public WebElement addElementButonu;

    @FindBy(className = "remove-btn")
    public WebElement removeElementButonu;

    @FindBy(tagName = "h2")
    public WebElement addRemoveElementsText;

    @FindBy(xpath = "(//a[.='Furniture'])[3]")
    public WebElement furnitureLink;

    @FindBy(xpath = "//*[@*='form-control minPrice']")
    public WebElement filtrelemeMinKutusu;

    @FindBy(xpath = "//*[@*='form-control maxPrice']")
    public WebElement filtrelemeMaxKutusu;

    @FindBy(className = "price-range-button")
    public WebElement filterPriceButonu;

    @FindBy(id = "priceproduct")
    public WebElement ilkUrunuTikladigindaUrunFiyatiYazisi;

    @FindBy(xpath = "//*[.='Basic Auth']")
    public WebElement basicAuthYaziElementi;

    @FindBy(xpath = "//*[.='Electronics Products']")
    public WebElement electronicsProductsLinki;

}
