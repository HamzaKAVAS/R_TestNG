package tests.practices;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DemoPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class P19_Iframe {

    // 1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
    // 2) sayfadaki iframe sayısını bulunuz.
    // 3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
    // 4) ilk iframe'den çıkıp ana sayfaya dönünüz
    // 5) ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live-selenium-project.html) tıklayınız

    @Test
    public void demoIframeTest() {
        // 1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("demoIframeUrl"));
        DemoPage demoPage = new DemoPage();

        // 2) sayfadaki iframe sayısını bulunuz.
        System.out.println("Sayfadaki Iframe miktarı: " + demoPage.iframes.size());

        // 3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        Driver.getDriver().switchTo().frame(demoPage.youtubeIframe);
        demoPage.youtubePlayElement.click();

        // 4) ilk iframe'den çıkıp ana sayfaya dönünüz
        Driver.getDriver().switchTo().defaultContent();

        // 5) ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live-selenium-project.html) tıklayınız
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.getDriver().switchTo().frame(demoPage.jMeterIframe);
        demoPage.jMeterLinki.click();
        Driver.quitDriver();
    }
}
