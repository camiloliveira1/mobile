package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import definitions.HappyDriverFactory;

public class CEP extends HappyDriverFactory {

	public static boolean validaTelaCEPChip() {
		return driver.findElement(By.id(appHappy + "/cep_input")).isEnabled();
	}

	public static void insertCEP(String cep) {
		driver.findElement(By.id(appHappy + "/cep_input")).click();
		driver.getKeyboard().sendKeys(cep);
	}

	public static void bttContinuar() {
		driver.findElement(By.id(appHappy + "/button_continue")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static String returnError() {
		String teste = driver.findElement(By.id(appHappy + "/textinput_error")).getText();
		return teste;
	}
}
