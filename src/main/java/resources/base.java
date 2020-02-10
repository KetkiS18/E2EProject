package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
 
	public WebDriver initializeDriver() throws IOException {
		
	 prop = new Properties();
	FileInputStream fis = new FileInputStream("D:\\E2EProject\\src\\main\\java\\resources\\data.properties");
	
	prop.load(fis);
	String browserName = prop.getProperty("browser");
	
	if(browserName.equals("chrome")) {
		//execute in chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\Cromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}else if(browserName.equals("firefox")) {
		//execute in firefox browser
		
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\Firefoxdriver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	return driver;
	}
}
