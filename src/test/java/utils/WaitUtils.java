package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    // Utility method to wait for a specific Android activity
	
    public static void waitForActivity(
            WebDriver driver,
            String expectedActivity,
            int timeoutInSeconds) {

        new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds))
                .until(d ->
                        ((AndroidDriver) d)
                                .currentActivity()
                                .equals(expectedActivity));
    }
}










