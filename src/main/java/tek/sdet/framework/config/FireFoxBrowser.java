package tek.sdet.framework.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxBrowser implements Browser {

	@Override
	public WebDriver openBrowser(String url) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		return driver;
	}

}
