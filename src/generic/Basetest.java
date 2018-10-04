package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Auto_constant {
	
	public WebDriver driver;
	@BeforeMethod
	public void openbrowser()
	{
		System.setProperty(key, value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
	}
	
	@AfterMethod
	public void closebrowser(ITestResult result)
	{
		String name=result.getName();
		int status=result.getStatus();
		if(status==1)
		{
			Reporter.log("photo should be taken");
			Photo.getphoto(driver, photopath, "pictures",name);
		}
		driver.quit();
	}
	

}
