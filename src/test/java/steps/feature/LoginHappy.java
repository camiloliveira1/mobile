package steps.feature;

import cucumber.api.java.pt.Dado;
import pages.Login;
import pages.PrimeiroAcesso;

public class LoginHappy {
	@Dado("^que eu inforno o usuário \"([^\"]*)\"$")
	public void que_eu_inforno_o_usuário(String userName) throws Throwable {
		Login.userName(userName);
	}

	@Dado("^que estou logado no Happy com o usuário \"([^\"]*)\"$")
	public void que_estou_logado_no_Happy_com_o_usuário(String user) throws Throwable {
		PrimeiroAcesso.jaSouCadastrado();
		Login.userName(user);
	}

	@Dado("^senha \"([^\"]*)\"$")
	public void a_senha(String password) throws Throwable {
		Login.password(password);
		Login.entrar();
	}

}
