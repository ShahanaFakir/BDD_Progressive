package progressive.bdd.base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import progressive.bdd.commons.CommonFunctions;
import progressive.bdd.commons.CommonWaits;
import progressive.bdd.objects.AutoPage;
import progressive.bdd.objects.BirthdatePage;
import progressive.bdd.objects.HomePage;
import progressive.bdd.utils.Configuration;

public class BaseClass {
	
	public Configuration configuration = Configuration.getInstance();

	public static WebDriver driver;
	public static WebDriverWait wait;
	static CommonWaits waits;

	protected static CommonFunctions commons;
	protected static HomePage homePage;
	protected static BirthdatePage birthdatePage;
	protected static AutoPage aboutP;
	
	

	

	
	public void setUp(String browser) {
		driver = localDriver("browser");
		driver.manage().window().maximize();
		driver.get(configuration.get("url"));
		driver.manage().timeouts()
				.pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(configuration.get("pageLoadWait"))));
		driver.manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(Integer.parseInt(configuration.get("implicitWait"))));
		wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(configuration.get("explicitWait"))));
		initClasses();
	}

	

	private WebDriver localDriver(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		return driver;
	}

	protected WebDriver getDriver() {
		return driver;

	}

	public static void initClasses() {
		waits = new CommonWaits(wait);
		commons = new CommonFunctions(driver, waits);
		homePage = new HomePage(driver, commons);
		aboutP = new AutoPage(driver, commons);
		birthdatePage = new BirthdatePage(driver, commons);

	}
	
	public void quitDriver() {
		getDriver().quit();
		
	}
	
	

	


}
