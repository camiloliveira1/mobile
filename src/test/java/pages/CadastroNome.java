package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import definitions.BaseHappy;
import definitions.HappyDriverFactory;
import io.appium.java_client.android.AndroidDriver;

public class CadastroNome extends HappyDriverFactory {

	public static void inputNome(String name) {

		driver.findElement(By.id(appHappy + "/register_name_input")).click();
		driver.getKeyboard().sendKeys(name);
	}

	public static void bttContinuar() {
		driver.findElement(By.id(appHappy + "/button_continue")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public boolean inputError() {

		return driver.findElement(By.id(appHappy + "/textinput_error")).isDisplayed();
	}

	public static boolean erroCampoNome() {
		return driver.findElement(By.id(appHappy + "/textinput_error")).isEnabled();
	}

	public static boolean validaTelaNome() {
		return driver.findElement(By.id(appHappy + "/register_name_input")).isDisplayed();
	}

}
