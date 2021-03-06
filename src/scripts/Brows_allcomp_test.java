package scripts;

import java.util.ArrayList;

import org.testng.annotations.Test;

import generic.Basetest;
import pom.Capgemini_job_page;
import pom.Home_page;
import pom.Jobsby_Company_page;
import pom.Loginpage;

public class Brows_allcomp_test extends Basetest {

	@Test
	public void Brows_allcomp_test_method(){
		
		Loginpage lp=new Loginpage(driver);
		LoginTest.mainLogin(driver,lp);
		
		Home_page hp=new Home_page(driver);
		hp.companieslink_method(driver);
		hp.browallcomplink_method();
		
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
