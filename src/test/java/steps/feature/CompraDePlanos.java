package steps.feature;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import junit.framework.Assert;
import pages.CarouselCompraPlanos;
import pages.HomeSemPlanoAtivo;

public class CompraDePlanos {
	
	@Quando("^vejo a tela de home \"([^\"]*)\"$")
	public void vejo_a_tela_de_home(String tituloTelaHome) throws Throwable {
	    Assert.assertTrue(HomeSemPlanoAtivo.bttPlanoVisible());
	}

	@Quando("^escolho `Escolher um plano`$")
	public void escolho_Escolher_um_plano() throws Throwable {
		HomeSemPlanoAtivo.bttEscolherUmPlano();
	}

	@Entao("^vejo o `Carrossel de planos`$")
	public void vejo_o_Carrossel_de_planos() throws Throwable {
		Assert.assertEquals("Minutos ilimitados para todo Brasil", CarouselCompraPlanos.getTitleCarrossel());
	}
}
