//
//package base;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.options.UiAutomator2Options;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.time.Duration;
//
//public class BaseTest {
//    // Keep static so Hooks + Steps share the driver
//    protected static AndroidDriver driver;
//
//    public void initializeDriver() throws MalformedURLException {
//        UiAutomator2Options options = new UiAutomator2Options();
//        options.setPlatformName("Android");
//        options.setDeviceName("emulator-5554");
//        options.setAutomationName("UiAutomator2");
//        options.setAppPackage("io.appium.android.apis");
//        options.setAppActivity(".ApiDemos");
//
//        URL url = new URL("http://127.0.0.1:4723");
//        driver = new AndroidDriver(url, options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }
//
//    public void quitDriver() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}

package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected static AndroidDriver driver;

    public void initializeDriver() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("emulator-5554");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("io.appium.android.apis");
        options.setAppActivity(".ApiDemos");
        options.setNoReset(false);

        URL url = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver(url, options);
    }
}












