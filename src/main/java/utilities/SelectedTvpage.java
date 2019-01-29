package utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.BasePage;

public class SelectedTvpage extends BasePage 
{
	WebDriver driver;
	
	@FindBy(xpath="(//select)[2]")
	private WebElement pricedropdown;
	@FindBy(xpath="(//div[.='Mi'])[1]")
	private WebElement Brand;
	@FindBy(xpath="(//div[.='Yes'])[1]")
	private WebElement Smarttv;
	@FindBy(xpath="(//div[contains(text(),'& above')])[1]")
	private WebElement CustomerRating;
	@FindBy(xpath="(//div[.='Resolution'])[1]")
	private WebElement Resolution;
	@FindBy(xpath="//div[@title='HD Ready']")
	private WebElement HD;
	@FindBy(xpath="(//div[.='Operating System'])[1]")
	private WebElement OperatingSysetm; 
	@FindBy(xpath="(//div[.='Android Based'])[1]")
	private WebElement Android;
	@FindBy(xpath="(//div[.='Connectivity Features'])[1]")
	private WebElement Connectivity;
	@FindBy(xpath="(//div[.='Built-in Wi-Fi'])[2]")
	private WebElement Wifi;
	@FindBy(xpath="(//div[contains(.,'Mi LED')])[8]")
	private WebElement MiLED;
    @FindBy(xpath="(//select)[1]")
    private WebElement Min;
    
public SelectedTvpage(WebDriver driver)
	{
	super(driver);
	PageFactory.initElements(driver, this);
	}
public void waitforpricedropdown()
	{
	VerifyElement(pricedropdown);
	}
public void SelectPricedropdown(String value)
	{
	Select s = new Select(pricedropdown);
	s.selectByValue(value);
	}
public void WaitforBrand()
	{
VerifyElement(Brand);
	}
public void SelectMiBrand()
	{
	Brand.click();
	}
public void WaitforSmartTV()
	{
	VerifyElement(Smarttv);
	}
public void selectSmartTV()
	{
	Smarttv.click(); 
	}
public void SelectCustomerRating(WebDriver driver)
	{
	int x = CustomerRating.getLocation().getX();
	int y = CustomerRating.getLocation().getY();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy("+x+""+y+")");
	Actions as = new Actions(driver);
	as.moveToElement(CustomerRating).click().build().perform();
	//CustomerRating.click();
	}
public void ClickonResolution()
	{
	Resolution.click();
	}
public void ClickonHDAsResolution()
	{
	HD.click();
	}
public void SelectOperatingSystem()
	{
	OperatingSysetm.click();
	}
public void SelectAndroidAsOperatingSystem()
	{
	Android.click();
	}
public void SelectConnectivityFeatures()
	{
	Connectivity.click();
	}
public void SelectWifi()
	{
	Wifi.click();
	}
public void SelectMiTv()
	{
	MiLED.click();
	}
public void GetOptionpfmin()
	{
	 Select s= new Select(Min);
	 List<WebElement> Option = s.getOptions();
	 ArrayList<String> l = new ArrayList<String>();
	 Option.size();
	 for( WebElement nameoption:Option)
	{
	 String name = nameoption.getText(); 
	 l.add(name);
	// System.out.println(name);
	}
	 Collections.sort(l);
	 for(String s1:l)
	{
		 System.out.println(s1);
	}
	}
}