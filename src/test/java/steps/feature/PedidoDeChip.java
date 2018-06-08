package steps.feature;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import junit.framework.Assert;
import pages.AjudaCompraDeChip;
import pages.CEP;
import pages.ChipHappy;

public class PedidoDeChip {

	@Quando("^escolho o link 'Preciso de ajuda'$")
	public void escolho_o_link_Preciso_de_ajuda() throws Throwable {
		ChipHappy.precisoDeAjuda();
	}

	@Entao("^vejo a tela 'Ajuda compra de chip'$")
	public void vejo_a_tela_Ajuda_compra_de_chip() throws Throwable {
		Assert.assertEquals("O que está acontecendo?", AjudaCompraDeChip.validaTelaAjudaChip());

	}

	@Entao("^vejo o valor do chip de \"([^\"]*)\"$")
	public void vejo_o_valor_do_chip_de(String valorEsperado) throws Throwable {
		Assert.assertEquals(valorEsperado, ChipHappy.gelValorChip());
	}

	@Quando("^escolho o link 'Receber em casa'$")
	public void escolho_o_link_Receber_em_casa() throws Throwable {
		ChipHappy.receberEmCasa();
	}

	@Entao("^vejo a tela 'Ok, e qual é seu CEP\\?'$")
	public void vejo_a_tela_Ok_e_qual_é_seu_CEP() throws Throwable {
		Assert.assertTrue(CEP.validaTelaCEPChip());
	}

	@Quando("^insiro o CEP \"([^\"]*)\"$")
	public void insiro_o_CEP(String cep) throws Throwable {
		CEP.insertCEP(cep);
	}

	@Quando("^escolho 'Continuar'$")
	public void escolho_Continuar() throws Throwable {
		CEP.bttContinuar();
	}

	@Entao("^vejo o erro \"([^\"]*)\"$")
	public void vejo_o_erro_CEP_inválido(String returError) throws Throwable {
		Assert.assertEquals(returError, CEP.returnError());
	}
	
	@Entao("^vejo a tela `Complete o endereço'$")
	public void vejo_a_tela_Complete_o_endereço() throws Throwable {

	}

}
