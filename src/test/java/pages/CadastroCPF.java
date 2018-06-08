package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import definitions.BaseHappy;
import definitions.HappyDriverFactory;
import io.appium.java_client.android.AndroidDriver;

public class CadastroCPF extends HappyDriverFactory {

	public static void inputCPF(String cpf) {
		driver.findElement(By.id(appHappy + "/register_document_input")).click();
		driver.getKeyboard().sendKeys(cpf);
	}

	public static void bttContinuar() {
		driver.findElement(By.id(appHappy + "/button_continue")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static boolean validaTelaCPF() {
		return driver.findElement(By.id(appHappy + "/register_document_input")).isDisplayed();
	}

	public static String cpfJaCadastrado() {

		return driver.findElement(By.id(appHappy + "/dialog_title")).getText();
	}

	public static String cpfInvalidoCampo() {
		return driver.findElement(By.id(appHappy + "/textinput_error")).getText();
	}

}
