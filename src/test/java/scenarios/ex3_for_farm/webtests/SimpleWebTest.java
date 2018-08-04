package scenarios.ex3_for_farm.webtests;

import org.testng.annotations.Test;
import setup.ex3.core.Driver;
import setup.ex3.site.po.IANAHomePage;

import java.io.IOException;

/**
 * Created by Ekaterina on 09.07.2018.
 */
@Test(groups = "web")
public class SimpleWebTest extends Driver {
    private IANAHomePage ianaHomePage;
    protected SimpleWebTest() throws IOException {
        super();
    }

    @Test(description = "Open website")
    public void webTest() throws Exception {
        ianaHomePage = new IANAHomePage(driver(), SUT, driverWait());
        ianaHomePage.open();

        //check web Page title and url
        ianaHomePage.checkUrl();
        ianaHomePage.checkTitle();
        System.out.println("Site opening done");

        //check main content
        ianaHomePage.checkMainContent();

        //check search bar
        ianaHomePage.searchForInfo("information");

    }

}


