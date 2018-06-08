package pages;

import org.openqa.selenium.By;

import definitions.HappyDriverFactory;

public class HomeSemPlanoAtivo extends HappyDriverFactory {

	public static String getTextHome() throws InterruptedException {
		
		String teste =  driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.TextView[@index='0']").getText();
		return teste;
	}
	
	public static boolean bttPlanoVisible() {
		return driver.findElement(By.id (appHappy + "/no_active_plan_button")).isEnabled();
	}
	
	public static void bttEscolherUmPlano () {
		driver.findElement(By.id(appHappy + "/no_active_plan_button")).click();
	}

}