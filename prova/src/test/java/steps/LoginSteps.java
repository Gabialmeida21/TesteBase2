package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import pages.LoginPages;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class LoginSteps {
	@Dado("^que estou na pagina de login$")
	public void queEstouNaPaginaDeLogin()  {
		LoginPages.validaPaginaLogin();
		
	}

	@Quando("^eu informo o \"([^\"]*)\" no campo Username$")
	public void euInformoONoCampoUsername(String Login)  {
		LoginPages.informoCampoUsername(Login);
		
	}

	@E("^informo a \"([^\"]*)\" no campo Password$")
	public void informoANoCampoPassword(String Senha)  {
		LoginPages.informoSenhanoPassword(Senha);
		
	}

	@E("^clico no botao Login$")
	public void clicoNoBotaoLogin()  {
		LoginPages.clicoBotaoLogin();
		
	}

	@Entao("^eu vejo a pagina inicial$")
	public void euVejoAPaginaInicial()  {
		LoginPages.vejoPaginaInicial();
		
	}
	
	
	
}
