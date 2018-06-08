package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import definitions.HappyDriverFactory;

public class ChipHappy extends HappyDriverFactory {

	public static boolean validaTelaChipHappy() {
		return driver.findElement(By.id(appHappy + "/happy_addon_item_left_text")).isEnabled();
	}

	public static void precisoDeAjuda() {
		driver.findElement(By.id(appHappy + "/buy_chip_init_need_help_link")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static String gelValorChip() {
		return driver.findElement(By.id(appHappy + "/happy_addon_item_right_bottom_text")).getText();
	}

	public static void receberEmCasa() {
		driver.findElement(By.id(appHappy + "/happy_addon_item_left_text")).click();
	}
}
