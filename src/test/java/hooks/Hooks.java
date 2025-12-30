//package hooks;
//
//import base.BaseTest;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//
//import java.net.MalformedURLException;
//
//public class Hooks extends BaseTest {
//
//    @Before
//    public void setUp() throws MalformedURLException {
//        initializeDriver(); // driver is static → shared with Steps
//    }
//
//   
//    @After
//    public static void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//
//      
//    
//}
//package hooks;
//
//import base.BaseTest;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//
//import java.net.MalformedURLException;
//
//public class Hooks extends BaseTest {
//
//    @Before
//    public void setUp() throws MalformedURLException {
//        initializeDriver();
//    }
//
//    @After
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}
//package hooks;
//
//import base.BaseTest;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//
//import java.net.MalformedURLException;
//
//public class Hooks extends BaseTest {
//
//    private static final String APP_PACKAGE = "io.appium.android.apis";
//
//    @Before
//    public void setUp() throws MalformedURLException {
//        if (driver == null) {
//            initializeDriver();
//        }
//    }
//
//    @After
//    public void resetAppState() {
//        try {
//            Thread.sleep(1500); // allow UI to settle
//        } catch (InterruptedException e) {}
//
//        driver.terminateApp(APP_PACKAGE);
//        driver.activateApp(APP_PACKAGE);
//    }
//}
//

package hooks;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class Hooks extends BaseTest {
    @Before
    public void setUp() throws MalformedURLException {
        // ALWAYS create a new driver per scenario
        initializeDriver();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
