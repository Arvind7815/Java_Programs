package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseliberary.Baseliberary;
import pages.CheckBoxPage;
import pages.TextBoxPage;

	public class CheckBoxTest extends Baseliberary {
		CheckBoxPage ob;
		@BeforeTest
		public void setup() {
			launchUrl();
			ob = new CheckBoxPage();
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
		public void clickOnCheckBox() {
			ob.clickOnCheck();
		}

		@Test(priority = 4)
		public void clickOnMobileCheck() {
			ob.clickOnMobileCheck();
		}
		@Test(priority = 5)
		public void clickOnLaptopCheck() {
			ob.clickOnLaptopCheck();
		}

		@Test(priority = 6)
		public void clickOnDesktopCheck() {
			ob.clickOnDesktopCheck();
		}
		

	

}
