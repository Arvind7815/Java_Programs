package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import pages.CheckBoxPage;
import pages.RadioButtonPage;

public class RadioButtonTest extends Baseliberary{
	RadioButtonPage ob;
	@BeforeTest
	public void setup() {
		launchUrl();
		ob = new RadioButtonPage();
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
	public void clickOnRadioButton() {

		ob.clickOnRadioButton();
	}

	@Test(priority = 4)
	public void clickYesRadioButton() {
		ob.clickYesRadioButton();
	}

	@Test(priority = 5)
	public void clickOnImpressive() {
		ob.clickImpressiveRadioButton();
	}

	@Test(priority = 6)
	public void clickNoRadioButton() {
		ob.clickNoRadioButton();
	}
}
	
