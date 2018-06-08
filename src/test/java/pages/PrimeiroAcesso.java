package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import definitions.HappyDriverFactory;

public class PrimeiroAcesso extends HappyDriverFactory {

	public static void jaSouCadastrado() {
		driver.findElement(By.id(appHappy + "/btn_sign_in")).click();
	}

	public static void queroMeCadastrar() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id(appHappy + "/btn_sign_up")).click();
		

	}

}
