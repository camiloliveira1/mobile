package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import definitions.HappyDriverFactory;

public class Login extends HappyDriverFactory {

	public static void userName(String user) {
		driver.findElement(By.id(appHappy + "/login_input_email")).click();
		driver.getKeyboard().sendKeys(user);
	}

	public static void password(String password) {
		driver.findElement(By.id(appHappy + "/login_input_password")).click();
		driver.getKeyboard().sendKeys(password);
	}

	public static void entrar() {
		driver.findElement(By.id(appHappy + "/login_button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
