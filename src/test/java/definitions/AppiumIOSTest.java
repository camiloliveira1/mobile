// package definitions;
//
// import java.net.URL;
// import java.util.ArrayList;
// import java.util.List;
//
// import org.junit.Test;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.remote.DesiredCapabilities;
// import org.openqa.selenium.remote.RemoteWebDriver;
//
// import cucumber.api.java.After;
// import cucumber.api.java.Before;
//
//// 784866c85dc62ea22a55492063a0931ede8c72ea
//
//
// public class AppiumIOSTest {
//
// private WebDriver driver;
//
// private List<Integer> values;
//
// private static final int MINIMUM = 0;
// private static final int MAXIMUM = 10;
//
// @Before
// public void setUp() throws Exception {
//
// DesiredCapabilities capabilities = new DesiredCapabilities();
// capabilities.setCapability("platformName", "ios");
// capabilities.setCapability("deviceName","iOS");
// capabilities.setCapability("udid",
// "784866c85dc62ea22a55492063a0931ede8c72ea");
// capabilities.setCapability("app", "");
//
//
// driver = new RemoteWebDriver( new URL( "http://127.0.0.1:4723/wd/hub" ),
// capabilities );
//
// values = new ArrayList<Integer>();
// }
//
// @After
// public void tearDown() throws Exception {
// driver.quit();
// }
//
//
// @Test
// public void testScriptGoesHere() throws Exception {
//
// System.out.println("Test Output From Within the test");
// System.out.println("Here goes your test script");
//
// }
// }
//
//
