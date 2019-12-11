package pages;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ElementMap.RelatorioElementMap;

public class RelatorioPage extends RelatorioElementMap {

	public static void categoria() {

		
		Select = new Select (category_id);
		Select.selectByVisibleText("[All Projects] 7EI2PODHPN");
		
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
