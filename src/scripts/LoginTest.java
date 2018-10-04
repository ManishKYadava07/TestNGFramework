package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.Auto_constant;
import generic.Basetest;
import generic.GenericClass;
import pom.Loginpage;

public class LoginTest extends Basetest {

	@Test
	public void LoginTest_method() 
	{
		Loginpage lp=new Loginpage(driver);
		mainLogin(driver,lp);
		lp.logoutmethod(driver);
		
		
		
	}
	
	public static void mainLogin(WebDriver driver,Loginpage lp)
	{
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		String username=GenericClass.genericmethod(excelpath, "Sheet1", 1, 0);
		String password=GenericClass.genericmethod(excelpath, "Sheet1", 1, 1);
		System.out.println(username+password);
		lp.loginmethod(username,password);
	}

}
