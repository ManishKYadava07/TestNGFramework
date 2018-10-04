package scripts;

import java.util.ArrayList;

import org.testng.annotations.Test;

import generic.Basetest;
import pom.Home_page;
import pom.Int_qus_page;
import pom.Loginpage;

public class Interview_qus_test extends Basetest{
	
	@Test
	public void Interview_qus_test_method(){
		
		Loginpage lp=new Loginpage(driver);
		LoginTest.mainLogin(driver,lp);
		
		Home_page hp=new Home_page(driver);
		hp.companieslink_method(driver);
		hp.intquslink_method();
		
		/*ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Int_qus_page iqp=new Int_qus_page(driver);
		iqp.softengglink_method();
		
		driver.switchTo().window(tabs.get(0));*/

		lp.logoutmethod(driver);
		
		
	}
}
