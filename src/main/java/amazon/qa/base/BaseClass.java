package amazon.qa.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import amazone.qa.common.CommonMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.MainPage;

public class BaseClass {
	public static WebDriver driver;

	public MainPage mainPage; // global variable
	public CommonMethods cm;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		initelements();

	}

	@AfterMethod
	public void quitting() {
		driver.quit();
	}

	public void initelements() {
		mainPage = new MainPage(driver); // initialized here
		cm = new CommonMethods();
	}

}
