package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	
	@FindBy(xpath="//a[@title='Search Recruiters']")
	private WebElement recruiterslink;

	@FindBy(xpath="//a[@title='Browse All Recruiters']")
	private WebElement browallreclink;
	
	@FindBy(xpath="//a[@title='Recruiter Connection']")
	private WebElement recconnlink;
	
	@FindBy(xpath="(//a[@title='Search Jobs'])[1]")
	private WebElement jobslink;
	
	@FindBy(xpath="(//a[@title='Jobs by Location'])[1]")
	private WebElement jobsbyloclink;
	
	@FindBy(xpath="(//a[@title='Jobs by Company'])[1]")
	private WebElement jobsbycomplink;

	@FindBy(xpath="(//a[@title='Jobs Posted By Top Companies'])[1]")
	private WebElement companieslink;
	
	@FindBy(xpath="(//a[@title='Interview Questions'])[1]")
	private WebElement intquslink;
	
	@FindBy(xpath="(//a[@title='Browse All Companies'])[1]")
	private WebElement browallcomplink;
	
	@FindBy(xpath="(//a[@title='Naukri FastForward- Resume Services'])[1]")
	private WebElement serviceslink;
	
	@FindBy(xpath="(//a[@title='Data Science , Analytics'])[1]")
	private WebElement datascilink;

	public Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	 public void recruiterlink_method(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(recruiterslink).perform();
	}
	 public void browseallrec_method()
	 {
		 browallreclink.click();
	 }
	 
	 public void recconnlink_method()
	 {
		 recconnlink.click();
	 }
	 
	 public void jobslink_method(WebDriver driver)
	 {
		 Actions act=new Actions(driver);
		act.moveToElement(jobslink).perform();
	 }
	 
	 public void jobsbyloclink_method()
	 {
		 jobsbyloclink.click();
	 }
	 
	 public void jobsbycomplink_method()
	 {
		 jobsbycomplink.click();
	 }
	 
	 public void companieslink_method(WebDriver driver)
	 {
		 Actions act=new Actions(driver);
		act.moveToElement(companieslink).perform();
	 }
	 public void intquslink_method()
	 {
		 intquslink.click();
	 }
	 
	 public void browallcomplink_method()
	 {
		 browallcomplink.click();
	 }
	 
	 public void serviceslink_method(WebDriver driver)
	 {
		 Actions act=new Actions(driver);
		act.moveToElement(serviceslink).perform();
	 }
	 public void datascilink_method()
	 {
		 datascilink.click();
	 }
}
