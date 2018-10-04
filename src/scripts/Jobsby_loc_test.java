package scripts;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.Auto_constant;
import generic.Basetest;
import pom.Home_page;
import pom.Jobsby_loc_page;
import pom.Loginpage;

public class Jobsby_loc_test extends Basetest{
	
	@Test
	public  void Jobsby_loc_test_method() throws InterruptedException {

		
		Loginpage lp=new Loginpage(driver);
		LoginTest.mainLogin(driver,lp);
		
		Home_page hp=new Home_page(driver);
		hp.jobslink_method(driver);
		hp.jobsbyloclink_method();
		
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Jobsby_loc_page jlp=new Jobsby_loc_page(driver);
		jlp.jobmumbailink_method();
		
		tabs.clear();
		tabs.addAll(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		Thread.sleep(2000);
		lp.logoutmethod(driver);
		
	}

}
