package setup.ex3;

import org.openqa.selenium.remote.CapabilityType;

/**
 * Created by Ekaterina on 04.08.2018.
 */
public interface MyMobileCapabilityType extends CapabilityType {
    /**
     * The path of app.
     */
    String APP_PACKAGE = "appPackage";

    /**
     * The activity of app
     */
    String APP_ACTIVITY = "appActivity";
}
