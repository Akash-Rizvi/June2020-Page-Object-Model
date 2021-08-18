package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;

	@Test(priority = 1)
	public void validUserShouldBeAbleToLogIn() {

		BrowserFactory.init();

		driver = BrowserFactory.init();
		// Arguement

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		login.enterUserName("demo@techfios.com");
		login.enterPassword("abc123");
		login.clickSigninButton();

		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.validateDashboard();
		
		

		//BrowserFactory.tearDown();

	}

	
	/*@Test(priority = 2)
	public void validUserShouldBeAbleToLogIn() {

		BrowserFactory.init();

		driver = BrowserFactory.init();
		// Arguement

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);

		login.enterUserName("demo@techfios.com");
		login.enterPassword("abc123");
		login.clickSigninButton();

		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.validateDashboard();
		
		//one more PageFactory.initElements for invalid username or password
		
		

		//BrowserFactory.tearDown();

	}
	*/
}
