package pages;

import definitions.HappyDriverFactory;

public class AjudaCompraDeChip extends HappyDriverFactory {

	public static String validaTelaAjudaChip() {
		return driver.findElementByXPath("//android.widget.TextView[@index='1']").getText();
	}

}
// camilo.oliveira+17
// saldo
// prod
