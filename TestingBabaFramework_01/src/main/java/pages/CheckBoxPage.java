package pages;

import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseliberary.Baseliberary;

public class CheckBoxPage extends Baseliberary {
	
	public CheckBoxPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practiceform;
	
	@FindBy(xpath = "//button[@data-target=\"#elements\"]")
	private WebElement elements;
	
	@FindBy(xpath = "//a[text()='check box']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//input[@id=\"myCheck\"]")
	private WebElement mobilecheckbox;
	
	@FindBy(xpath = "//iframe[@src=\"Checkbox.html\"]") 
	private WebElement frame;
	
	@FindBy(xpath = "//h6[@id=\"text\"]")
	private WebElement mobiletext;
	
	@FindBy(xpath = "//input[@id=\"mylaptop\"]")
	private WebElement laptopcheckbox;
	
	@FindBy(xpath = "//h6[@id=\"text1\"]")
	private WebElement laptoptext;
	
	@FindBy(xpath = "//input[@id=\"mydesktop\"]")
	private WebElement desktopcheckbox;
	
	@FindBy(xpath = "//h6[@id=\"text2\"]")
	private WebElement desktoptext;
	
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
	public void clickOnCheck() {
		checkbox.click();
	}
	public void clickOnMobileCheck() {
		driver.switchTo().frame(frame);
		mobilecheckbox.click();
		String expected = getReadData("mobile");
		String actual = mobiletext.getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().defaultContent();
	}
	public void clickOnLaptopCheck() {
		driver.switchTo().frame(frame);
		laptopcheckbox.click();
		String expected = getReadData("laptop");
		String actual = laptoptext.getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().defaultContent();
	}
	public void clickOnDesktopCheck() {
		driver.switchTo().frame(frame);
		desktopcheckbox.click();
		String expected = getReadData("desktop");
		String actual = desktoptext.getText();
		Assert.assertEquals(expected, actual);
		driver.switchTo().defaultContent();
	}
	
}
	

