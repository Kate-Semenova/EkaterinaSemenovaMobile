package setup.ex3.enums;

/**
 * Created by Ekaterina on 04.08.2018.
 */
public enum PropertyFiles {
    COMMON("test.properties"),
    WEB("src/main/resources/webtest.properties"),
    NATIVE("src/main/resources/nativetest.properties");
    public final String path;

    PropertyFiles(String path) {
        this.path = path;
    }
}
