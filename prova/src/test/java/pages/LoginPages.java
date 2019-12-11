package pages;


import org.junit.rules.TestRule;
import org.openqa.selenium.support.PageFactory;

import ElementMap.LoginElementMap;


public class LoginPages extends LoginElementMap{
	
//	public LoginPages() {
//		PageFactory.initElements(TestRule.getDriver(), this);
//	}

	public static void validaPaginaLogin() {

		
	}

	public static void informoCampoUsername(String Login) {
		username.sendKeys("gabriela.penha");
	}

	public static void informoSenhanoPassword(String Senha) {
		password.sendKeys("426188");
		
	}

	public static void clicoBotaoLogin() {
		button.click();
		
	}

	public static void vejoPaginaInicial() {
		
		
	}
	
//	public static void ValidaPaginaLogin() {
//		Navigate.open("https://mantis-prova.base2.com.br/login_page.php?return=%2Fmy_view_page.php");
//		PageFactory.initElements(Navigate.driver, new LoginPages());
		
		

}
