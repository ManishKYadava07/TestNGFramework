package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.Auto_constant;
import generic.Basetest;
import generic.GenericClass;
import pom.Loginpage;
import pom.SearchJobpage;

public class Searchjobtest extends Basetest {
	@Test
	public void Searchjobtest_method()
	{
		
		Loginpage lp=new Loginpage(driver);
		LoginTest.mainLogin(driver,lp);
		String searchdata=GenericClass.genericmethod(excelpath, "Sheet2", 1, 0);
		SearchJobpage sjp=new SearchJobpage(driver);
		sjp.searchmethod(searchdata);
		sjp.searchbtnmethod();
		lp.logoutmethod(driver);
		

	}

}
