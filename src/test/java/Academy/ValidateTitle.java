package Academy;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.RelationshipPage;
import resources.base;

public class ValidateTitle extends base {
	
	@Test(dataProvider = "getData")
	
	public void validateTitle(String login, String password) throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
		LandingPage l = new LandingPage(driver);
		l.getLogin().sendKeys(login);
		l.getPassword().sendKeys(password);
		l.signin().click();
		
		RelationshipPage rp = new RelationshipPage(driver);
		Assert.assertEquals(rp.getTitle().getText(),"OrchAdmin");
		
		
		
	}
	
	@DataProvider
	
	public Object[][] getData() {
		
		Object[][] data = new Object[1][2];
		
	    data[0][0] = "Synergy";
		data[0][1] = "@ffSh@reTeam#123";
		
		return data;
	}

}
