package scripts;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.Auto_constant;
import generic.Basetest;
import pom.Capgemini_job_page;
import pom.Home_page;
import pom.Jobsby_Company_page;
import pom.Loginpage;

public class Jobsby_company_test extends Basetest {
	
	@Test
	public  void Jobsby_company_test(){
		
				
		Loginpage lp=new Loginpage(driver);
		LoginTest.mainLogin(driver,lp);
		
		Home_page hp=new Home_page(driver);
		hp.jobslink_method(driver);
		hp.jobsbycomplink_method();
		
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Jobsby_Company_page jcp=new Jobsby_Company_page(driver);
		jcp.alpha_C_method();
		jcp.capgemini_method();
		
		tabs.clear();
		tabs.addAll(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		Capgemini_job_page cjp=new Capgemini_job_page(driver);
		cjp.iostestlink_method();
		
		tabs.clear();
		tabs.addAll(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(3));
		lp.logoutmethod(driver);
		
	}

}
