package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By login = By.xpath("//*[@id=\"loginBox\"]/form/table/tbody/tr[1]/td/input");
	By password = By.xpath("//*[@id=\"loginBox\"]/form/table/tbody/tr[2]/td/input");
	By signin = By.id("sign_in");

	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public WebElement getLogin() {
		return driver.findElement(login);
		
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement signin() {
		return driver.findElement(signin);
	}
}
