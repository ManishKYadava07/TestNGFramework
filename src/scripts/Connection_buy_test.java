package scripts;

import java.util.ArrayList;

import org.testng.annotations.Test;

import generic.Basetest;
import pom.Home_page;
import pom.Loginpage;
import pom.Recruiter_conn_page;
import pom.SearchRec_buy_page;

public class Connection_buy_test extends Basetest{

	@Test
	public void  Connection_buy_test_method() throws InterruptedException {
		
		Loginpage lp=new Loginpage(driver);
		LoginTest.mainLogin(driver,lp);
		
		Home_page hp=new Home_page(driver);
		hp.recruiterlink_method(driver);
		hp.recconnlink_method();
		ArrayList< String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Recruiter_conn_page rcp=new Recruiter_conn_page(driver);
		rcp.buyredilink_method();
		
		tabs.clear();
		tabs.addAll(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		SearchRec_buy_page sbp=new SearchRec_buy_page(driver);
		sbp.buynowbtn_method();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		lp.logoutmethod(driver);
		
	}
}
