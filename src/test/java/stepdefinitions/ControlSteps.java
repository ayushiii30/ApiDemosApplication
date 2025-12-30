//package stepdefinitions;
//
//import base.BaseTest;
//import io.appium.java_client.AppiumBy;
//import io.cucumber.java.en.*;
//import utils.WaitUtils;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//import static org.testng.Assert.assertTrue;
//
//public class ControlSteps extends BaseTest {
//
//    WebDriverWait wait;
//
//    @Given("the user launches the ApiDemos application")
//    public void the_user_launches_the_apidemos_application() {
//        // driver initialized in Hooks
//    	wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//
//    }
//
//    // -------------------- Controls Scenarios --------------------
//
//    @When("the user navigates to Views")
//    public void the_user_navigates_to_views() {
//        wait.until(ExpectedConditions.elementToBeClickable(
//                AppiumBy.accessibilityId("Views"))).click();
//    }
//
//    @And("the user opens Controls")
//    public void the_user_opens_controls() {
//
//        // Allow UI to stabilize after clicking Views
//        try { Thread.sleep(1200); } catch (InterruptedException e) {}
//
//        WebElement controls = driver.findElement(
//                AppiumBy.androidUIAutomator(
//                        "new UiScrollable(new UiSelector().scrollable(true))" +
//                        ".scrollIntoView(new UiSelector().text(\"Controls\"));"
//                )
//        );
//        controls.click();
//    }
//
//
//    @And("the user selects Light Theme")
//    public void the_user_selects_light_theme() {
//        wait.until(ExpectedConditions.elementToBeClickable(
//                AppiumBy.accessibilityId("1. Light Theme"))).click();
//    }
//
//    @And("the user selects Dark Theme")
//    public void the_user_selects_dark_theme() {
//        wait.until(ExpectedConditions.elementToBeClickable(
//                AppiumBy.accessibilityId("2. Dark Theme"))).click();
//    }
//
//    @Then("the Controls Light Theme screen should be displayed")
//    public void the_controls_light_theme_screen_should_be_displayed() {
//        boolean isDisplayed = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(
//                        By.id("io.appium.android.apis:id/edit"))).isDisplayed();
//        assertTrue(isDisplayed, "Controls Light Theme screen is NOT displayed");
//    }
//
//    @Then("the Controls Dark Theme screen should be displayed")
//    public void the_controls_dark_theme_screen_should_be_displayed() {
//        boolean isDisplayed = wait.until(
//                ExpectedConditions.visibilityOfElementLocated(
//                        By.id("io.appium.android.apis:id/edit"))).isDisplayed();
//        assertTrue(isDisplayed, "Controls Dark Theme screen is NOT displayed");
//    }
//
//    @And("the user enters text in the input field")
//    public void the_user_enters_text_in_the_input_field() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(
//                By.id("io.appium.android.apis:id/edit"))).sendKeys("Hello Appium");
//    }
//
//    @And("the user selects a checkbox")
//    public void the_user_selects_a_checkbox() {
//        wait.until(ExpectedConditions.elementToBeClickable(
//                By.id("io.appium.android.apis:id/check1"))).click();
//    }
//
//    @And("the user selects a radio button")
//    public void the_user_selects_a_radio_button() {
//        wait.until(ExpectedConditions.elementToBeClickable(
//                By.id("io.appium.android.apis:id/radio1"))).click();
//    }
//
//    @And("the user selects an option from the dropdown")
//    public void the_user_selects_an_option_from_the_dropdown() {
//        wait.until(ExpectedConditions.elementToBeClickable(
//                By.id("io.appium.android.apis:id/spinner1"))).click();
//
//        wait.until(ExpectedConditions.elementToBeClickable(
//                By.xpath("//android.widget.CheckedTextView[@text='Earth']"))).click();
//    }
//
//    // -------------------- Animation / Multiple Properties --------------------
//
//    @When("the user opens Animation")
//    public void the_user_opens_animation() {
//        // Animation is directly on main screen
//        wait.until(ExpectedConditions.elementToBeClickable(
//                AppiumBy.accessibilityId("Animation"))).click();
//    }
//
//    @And("the user selects {string}")
//    public void the_user_selects_animation_option(String option) {
//        // Scroll to the option and click
//        WebElement animationOption = driver.findElement(AppiumBy.androidUIAutomator(
//                "new UiScrollable(new UiSelector().scrollable(true))" +
//                        ".scrollIntoView(new UiSelector().text(\"" + option + "\"));"));
//        animationOption.click();
//    }
//
//    @Then("the Multiple Properties screen should be displayed")
//    public void the_multiple_properties_screen_should_be_displayed() {
//        // Wait for the correct activity to load
//        wait.until(driver -> ((io.appium.java_client.android.AndroidDriver) driver)
//                .currentActivity().equals(".animation.MultiPropertyAnimation"));
//
//        // Wait for Run button to be clickable
//        WebElement runButton = wait.until(
//                ExpectedConditions.elementToBeClickable(
//                        By.id("io.appium.android.apis:id/startButton")));
//        assertTrue(runButton.isDisplayed(), "Multiple Properties screen is NOT displayed");
//    }
//
//    @And("the user performs the animation")
//    public void the_user_performs_the_animation() {
//        // Wait for the Run button
//        WebElement runButton = wait.until(
//                ExpectedConditions.elementToBeClickable(
//                        By.id("io.appium.android.apis:id/startButton")));
//        runButton.click();
//
//        // Optional: wait for animation to complete
//        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
//    }
//    @When("the user opens Graphics")
//    public void the_user_opens_graphics() {
//        wait.until(ExpectedConditions.elementToBeClickable(
//                AppiumBy.accessibilityId("Graphics"))).click();
//    }
//    @And("the user opens Arcs")
//    public void the_user_opens_arcs() {
//        WebElement arcs = driver.findElement(
//                AppiumBy.androidUIAutomator(
//                        "new UiScrollable(new UiSelector().scrollable(true))" +
//                        ".scrollIntoView(new UiSelector().text(\"Arcs\"));"));
//        arcs.click();
//    }
//    @Then("the Arcs screen should be displayed")
//    public void the_arcs_screen_should_be_displayed() {
//        WaitUtils.waitForActivity(driver, ".graphics.Arcs", 10);
//    }
//    
//  
//}
//

