package pom;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adv_search_page {

	@FindBy(id="qsb-keyskill-sugg")
	private WebElement searchtb;
	
	@FindBy(xpath="(//a[.='Advanced Search'])[2]")
	private WebElement advseachlink;
	
	@FindBy(name="qp")
	private WebElement keyskilltb;
	
	@FindBy(xpath="//div[.='Programming']")
	private WebElement choice;
	
	@FindBy(id="Sug_advLocation")
	private WebElement locationtb;
	
	@FindBy(id="adv_workExp_year")
	private WebElement workexpyeardd;
	
	@FindBy(id="dd_cja_expyr4")
	private WebElement yearselected;
	
	
	@FindBy(id="adv_workExp_month")
	private WebElement workexpmonthdd;
	
	@FindBy(id="dd_cja_expmn0")
	private WebElement monthselected;

			
	
	@FindBy(id="adv_exp_min")
	private WebElement expsalarydd;
	
	@FindBy(id="dd_cja_min3")
	private WebElement expsalselected;
	
	@FindBy(xpath="//input[@placeholder='Select the desired industry where you want to work']")
	private WebElement industrytb;
	
	@FindBy(xpath="//a[@data-id='ddAdvIndusrty_25']")
	private WebElement indcb;
	
	@FindBy(xpath="//a[@data-id='ddAdvIndusrty_25']")
	private WebElement indselected;
	
	
	@FindBy(id="adv_jobCategory")
	private WebElement jobacatdd;
	
	@FindBy(xpath="//li[.='IT Software - All Jobs']")
	private WebElement jobcatselected;
	
	@FindBy(id="adv_submit")
	private WebElement submitbtn;
	
	
	
	
	public Adv_search_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void searchmethod()
	{
		searchtb.click();
	}
	
	public void adv_search_method()
	{
		advseachlink.click();
	}
	
	public void keyskill_method(String keyskill_data,Robot r) throws InterruptedException
	{
		keyskilltb.sendKeys(keyskill_data);
		//Thread.sleep(2000);
		//r.keyPress(KeyEvent.VK_ESCAPE);
		//r.keyRelease(KeyEvent.VK_ESCAPE);
	}
	
	public void location_method(String loc_data)
	{
		locationtb.sendKeys(loc_data);
	}
	
	public void workexpyear_method()
	{
		workexpyeardd.click();
		//Select sel=new Select(workexpyeardd);
		//sel.selectByVisibleText(year);
	}
	
	public void yearselected_method()
	{
		yearselected.click();
	}
	
	public void workexpmonth_method()
	{
		workexpmonthdd.click();
		//Select sel=new Select(workexpmonthdd);
		//sel.selectByVisibleText(month);
	}
	
	public void monthselected_method()
	{
		monthselected.click();
	}
	
	public void expsalary_method()
	{
		expsalarydd.click();
		//Select sel=new Select(expsalarydd);
		//sel.selectByVisibleText(sal);
	}
	
	public void expsalselected_method()
	{
		expsalselected.click();
	}
	
	public void industry_method(String indu_data,Robot r)
	{
		industrytb.sendKeys(indu_data);
		indcb.click();
		//r.keyPress(KeyEvent.VK_ESCAPE);
	}
	public void indselected_method()
	{
		indselected.click();
	}
	
	public void jobcategory_method()
	{
		jobacatdd.click();
		//Select sel=new Select(jobacatdd);
		//sel.selectByVisibleText(jobcat);
	}
	
	public void jobcatselected_method()
	{
		jobcatselected.click();
	}
	
	public void submit_method()
	{
		submitbtn.click();
	}
	
	
}
