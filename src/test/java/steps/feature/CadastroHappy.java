package steps.feature;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.CadastroCPF;
import pages.CadastroEmail;
import pages.CadastroNome;
import pages.CadastroSenha;
import pages.ChipHappy;
import pages.PrimeiroAcesso;

public class CadastroHappy {

	@Dado("^que não tenho cadastro no Happy$")
	public void que_não_tenho_cadastro_no_Happy() throws Throwable {

	}

	@Dado("^informo o Nome \"([^\"]*)\"$")
	public void informo_o_Nome(String nome) throws Throwable {
		CadastroNome.inputNome(nome);
		CadastroNome.bttContinuar();
	}

	@Dado("^escolho Quero me cadastrar$")
	public void escolho_Quero_me_cadastrar() throws Throwable {
		PrimeiroAcesso.queroMeCadastrar();
	}

	@Quando("^escolho a opcao Quero me cadastrar$")
	public void escolho__opcao_Quero_me_cadastrar() throws Throwable {
		PrimeiroAcesso.queroMeCadastrar();
	}

	@Dado("^vejo a tela Cadastro de nome$")
	public void vejo_a_tela_Cadastro_de_nome() throws Throwable {
		CadastroNome.validaTelaNome();
	}

	@Dado("^vejo a tela Cadastro de CPF$")
	public void E_vejo_a_tela_Cadastro_de_CPF() throws Throwable {
		Assert.assertTrue(CadastroCPF.validaTelaCPF());
	}

	@Quando("^preencho o campo `Nome completo` \"([^\"]*)\"$")
	public void preencho_o_campo_Nome_completo(String nome) throws Throwable {
		CadastroNome.inputNome(nome);
	}

	@Quando("^escolho Continuar$")
	public void escolho_Continuar() throws Throwable {
		CadastroNome.bttContinuar();
	}

	@Quando("^preencho o campo `CPF`\"([^\"]*)\"$")
	public void preencho_o_campo_CPF(String cpf) throws Throwable {
		CadastroCPF.inputCPF(cpf);
	}

	@Quando("^deixo o campo `Nome completo` em branco$")
	public void deixo_o_campo_Nome_completo_em_branco() throws Throwable {

	}

	@Entao("^vejo a tela de cadastro de Nome$")
	public void vejo_a_tela_de_cadastro_de_Nome() throws Throwable {
		Assert.assertTrue(CadastroNome.validaTelaNome());
	}

	@Entao("^vejo a tela Cadastro de CPF'$")
	public void vejo_a_tela_Cadastro_de_CPF() throws Throwable {
		Assert.assertTrue(CadastroCPF.validaTelaCPF());
	}

	@Entao("^vejo a tela Cadastro de e-mail'$")
	public void vejo_a_tela_Cadastro_de_e_mail() throws Throwable {
		Assert.assertTrue(CadastroEmail.validaTelaEmail());
	}

	@Dado("^informo o `CPF` \"([^\"]*)\"$")
	public void informo_o_CPF(String cpf) throws Throwable {
		CadastroCPF.inputCPF(cpf);
		CadastroNome.bttContinuar();
	}

	@Dado("^vejo a tela Cadastro de E-mail$")
	public void vejo_a_tela_Cadastro_de_E_mail() throws Throwable {
		CadastroEmail.validaTelaEmail();
	}

	@Quando("^preencho o campo `E-mail` com o valor \"([^\"]*)\"$")
	public void preencho_o_campo_E_mail_com_o_valor(String email) throws Throwable {
		CadastroEmail.inputEmail(email);
	}

	@Quando("^escolho o link `Olho` para ver a senha$")
	public void escolho_o_link_Olho_para_ver_a_senha() throws Throwable {
		CadastroSenha.eyeLink();
	}

	@Entao("^vejo a tela Cadastro de senha'$")
	public void vejo_a_tela_Cadastro_de_senha() throws Throwable {
		Assert.assertTrue(CadastroSenha.validaTelaSenha());

	}

	@Dado("^informo o e-mail \"([^\"]*)\"$")
	public void informo_o_e_mail(String email) throws Throwable {
		CadastroEmail.inputEmail(email);
		CadastroNome.bttContinuar();
	}

	@Dado("^vejo a tela Cadastro de senha$")
	public void E_vejo_a_tela_Cadastro_de_senha() throws Throwable {
		CadastroSenha.validaTelaSenha();

	}

	@Quando("^preencho o campo 'Senha' \"([^\"]*)\"$")
	public void preencho_o_campo_Senha(String senha) throws Throwable {
		CadastroSenha.inputSenha(senha);
	}

	@Entao("^vejo a mensagem de erro \"([^\"]*)\"$")
	public void vejo_a_mensagem_de_erro(String arg1) throws Throwable {
		Assert.assertTrue(CadastroNome.erroCampoNome());
	}

	@Entao("^vejo o pop-up com o erro: `Oops! Limite por CPF atingido\\.`$")
	public void vejo_o_pop_up_com_o_erro_Oops_Limite_por_CPF_atingido() throws Throwable {

	}

	@Entao("^vejo o pop-up com o erro: \"([^\"]*)\"$")
	public void vejo_o_pop_up_com_o_erro(String popupErrorExpected) throws Throwable {
		Assert.assertEquals(popupErrorExpected, CadastroCPF.cpfJaCadastrado());
	}

	@Entao("^vejo o erro: \"([^\"]*)\"$")
	public void vejo_o_erro(String errorExpected) throws Throwable {
		Assert.assertEquals(errorExpected, CadastroCPF.cpfInvalidoCampo());
	}

	@Entao("^vejo a tela 'Chip Happy'$")
	public void vejo_a_tela_Chip_Happy() throws Throwable {
		Assert.assertTrue(ChipHappy.validaTelaChipHappy());
	}

	@Entao("^vejo o valor \"([^\"]*)\" no campo Digite sua senha$")
	public void vejo_o_valor_no_campo_Digite_sua_senha(String senhaDigitada) throws Throwable {
		Assert.assertEquals(senhaDigitada, CadastroSenha.getValuePassword());
	}

}
