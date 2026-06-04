package baseliberary;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import excelutility.ExcelUtility;
import propertyutility.PropertyUtility;

public class Baseliberary implements ExcelUtility, PropertyUtility {

	public static WebDriver driver;

	public void launchUrl() {

		String path = "C:\\Users\\Arvind Kushwah\\eclipse-workspace\\TestingBabaFramework_01\\webDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testingbaba.com/old/");
	}

	@Override
	public String getReadData(int sheetNo, int row, int col) {
		String path = "C:\\Users\\Arvind Kushwah\\eclipse-workspace\\TestingBabaFramework_01\\testData\\ExcelFillDetails.xlsx";
		String value = "";
		try {
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(sheetNo);
			value = sheet.getRow(row).getCell(col).getStringCellValue();

		} catch (Exception e) {
			System.out.println("Issue in get read data" + e);
		
		}
		return value;
	}

	@Override
	public String getReadData(String key) {
		String path = "C:\\Users\\Arvind Kushwah\\eclipse-workspace\\TestingBabaFramework_01\\testData\\WebTable.xlsx";
		String value = "";
		try {
			FileInputStream fis = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
			
			
		}catch(Exception e) {
			System.out.println("Issue in get read data ");
			
		}
		return value;
	}
}