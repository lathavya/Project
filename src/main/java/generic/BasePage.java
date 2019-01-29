package generic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import generic.BasePage;

public class BasePage extends BaseTest {
	WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver= driver;
	}

	public void Verifytitle(String title)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try{
		wait.until(ExpectedConditions.titleContains(title));
		Reporter.log(title+" is passed",true);
		}
		catch(Exception e){
			//BasePage BP = new BasePage(driver);
			//BP.Screenshot("unexpected");
			Reporter.log("title is not matching",true);
			Assert.fail();
		}
	}
	
	public void VerifyElement(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver,70);
		try{
			wait.until(ExpectedConditions.visibilityOf(element));
			}
		catch(Exception e){
		 //  BasePage BP = new BasePage(driver);
			//BP.Screenshot("unexpected");
			Reporter.log("Exsiting values in table not Present",true);
			Assert.fail();
			}
	}
	public static String Screenshot(WebDriver driver,String Screenshotname)
	{
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	     TakesScreenshot ts= (TakesScreenshot) driver ;
     	 File src = ts.getScreenshotAs(OutputType.FILE);
     	String Screenshotpath = "./Screenshot/"+Screenshotname+dateName+".png";
     	 File drc = new File(Screenshotpath);
     	 
		try {
			 FileUtils.copyFile(src, drc);
			} 
		catch (Exception e) 
		    {
			System.out.println("Expection while taking screenshot"+e.getMessage());
			} 
		return Screenshotpath;
	}

public void Sleep(long time){
	try {
		Thread.sleep(time);
	} catch (Exception e) {
	System.out.println("cannot handle sleep");	
	}
}

}
