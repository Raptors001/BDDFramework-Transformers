package tek.sdet.framework.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser implements Browser {

	/**
	 *This method will return Chrome driver 
	 *and will navigate to application url
	 */
	public WebDriver openBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		return driver;

	}



}
