package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import pages.LoginPage;

public class LoginTest extends Baseliberary {

	LoginPage ob;

	@BeforeTest
	public void setup() {
		launchUrl();
		ob = new LoginPage();
	}

	@Test(priority = 0)
	public void clickOnClose() {
		ob.clickOnClose();
	}

	@Test(priority = 1)
	public void getTitle() {
		ob.getTitle();
	}

	@Test(priority = 2)
	public void getCurrentUrl() {
		ob.getCurrentUrl();

	}

}