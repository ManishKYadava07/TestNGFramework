package scripts;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.annotations.TestAnnotation;

import generic.Auto_constant;
import generic.Basetest;
import pom.Home_page;
import pom.Loginpage;

public class Services_cert_test extends Basetest {
	
	@Test
	public void Services_cert_test_method() {
		
		
		Loginpage lp=new Loginpage(driver);
		LoginTest.mainLogin(driver,lp);
		
		Home_page hp=new Home_page(driver);
		hp.serviceslink_method(driver);
		hp.datascilink_method();
		
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		
		lp.logoutmethod(driver);
		
	}

}
