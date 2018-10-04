package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchJobpage {
	@FindBy(id="qsb-keyskill-sugg")
	private WebElement searchtb;
	
	@FindBy(xpath="//button[.='SEARCH']")
	private WebElement searchbtn;
	
	public SearchJobpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void searchmethod(String searchdata)
	{
		searchtb.sendKeys(searchdata);
	}
	public void searchbtnmethod()
	{
		searchbtn.click();
	}
}
