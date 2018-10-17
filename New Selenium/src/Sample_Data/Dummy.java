package Sample_Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dummy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Pendrive\\Selenium\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Pendrive\\Selenium\\chromedriver.exe");
	    //WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(10000);
		
		WebElement userNameTxt=driver.findElement(By.cssSelector("#pass"));
		userNameTxt.sendKeys("vijay123455");
		System.out.println("Entered value in the textbox");

	}

}
