package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ReportIssuePage {

	private WebDriver driver;

	private Select categoriaComboBox;
	private Select reprodutibilidadeComboBox;
	private Select prioridadeComboBox;
	private Select perfilComboBox;
	
	private By resumoText = By.name("summary");
	private By descricaoText = By.name("description");
	private By passosText = By.name("steps_to_reproduce");
	private By informacaoAdicionalText = By.name("additional_info");
	private By botaoReportarRelatorio = By.cssSelector("input[class=\"button\"]");
	
	public ReportIssuePage(WebDriver driver) {
		this.driver = driver;
	}

	public void preencherCategoria(String texto) {
		categoriaComboBox = new Select(driver.findElement(By.name("category_id")));
		categoriaComboBox.selectByVisibleText(texto);
	}

	public void preencherReprodutibilidade(String texto) {
		reprodutibilidadeComboBox = new Select(driver.findElement(By.name("reproducibility")));
		reprodutibilidadeComboBox.selectByVisibleText(texto);
	}

	public void preencherPrioridade(String texto) {
		prioridadeComboBox = new Select(driver.findElement(By.name("priority")));
		prioridadeComboBox.selectByVisibleText(texto);
	}

	public void preencherPerfil(String texto) {
		perfilComboBox = new Select(driver.findElement(By.name("profile_id")));
		perfilComboBox.selectByVisibleText(texto);
	}

	public void preencherResumo(String texto) {
		driver.findElement(resumoText).sendKeys(texto);
	}

	public void preencherDescricao(String texto) {
		driver.findElement(descricaoText).sendKeys(texto);
	}

	public void preencherPassos(String texto) {
		driver.findElement(passosText).sendKeys(texto);
	}

	public void preencherInformacaoAdicional(String texto) {
		driver.findElement(informacaoAdicionalText).sendKeys(texto);
	}

	public void radioViewStatus(String texto) {
		driver.findElement(By.xpath("//input[@value=\"" + texto + "\"]")).click();
	}

	public void botaoReportarRelatorio() {
		driver.findElement(botaoReportarRelatorio).click();

	}

}
