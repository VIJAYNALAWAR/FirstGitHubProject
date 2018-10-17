package loginPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjctModel.FacebookPage;

public class FacebookLogin extends FacebookPage{	
	
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Pendrive\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
        facebookLogin("vijay", "vija1233");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	}

}
