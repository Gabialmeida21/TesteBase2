package pages;

import org.openqa.selenium.support.PageFactory;

import ElementMap.LoginElementMap;


public class LoginPages extends LoginElementMap{

	public static void validaPaginaLogin() {

		
	}

	public static void informoCampoUsername(String Login) {
		username.sendKeys(Login);
	}

	public static void informoSenhanoPassword(String Senha) {
		password.sendKeys(Senha);
		
	}

	public static void clicoBotaoLogin() {
		clik_Login.click();
		
	}

	public static void vejoPaginaInicial() {
		
		
	}
	
//	public static void ValidaPaginaLogin() {
//		Navigate.open("https://mantis-prova.base2.com.br/login_page.php?return=%2Fmy_view_page.php");
//		PageFactory.initElements(Navigate.driver, new LoginPages());
		
		

}
