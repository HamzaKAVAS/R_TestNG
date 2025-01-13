package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoPage {

    public DemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
