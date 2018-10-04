package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Capgemini_job_page {
	
	@FindBy(xpath="//li[@title='IOS Tester']")
	private WebElement iostestlink;
	
	public Capgemini_job_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void iostestlink_method()
	{
		iostestlink.click();
	}

}
