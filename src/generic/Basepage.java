package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Basepage {
	
	public void element(WebDriver driver,WebElement element)
	{
		
		try
		{
			WebDriverWait w=new WebDriverWait(driver,10);
			w.until(ExpectedConditions.visibilityOf(element));
			
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
	
	public void element_clickable(WebDriver driver,WebElement element)
	{
		
		try
		{
			WebDriverWait w=new WebDriverWait(driver,10);
			w.until(ExpectedConditions.elementToBeClickable(element));
			
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
}