package stepdefinitions;

import base.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.*;
import utils.WaitUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertTrue;

public class ControlSteps extends BaseTest {

    WebDriverWait wait;

    // -------------------- Common --------------------

    @Given("the user launches the ApiDemos application")
    public void the_user_launches_the_apidemos_application() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // -------------------- Controls --------------------

    @When("the user navigates to Views")
    public void the_user_navigates_to_views() {
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.accessibilityId("Views"))).click();
    }

    @And("the user opens Controls")
    public void the_user_opens_controls() {
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.accessibilityId("Controls"))).click();
    }

    @And("the user selects Light Theme")
    public void the_user_selects_light_theme() {
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.accessibilityId("1. Light Theme"))).click();
    }

    @And("the user selects Dark Theme")
    public void the_user_selects_dark_theme() {
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.accessibilityId("2. Dark Theme"))).click();
    }

    @Then("the Controls Light Theme screen should be displayed")
    public void the_controls_light_theme_screen_should_be_displayed() {
        assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("io.appium.android.apis:id/edit"))).isDisplayed());
    }

    @Then("the Controls Dark Theme screen should be displayed")
    public void the_controls_dark_theme_screen_should_be_displayed() {
        assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("io.appium.android.apis:id/edit"))).isDisplayed());
    }

    @And("the user enters text in the input field")
    public void the_user_enters_text_in_the_input_field() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("io.appium.android.apis:id/edit"))).sendKeys("Hello Appium");
    }

    @And("the user selects a checkbox")
    public void the_user_selects_a_checkbox() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("io.appium.android.apis:id/check1"))).click();
    }

    @And("the user selects a radio button")
    public void the_user_selects_a_radio_button() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("io.appium.android.apis:id/radio1"))).click();
    }

    @And("the user selects an option from the dropdown")
    public void the_user_selects_an_option_from_the_dropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("io.appium.android.apis:id/spinner1"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//android.widget.CheckedTextView[@text='Earth']"))).click();
    }

    // -------------------- Animation --------------------

    @When("the user opens Animation")
    public void the_user_opens_animation() {
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.accessibilityId("Animation"))).click();
    }

    @And("the user selects {string}")
    public void the_user_selects_option(String optionText) {

        // First try direct click (MOST IMPORTANT)
        try {
            driver.findElement(By.xpath(
                    "//android.widget.TextView[@text='" + optionText + "']"
            )).click();
            return;
        } catch (Exception e) {
            // fallback to scroll
        }

        // Fallback scroll ONLY if not visible
        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector())" +
                ".scrollIntoView(new UiSelector().text(\"" + optionText + "\"))"
        )).click();
    }


    @Then("the Multiple Properties screen should be displayed")
    public void the_multiple_properties_screen_should_be_displayed() {
        WebElement runButton = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("io.appium.android.apis:id/startButton")));
        assertTrue(runButton.isDisplayed());
    }

  @And("the user performs the animation")
  public void the_user_performs_the_animation() {
      // Wait for the Run button
      WebElement runButton = wait.until(
              ExpectedConditions.elementToBeClickable(
                      By.id("io.appium.android.apis:id/startButton")));
      runButton.click();

      // Optional: wait for animation to complete
      try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
  }

    // -------------------- Graphics --------------------

