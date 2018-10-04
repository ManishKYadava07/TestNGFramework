package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Int_qus_page {
	@FindBy(xpath="//p[.=' Software engineer']")
	private WebElement softengglink;
	
	public Int_qus_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void softengglink_method()
	{
		softengglink.click();
	}

}
