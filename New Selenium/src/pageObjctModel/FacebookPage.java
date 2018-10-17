/**
 * 
 */
package pageObjctModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author VNALAWAR
 *
 */
public class FacebookPage {
	
	static WebDriver driver;
	static By uName=By.id("email");
	static By pass=By.id("pass");
	static By loginBtn=By.xpath("//input[@id='u_0_2']");
	
	public static  void facebookLogin(String userName, String password)
	{
		driver.findElement(uName).sendKeys(userName);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(loginBtn).click();
	}

}


