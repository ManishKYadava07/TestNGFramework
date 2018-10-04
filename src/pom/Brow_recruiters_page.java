package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Brow_recruiters_page {
	
	@FindBy(xpath="//a[@title='Recruiters in Mumbai']")
	private WebElement locmumbai;
	
	public Brow_recruiters_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void locmumbai()
	{
		locmumbai.click();
	}

}
