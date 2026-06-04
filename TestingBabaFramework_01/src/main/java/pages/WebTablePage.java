package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseliberary.Baseliberary;

public class WebTablePage extends Baseliberary{
	public WebTablePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practiceform;
	
	@FindBy(xpath = "//button[@data-target=\"#elements\"]")
	private WebElement elements;
	
	@FindBy(xpath = "//a[text()='web tables']")
	private WebElement webtable;
	
	@FindBy(xpath = "//input[@pattern=\"^[a-zA-Z][\\sa-zA-Z]{2,32}\"]")
	private WebElement name;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement save;
	
	@FindBy(xpath = "//iframe[@src=\"Webtable.html\"]")
	private WebElement frame;

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
	public void clickOnWebTable() {
		webtable.click();
	}
	public void fillDetails() {
		driver.switchTo().frame(frame);
		name.sendKeys("Aman");
		email.sendKeys("aman@gmail.com");
		save.click();
		driver.switchTo().defaultContent();
	}
	

}
