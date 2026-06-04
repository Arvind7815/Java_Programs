package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import pages.TextBoxPage;

public class TextBoxTest extends Baseliberary {
	TextBoxPage ob;

	@BeforeTest
	public void setup() {
		launchUrl();
		ob = new TextBoxPage();
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

	@Test(priority = 3)
	public void clickOntextBox() {
		ob.clickOnTextBox();
	}

	@Test(priority = 4)
	public void filldetails() {
		ob.fillDetails();
	}
	@Test(priority = 5)
	public void validate() {
		ob.validate();
	}

}
