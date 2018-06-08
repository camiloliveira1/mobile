package definitions;

import io.appium.java_client.android.AndroidDriver;

public class HappyDriverFactory {

	protected static AndroidDriver<?> driver = BaseHappy.driver;
	protected static String appHappy = BaseHappy.appHappy;

	public static void mobileDrive() {
		driver = BaseHappy.driver;
	}

}
