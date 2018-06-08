package pages;

import org.openqa.selenium.By;

import definitions.HappyDriverFactory;

public class CadastroEmail extends HappyDriverFactory {

	public static void inputEmail(String email) {
		driver.findElement(By.id(appHappy + "/register_email_input")).click();
		driver.getKeyboard().sendKeys(email);
	}

	public static void bttContinuar() {
		driver.findElement(By.id(appHappy + "/button_continue")).click();
	}

	public static boolean validaTelaEmail() {
		return driver.findElement(By.id(appHappy + "/register_email_input")).isDisplayed();
	}

}