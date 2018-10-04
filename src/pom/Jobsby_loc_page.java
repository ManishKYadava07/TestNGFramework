package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jobsby_loc_page {

	@FindBy(xpath="(//a[@title='Jobs in Mumbai'])[1]")
	private WebElement jobmumbailink;
	
	public Jobsby_loc_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void jobmumbailink_method()
	{
		jobmumbailink.click();
	}
}
