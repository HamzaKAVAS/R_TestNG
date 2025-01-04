package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroPracticePage {

    public ZeroPracticePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
