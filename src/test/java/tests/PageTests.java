package tests;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTests;
import pages.ReportIssuePage;

public class PageTests extends BaseTests {
	
	@Test
	public void testValidarUsuarioLogado() {
		assertThat(homePage.estaLogado("gabriela.penha"), is(true));
	}
	
	@Test
	public void testCriarRelatorio() {
		homePage.clicarReportIssue();
		homePage.selecionarProjeto("111");
		
		reportIssue = new ReportIssuePage(driver);
		
		reportIssue.preencherCategoria("[All Projects] 7EI2PODHPN");
		reportIssue.preencherReprodutibilidade("always");
		reportIssue.preencherPrioridade("high");
		reportIssue.preencherPerfil("Desktop  Windows 10");
		reportIssue.preencherResumo("Teste Base2 Mantis");
		reportIssue.preencherDescricao("Melhorando scripts");
		reportIssue.preencherPassos("1 - Acessar a url do sistema" 
				+ " \n2 - Logar no sistema " 
				+ " \n3 - Selecionar a Categoria "
				+ " \n4 - Selecionar a frequencia " 
				+ " \n5 - Selecionar Gravidade " 
				+ " \n6 - Preencher Resumo "
				+ " \n7 - Preencher descricao " 
				+ " \n8 - Preencher campo passos para reproduzir ");
		reportIssue.preencherInformacaoAdicional("Teste Mantis Base2");
		reportIssue.preencherInformacaoAdicional("Teste Mantis Base2");
		reportIssue.radioViewStatus("50");
		reportIssue.botaoReportarRelatorio();
		
		WebElement messageText = driver.findElement(By.xpath("//div[@align='center']"));
		
		assertThat(messageText.getText().contains("Operation successful"), is(true));
	}
}
