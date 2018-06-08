package pages;

import org.openqa.selenium.By;

import definitions.HappyDriverFactory;

public class CadastroSenha extends HappyDriverFactory {

	public static void inputSenha(String senha) {
		driver.findElement(By.id(appHappy + "/register_password_input")).click();
		driver.getKeyboard().sendKeys(senha);
	}

	public static void eyeLink() {
		driver.findElement(By.id(appHappy + "/text_input_password_toggle")).click();
	}

	public static String getValuePassword() {
		// return
		// driver.findElement(By.id(appHappy+"/register_password_input")).getText();
		return driver.findElementByXPath("//android.widget.EditText[@index='0']").getText();
	}

	public static void bttContinuar() {
		driver.findElement(By.id(appHappy + "/button_continue")).click();
	}

	public static boolean validaTelaSenha() {
		return driver.findElement(By.id(appHappy + "/register_password_input")).isDisplayed();
	}

}
