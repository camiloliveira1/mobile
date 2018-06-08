package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import definitions.HappyDriverFactory;

public class CarouselCompraPlanos extends HappyDriverFactory {

		public void CarouselContinuar() {
			driver.findElement(By.id(appHappy + "/plan_features_continue_link")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		public void CarouselNext() {
			driver.findElement(By.id(appHappy + "/plan_features_next")).click();
		}

		public void CarouselPrevious() {
			driver.findElement(By.id(appHappy + "/plan_features_previous")).click();
		}

		public void CarouselOKEntendi() {
			driver.findElement(By.id(appHappy + "/plan_features_button")).click();
		}

		public static String getTitleCarrossel () {
			return driver.findElement(By.id(appHappy + "/carousel_item_title")).getText();
		}

	}


