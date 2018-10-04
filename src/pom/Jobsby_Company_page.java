package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jobsby_Company_page {
	@FindBy(xpath="//a[@name='compc']")
	private WebElement alpha_C;

	@FindBy(xpath="//a[@title='Capgemini Technology Services India Limited  Careers']")
	private WebElement capgemini;
	
	public Jobsby_Company_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void alpha_C_method()
	{
		alpha_C.click();
	}
	
	public void capgemini_method()
	{
		capgemini.click();
	}

}
