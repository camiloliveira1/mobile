package definitions;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;

public class BaseHappy {

	public static AndroidDriver<WebElement> driver;
	public static String appHappy = "br.com.nextel.happy:id";
	public static String initialApp = "br.com.nextel.happy";
	//public static String initialApp = "br.com.nextel.happy.homolog";
	//public static String appHappy = "br.com.nextel.happy.homolog:id";

	@Before
	public void setUp() throws Exception {

		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability("platformName", "Android");
		capability.setCapability("deviceName", "Android Emulator");
		capability.setCapability("appPackage", initialApp);
		capability.setCapability("appActivity", "br.com.nextel.happy.feature.splash.SplashActivity");
		Thread.currentThread();
		Thread.sleep(5000);
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capability);

		HappyDriverFactory.mobileDrive();
}

	@After
	public void afterTest() {
		driver.closeApp();
	}
}