@When("the user opens Graphics")
public void the_user_opens_graphics() {
    wait.until(ExpectedConditions.elementToBeClickable(
            AppiumBy.accessibilityId("Graphics"))).click();
}
@And("the user opens Arcs")
public void the_user_opens_arcs() {
    WebElement arcs = driver.findElement(
            AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true))" +
                    ".scrollIntoView(new UiSelector().text(\"Arcs\"));"));
    arcs.click();
}
@Then("the Arcs screen should be displayed")
public void the_arcs_screen_should_be_displayed() {
    WaitUtils.waitForActivity(driver, ".graphics.Arcs", 10);
}


    // -------------------- Seek Bar (W3C Actions) --------------------

    @Then("the Seek Bar screen should be displayed")
    public void the_seek_bar_screen_should_be_displayed() {
        WebElement seekBar = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.className("android.widget.SeekBar")));
        assertTrue(seekBar.isDisplayed(), "Seek Bar screen not displayed");
    }


    @And("the user moves the slider to 20 percent")
    public void the_user_moves_the_slider_to_20_percent() {

        WebElement seekBar = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.className("android.widget.SeekBar")));

        int startX = seekBar.getLocation().getX();
        int endX = startX + seekBar.getSize().getWidth();
        int yAxis = seekBar.getLocation().getY()
                + (seekBar.getSize().getHeight() / 2);

        int moveToX = startX + (int) ((endX - startX) * 0.20);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence drag = new Sequence(finger, 1);

        drag.addAction(finger.createPointerMove(
                Duration.ZERO,
                PointerInput.Origin.viewport(),
                startX, yAxis));

        drag.addAction(finger.createPointerDown(
                PointerInput.MouseButton.LEFT.asArg()));

        drag.addAction(finger.createPointerMove(
                Duration.ofMillis(600),
                PointerInput.Origin.viewport(),
                moveToX, yAxis));

        drag.addAction(finger.createPointerUp(
                PointerInput.MouseButton.LEFT.asArg()));

        driver.perform(Collections.singletonList(drag));
    }
 // -------------------- OS -> SMS Messaging --------------------

    @And("the user navigates to OS menu")
    public void the_user_navigates_to_os_menu() {
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.accessibilityId("OS"))).click();
    }

    @And("the user opens SMS Messaging screen")
    public void the_user_opens_sms_messaging_screen() {
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.accessibilityId("SMS Messaging"))).click();
    }
    


    @When("the user enters recipient number {string}")
    public void the_user_enters_recipient_number(String number) {

        try {
            Thread.sleep(2000); // needed for ApiDemos SMS screen
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement recipientField = driver.findElement(
            AppiumBy.androidUIAutomator(
                "new UiSelector().className(\"android.widget.EditText\").instance(0)"
            )
        );

        recipientField.sendKeys(number);
    }


    @And("the user enters message body {string}")
    public void the_user_enters_message_body(String message) {

        WebElement messageField = driver.findElement(
            AppiumBy.androidUIAutomator(
                "new UiSelector().className(\"android.widget.EditText\").instance(1)"
            )
        );

        messageField.sendKeys(message);
 }

    @And("the user taps on Send button")
    public void the_user_taps_on_send_button() {

        WebElement sendButton = driver.findElement(
            AppiumBy.androidUIAutomator(
                "new UiSelector().textContains(\"Send\")"
            )
        );

        sendButton.click();
    }

    @Then("the SMS intent should be triggered successfully")
    public void the_sms_intent_should_be_triggered_successfully() {

        Assert.assertTrue(
            driver.findElements(
                AppiumBy.androidUIAutomator("new UiSelector().textContains(\"SMS\")")
            ).size() > 0
        );
    }
    
 // -------------------- NOTIFICATION FLOW --------------------

//    @When("the user opens App menu")
//    public void the_user_opens_app_menu() {
//        wait.until(ExpectedConditions.elementToBeClickable(
//                AppiumBy.accessibilityId("App"))).click();
//    }
//
//    @And("the user opens Notification menu")
//    public void the_user_opens_notification_menu() {
//        wait.until(ExpectedConditions.elementToBeClickable(
//                AppiumBy.accessibilityId("Notification"))).click();
//    }
//
//    @And("the user opens Incoming Message screen")
//    public void the_user_opens_incoming_message_screen() {
//        wait.until(ExpectedConditions.elementToBeClickable(
//                AppiumBy.accessibilityId("IncomingMessage"))).click();
//    }
//
//    // -------------------- SHOW APP NOTIFICATION --------------------
//
//    @And("the user taps on Show App Notification")
//    public void the_user_taps_on_show_app_notification() {
//        wait.until(ExpectedConditions.elementToBeClickable(
//                AppiumBy.androidUIAutomator(
//                        "new UiSelector().text(\"Show App Notification\")"))).click();
//    }
//
//    // -------------------- SHOW INTERSTITIAL NOTIFICATION --------------------
//
//    @And("the user taps on Show Interstitial Notification")
//    public void the_user_taps_on_show_interstitial_notification() {
//        wait.until(ExpectedConditions.elementToBeClickable(
//                AppiumBy.androidUIAutomator(
//                        "new UiSelector().text(\"Show Interstitial Notification\")"))).click();
//    }
//
//    // -------------------- NOTIFICATION PANEL --------------------
//
//    @And("the user opens the notification panel")
//    public void the_user_opens_the_notification_panel() {
//        driver.openNotifications();
//    }
//
//    @And("the user closes the notification panel")
//    public void the_user_closes_the_notification_panel() {
//        driver.pressKey(new KeyEvent(AndroidKey.BACK));
//        driver.pressKey(new KeyEvent(AndroidKey.BACK));
//    }
//
//    // -------------------- VERIFICATION --------------------
//
//    @Then("the application should be in foreground")
//    public void the_application_should_be_in_foreground() {
//        String currentPackage = driver.getCurrentPackage();
//        Assert.assertEquals(currentPackage, "io.appium.android.apis");
//    }
//
//    @Then("the interstitial activity should be displayed")
//    public void the_interstitial_activity_should_be_displayed() {
//        AndroidDriver androidDriver = (AndroidDriver) driver;  // cast to AndroidDriver
//        WebDriverWait wait = new WebDriverWait(androidDriver, Duration.ofSeconds(10));
//
//        try {
//            boolean isActive = wait.until(d -> androidDriver.currentActivity().contains("Interstitial"));
//            Assert.assertTrue(isActive, "Interstitial screen displayed successfully");
//        } catch (Exception e) {
//            Assert.fail("Interstitial screen not displayed");
//        }
//    }
//
//}
 // -------------------- APP MENU NAVIGATION --------------------

    @When("the user opens App menu")
    public void the_user_opens_app_menu() {
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.accessibilityId("App"))).click();
    }

    @And("the user opens Notification menu")
    public void the_user_opens_notification_menu() {
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.accessibilityId("Notification"))).click();
    }

    @And("the user opens Incoming Message screen")
    public void the_user_opens_incoming_message_screen() {
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.accessibilityId("IncomingMessage"))).click();
    }

    // -------------------- SHOW APP NOTIFICATION --------------------

    @And("the user taps on Show App Notification")
    public void the_user_taps_on_show_app_notification() {
        wait.until(ExpectedConditions.elementToBeClickable(
                AppiumBy.androidUIAutomator(
                        "new UiSelector().text(\"Show App Notification\")"))).click();
    }

    

    

    // -------------------- NOTIFICATION PANEL --------------------

    @And("the user opens the notification panel")
    public void the_user_opens_the_notification_panel() {
        driver.openNotifications(); // Only for App Notification scenario
    }

    @And("the user closes the notification panel")
    public void the_user_closes_the_notification_panel() {
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }

    // -------------------- VERIFICATION --------------------

    @Then("the application should be in foreground")
    public void the_application_should_be_in_foreground() {
        String currentPackage = driver.getCurrentPackage();
        Assert.assertEquals(currentPackage, "io.appium.android.apis");
    }


}








