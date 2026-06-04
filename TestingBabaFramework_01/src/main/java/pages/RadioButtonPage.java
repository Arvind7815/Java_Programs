package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseliberary.Baseliberary;

public class RadioButtonPage extends Baseliberary{
	
	public RadioButtonPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practiceform;
	
	@FindBy(xpath = "//button[@data-target=\"#elements\"]")
	private WebElement elements;
	
	@FindBy(xpath = "//a[text()='radio buttons']")
	private WebElement radiobutton;

	@FindBy(xpath = "//input[@id='yes']")
	private WebElement yesradio;

	@FindBy(xpath = "//input[@id='impressive']")
	private WebElement impressiveradio;

	@FindBy(xpath = "//input[@id='no']")
	private WebElement noradio;

	
	public void clickOnClose() throws InterruptedException 
	{
		Thread.sleep(2000);
		close.click();
	}
	public void clickOnPractice()
	{
		practiceform.click();
	}
	public void clickOnElements()
	{
		elements.click();
	}
	public void clickOnRadioButton() {
		radiobutton.click();
	}
	public void clickYesRadioButton() {
		yesradio.click();
	}
	public void clickImpressiveRadioButton() {
		impressiveradio.click();
	}
	public void clickNoRadioButton() {
		noradio.click();
	}
	
	
	
	
	
	
	
	

}
