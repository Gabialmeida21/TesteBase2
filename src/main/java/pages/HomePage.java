package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean estaLogado(String texto) {
		By usuarioLogado = By.cssSelector(".login-info-left span:nth-child(1)");

		return texto.contentEquals(driver.findElement(usuarioLogado).getText());
	}

	public void clicarReportIssue() {
		By linkReportIssue = By.linkText("Report Issue");

		driver.findElement(linkReportIssue).click();
	}

	public void selecionarProjeto(String value) {

		By botaoSelecionarProjeto = By.cssSelector("input[class=\"button\"]");

		WebElement comboProject = driver.findElement(By.cssSelector("div select"));

		Select select = new Select(comboProject);
		select.selectByValue(value);

		driver.findElement(botaoSelecionarProjeto).click();

	}
	
	public void clicarPaginaInicial() {
		driver.findElement(By.linkText("My View")).click();
	}
}
