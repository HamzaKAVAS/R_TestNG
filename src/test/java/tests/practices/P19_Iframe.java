package tests.practices;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class P19_Iframe {

    // 1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
    // 2) sayfadaki iframe sayısını bulunuz.
    // 3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
    // 4) ilk iframe'den çıkıp ana sayfaya dönünüz
    // 5) ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live-selenium-project.html) tıklayınız

    @Test
    public void demoIframeTest(){
        // 1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("demoIframeUrl"));

        // 2) sayfadaki iframe sayısını bulunuz.
        // 3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        // 4) ilk iframe'den çıkıp ana sayfaya dönünüz
        // 5) ikinci iframe'deki (Jmeter Made Easy) linke (https://www.guru99.com/live-selenium-project.html) tıklayınız
        Driver.quitDriver();
    }
}
