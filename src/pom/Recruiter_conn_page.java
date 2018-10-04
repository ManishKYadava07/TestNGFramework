package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recruiter_conn_page {
	@FindBy(xpath="//a[.='Buy Credits']")
	private WebElement buycredilink;

	public Recruiter_conn_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void buyredilink_method()
	{
		buycredilink.click();
	}
}
