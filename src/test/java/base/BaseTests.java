package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;
import pages.LoginPage;
import pages.ReportIssuePage;

public class BaseTests {

	public static WebDriver driver;
	protected static HomePage homePage;
	protected static ReportIssuePage reportIssue;

	@BeforeAll
	public static void inicializar() {
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver\\83\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://mantis-prova.base2.com.br/login_page.php");
		
		homePage = new HomePage(driver);
		
		driver.manage().window().maximize();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.preencherUsername("gabriela.penha");
		loginPage.preencherPassword("87654321");
		loginPage.clicarBotaoLogin();
	}
	
	@AfterAll
	public static void posCondicao() {
//		 driver.quit();
	}

}
