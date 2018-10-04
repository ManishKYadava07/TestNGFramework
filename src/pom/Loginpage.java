package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	//declaring elements
	@FindBy(id="login_Layer")
	private WebElement loginele;
	
	@FindBy(name="email")
	private WebElement usernameele;
	
	@FindBy(id="pLogin")
	private WebElement passwordele;
	
	@FindBy(xpath="//button[.='Login']")
	private WebElement loginbtnele;
	
	@FindBy(xpath="//div[.='My Naukri']")
	private WebElement mynaukriele;
	
	@FindBy(linkText="Logout")
	private WebElement logoutele;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this); //initializing the elements
		
		//Code to close the child windows
		 String originalHandle = driver.getWindowHandle();
		 
		 for(String handle : driver.getWindowHandles()) {
		        if (!handle.equals(originalHandle)) {
		            driver.switchTo().window(handle);
		            driver.close();
		        }
		    }

		    driver.switchTo().window(originalHandle);
	}
	
	//utilizing the elements
	public void loginmethod(String usernamedata,String passworddata)
	{
		loginele.click();
		usernameele.sendKeys(usernamedata);
		passwordele.sendKeys(passworddata);
		loginbtnele.click();
	}
	
	public void logoutmethod(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(mynaukriele).perform();
		logoutele.click();
	}

}
