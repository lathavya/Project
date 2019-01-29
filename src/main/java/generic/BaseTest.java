package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class BaseTest implements Auto_const {
static{
	System.setProperty(Chrome_Key,Chrome_value);
	System.setProperty(FireFox_Key,FireFox_value);
}
	public WebDriver driver;
	public ExtentReports extent;
	 ExtentTest logger;
	 Conifguration c = new Conifguration();
	
	@BeforeMethod
	@Parameters("browser")
	public void OpenApp(String browser)
		{ 
		if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();
		}
		driver.get(c.getURL());
		driver.manage().window().maximize();
	
		}
	@BeforeTest
	public void extentreport()
		{
		ExtentHtmlReporter Reporter = new ExtentHtmlReporter("./test-output/Extentreport.html");
		ExtentReports extent = new ExtentReports();
        extent.attachReporter(Reporter);

		}
	@AfterMethod
	public void ReportsandCloseApp(ITestResult result)
		{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			try
			{
			String path = BasePage.Screenshot(driver, result.getName());
				Thread.sleep(2000);
				logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			}
			catch(Exception e)
			{
				System.out.println("Errorin capture in extent report");
			}
			BasePage.Screenshot(driver, result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			logger.log(Status.PASS, "These test case is pass"+result.getName());
		}
		extent.flush();
		driver.quit();
		}
}
