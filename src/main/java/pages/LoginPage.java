package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By username = By.name("username");
	
	private By password = By.name("password");
	
	private By botaoLogin = By.xpath("//input[@value='Login']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void preencherUsername(String texto) {
		driver.findElement(username).sendKeys(texto);
	}
	
	public void preencherPassword(String texto) {
		driver.findElement(password).sendKeys(texto);
	}
	
	public void clicarBotaoLogin() {
		driver.findElement(botaoLogin).click();
	}	
	

}
