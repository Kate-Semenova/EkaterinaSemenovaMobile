package scenarios.ex2.hooks;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import setup.ex2.Driver;

import java.io.IOException;

/**
 * Created by Ekaterina on 09.07.2018.
 */
@Test(groups = {"native","web"})
public class Hook extends Driver{
    /**
     * Required variables will be initialized by inherited constructor
     * @throws IOException
     */
    Hook() throws IOException {
        super();
    }

    @BeforeSuite(description = "Prepare driver to run test(s)")
    public void setUp() throws Exception {
        prepareDriver();
    }

    @AfterSuite(description = "Close driver on all tests completion")
    public void tearDown() throws Exception {
        driver().quit();
    }
}
