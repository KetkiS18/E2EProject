package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RelationshipPage {

	public WebDriver driver;
	
	By title = By.xpath("//*[@id=\"logo\"]/a/h1");


	public RelationshipPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
	}

	public WebElement getTitle() {
		
		return driver.findElement(title);
		//test
		
	}

}
