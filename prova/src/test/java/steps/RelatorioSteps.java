package steps;

import cucumber.api.java.gl.E;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import pages.RelatorioPage;

public class RelatorioSteps {


	@Dado("^que estou na pagina Report Issue$")
	public void queEstouNaPaginaReportIssue() {
		
	}

	@Quando("^eu informo a \"([^\"]*)\" no campo Categoria$")
	public void euInformoANoCampoCategoria(String categoria) {
		RelatorioPage.categoria();
		
	}

	@E("^preencho o \"([^\"]*)\" no campo resumo$")
	public void preenchoONoCampoResumo(String resumo){
		RelatorioPage.resumo();
		
	}

	@E("^preencho a \"([^\"]*)\" no campo Descricao$")
	public void preenchoANoCampoDescricao(String descricao)  {
		RelatorioPage.descricao();
		
	}

	@E("^clico no botao \"([^\"]*)\"$")
	public void clicoNoBotao(String submit)  {
		RelatorioPage.submit();
		
	}

	@Entao("^o sistema exibe \"([^\"]*)\"$")
	public void oSistemaExibe(String arg1)  {
		
	}


	
	
	
	
	
		

}
