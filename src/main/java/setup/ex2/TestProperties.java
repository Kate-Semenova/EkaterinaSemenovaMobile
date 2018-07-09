package setup.ex2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Ekaterina on 09.07.2018.
 */
public class TestProperties {
    Properties currentProps = new Properties();
    public static String fileName;
    public final static String testProperties = "test.properties";

    Properties getCurrentProps() throws IOException {
        FileInputStream in = new FileInputStream(fileName);
        currentProps.load(in);
//        in = new FileInputStream(testProperties);
        Properties testProps = new Properties();
        testProps.load(TestProperties.class.getClassLoader().getResourceAsStream(testProperties));
        in.close();
        currentProps.putAll(testProps);

        return currentProps;
    }

    protected String getProp(String propKey) throws IOException {
        if(!currentProps.containsKey(propKey)) currentProps = getCurrentProps();
        // "default" form used to handle the absence of parameter
        return currentProps.getProperty(propKey, null);

    }

}
