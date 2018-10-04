package generic;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Photo
{
	public static String getphoto(WebDriver driver,String path,String folder,String testcasename)
	{
		String photopath=" ";
		
		try
		{
			Date d=new Date();
			String s=d.toString();
			String date=s.replace(":", "-");
			photopath=path+date+folder+".jpg";
			TakesScreenshot t=(TakesScreenshot)driver;
			File src=t.getScreenshotAs(OutputType.FILE);
			File dest=new File(photopath);
			FileUtils.copyFile(src, dest);
			
			
		}
		catch(Exception e)
		{
			Reporter.log("photo exception",true);
		}
		return photopath;
	}
}
