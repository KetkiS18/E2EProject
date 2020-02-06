package Academy;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class HomePage extends base {
	
	@Test(dataProvider = "getData")
	
	public void basePageNavigation(String login, String password) throws IOException {
		driver = initializeDriver();
		driver.get("https://oa.qaorch.com/please_login.php");
		
		LandingPage l = new LandingPage(driver);
		l.getLogin().sendKeys(login);
		l.getPassword().sendKeys(password);
		l.signin().click();
	}
	
	@DataProvider
	
	public Object[][] getData() {
		
		Object[][] data = new Object[2][2];
		
		data[0][0] = "Hello";
		data[0][1] = "abcdef";
		
		data[1][0] = "Synergy";
		data[1][1] = "@ffSh@reTeam#123";
		
		return data;
	}

}