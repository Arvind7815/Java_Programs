package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import baseliberary.Baseliberary;

public class TextBoxPage extends Baseliberary {
	
	public TextBoxPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practiceform;
	
	@FindBy(xpath = "//button[@data-target=\"#elements\"]")
	private WebElement elements;
	
	@FindBy(xpath = "//*[text()='text box']")
	private WebElement textbox;
	
	@FindBy(xpath = "//input[@id='fullname1']")
	private WebElement fullname;

	@FindBy(xpath = "//input[@id='fullemail1']")
	private WebElement email;

	@FindBy(xpath = "//*[@id='fulladdresh1']")
	private WebElement currentaddress;

	@FindBy(xpath = "//*[@id='paddresh1']")
	private WebElement parmanentaddress;

	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement submit;
		
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
	public void clickOnTextBox()
	{
		textbox.click();
	}
	public void fillDetails()
	{
		fullname.sendKeys(getReadData(0, 1, 0));
		email.sendKeys(getReadData(0, 1, 1));
		currentaddress.sendKeys(getReadData(0, 1, 2));
		parmanentaddress.sendKeys(getReadData(0, 1, 3));
		submit.click();
	}
	
	@FindBy(xpath = "//div[@class=\"col-md-6 mt-5\"]/label")
	private List<WebElement> list;
	public void validate()
	
	{
		SoftAssert sassert = new SoftAssert();
		ArrayList<String> expected = new ArrayList<>();
		ArrayList<String> actual = new ArrayList<>();
		for(int i=0;i<3;i++)
		
		{
			expected.add(getReadData(0,1,i));
		}
		
		//expected.add("Java"); // Out side data for check validation
		
		for(int i=0;i<list.size();i++)
		
		{
			actual.add(list.get(i).getText());
		}
		
		for(int i=0;i<expected.size();i++)
		
		{
			Assert.assertEquals(expected.get(i),actual.get(i));
			//sassert.assertEquals(expected.get(i),actual.get(i));
		}
		System.out.println("Validation Completed ");
		sassert.assertAll();
	}
	
	
}
