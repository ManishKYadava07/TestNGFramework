package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchRec_buy_page {

	@FindBy(id="cartstatus")
	private WebElement buynowbtn;
	
	public SearchRec_buy_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void buynowbtn_method()
	{
		buynowbtn.click();
	}
}
