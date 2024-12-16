package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestotomasyonuFormPage {

    public TestotomasyonuFormPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@*='form-control'])[3]")
    public WebElement gunDdmKutusu;

    @FindBy(xpath = "(//*[@*='form-control'])[4]")
    public WebElement ayDdmKutusu;

    @FindBy(xpath = "(//*[@*='form-control'])[5]")
    public WebElement yilDdmKutusu;
}
