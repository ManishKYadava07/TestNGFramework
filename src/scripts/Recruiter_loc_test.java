package scripts;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.Auto_constant;
import generic.Basetest;
import pom.Brow_recruiters_page;
import pom.Home_page;
import pom.Loginpage;

public class Recruiter_loc_test extends Basetest{
	
	@Test
	public void Recruiter_loc_test_method() {
	
		
		Loginpage lp=new Loginpage(driver);
		LoginTest.mainLogin(driver,lp);
		
		Home_page hp=new Home_page(driver);
		hp.recruiterlink_method(driver);
		hp.browseallrec_method();
		
		ArrayList<String> tab1=new ArrayList<String>(driver.getWindowHandles());
		//System.out.println(tab1);
		driver.switchTo().window(tab1.get(1));
		
		Brow_recruiters_page brp=new Brow_recruiters_page(driver);
		brp.locmumbai();
		
		tab1.clear();
		tab1.addAll(driver.getWindowHandles());
		
		//System.out.println(tab1);
		driver.switchTo().window(tab1.get(2));
		lp.logoutmethod(driver);
		
		
		
	}

}
