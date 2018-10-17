package Sample_Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Pendrive\\Selenium\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Pendrive\\Selenium\\chromedriver.exe");
		//WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.facebook.com/");
		
		//driver.manage().window().maximize();
		
		File src=new File("D:\\Selenium\\Excel Data\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data0=sheet1.getRow(1).getCell(1).getStringCellValue();
		System.out.println("Data from Excel is  :"+data0);
		
		WebDriver driver=new ChromeDriver();
		
		//WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(20000);
		WebElement userName=driver.findElement(By.id("email"));
		userName.sendKeys(data0);
		
		int rowCount=sheet1.getLastRowNum();
		System.out.println(sheet1.getLastRowNum());
		
		for(int i=0;i<=rowCount;i++)		
		{
			String data1=sheet1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println(data1);
		}

	}

}
