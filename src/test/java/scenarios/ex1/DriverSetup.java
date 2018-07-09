package scenarios.ex1;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Ekaterina on 08.07.2018.
 */
public class DriverSetup {
    protected AndroidDriver driver;

    protected final static String REAL_DEVICE ="9b4ff2c47cf3";
    protected final static String EMULATOR = "emulator-5554";

    protected void prepareAndroidNative() throws MalformedURLException { // exception required by java.net.URL
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //mandatory capabilities
        //capabilities.setCapability("device","Android"); // mandatory???????
        capabilities.setCapability("deviceName", EMULATOR);
        capabilities.setCapability("platformName", "Android");

        // path to app
        // Copy the application (.apk), which will become AUT, to the specified location,
// e.g. "resources" folder of the project
        File appDir = new File
                ("src\\main\\resources");
        File app = new File(appDir, "contactmanager.apk");

        //other caps
        capabilities.setCapability("app", app.getAbsolutePath());

        // specific web capabilities
        capabilities.setCapability("browserName", "Chrome");
        //capabilities.setCapability("browserName", "Browser");


// Init driver for local Appium server with capabilities have been set
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }

}
