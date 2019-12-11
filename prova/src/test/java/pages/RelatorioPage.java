package pages;

import org.apache.bcel.generic.Select;

import ElementMap.RelatorioElementMap;

public class RelatorioPage extends RelatorioElementMap {

	public static void categoria() {
		category_id.sendKeys("[All Projects] 7EI2PODHPN");
//		Select category_id = new Select (category_id);
//		category_id.selectByVisibleText("[All Projects] 7EI2PODHPN  ");
		
	}

	public static void resumo() {
		sumary.sendKeys("Teste ");
		
	}

	public static void descricao() {
		description.sendKeys("Teste");
		
	}

	public static void submit() {
		button.click();
		
	}
	
	
	

}
