package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseliberary.Baseliberary;

public class LoginPage extends Baseliberary {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='×']")
	private WebElement close;

	public void clickOnClose() {
		close.click();
	}

	public void getTitle() {

		String title = driver.getTitle();
		System.out.println("Website Title : " + title);
	}

	public void getCurrentUrl() {

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Website URL : " + currentUrl);

	}
}