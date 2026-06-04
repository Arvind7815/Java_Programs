package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import pages.TextBoxPage;
import pages.WebTablePage;

public class WebTableTest extends Baseliberary {
	WebTablePage ob;

	@BeforeTest
	public void setup() {
		launchUrl();
		ob = new WebTablePage();
	}

	@Test(priority = 0)
	public void clickOnClose() throws InterruptedException {
		ob.clickOnClose();
	}

	@Test(priority = 1)
	public void clickOnPractice() {
		ob.clickOnPractice();
	}

	@Test(priority = 2)
	public void clickOnElements() {
		ob.clickOnElements();
	}
	@Test(priority =3)
	public void filDetails() {
		ob.fillDetails();
	}
	
}
