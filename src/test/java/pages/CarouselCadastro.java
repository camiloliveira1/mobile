package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import definitions.HappyDriverFactory;

public class CarouselCadastro extends HappyDriverFactory {

	public void CarouselContinuar() {
		driver.findElement(By.id(appHappy + "/register_features_continue_link")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void CarouselNext() {
		driver.findElement(By.id(appHappy + "/register_features_next")).click();
	}

	public void CarouselPrevious() {
		driver.findElement(By.id(appHappy + "/register_features_previous")).click();
	}

	public void CarouselVamosComecar() {
		driver.findElement(By.id(appHappy + "/register_features_button")).click();
	}

	public boolean validaTelaCarousel() {
		String textoCarousel = driver.findElement(By.id(appHappy + "/carousel_item_title")).getText();
		return textoCarousel.equals("Planos a partir de R$9,99");
	}

}
