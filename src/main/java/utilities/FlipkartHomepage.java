package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;


public class FlipkartHomepage extends BasePage {
	WebDriver driver;
	Actions MoveOver;
	BasePage BP= new BasePage(driver);
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement username; 
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	@FindBy(xpath="//button[.='Login']")
	private WebElement Login;
	@FindBy(xpath="//span[.='TVs & Appliances']")
	private WebElement TVs;
	@FindBy(xpath="(//a[@title='Mi'])[2]")
	private WebElement Mi;
	@FindBy(xpath ="//button[.='CONTINUE']")
	private WebElement Continuebutton;
	@FindBy(xpath="//input[@type='text']")
	private WebElement Searchinput;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Searchbutton; 
		
public FlipkartHomepage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

public void WaitforUsername()
	{
    VerifyElement(username);
	}
public void EnterUsername(String phonenumber)
	{
    username.sendKeys(phonenumber);
	}
public void Enterpassword(String Enterpassword)
	{
	  try{
		  Continuebutton.click();
	  }catch(Exception e){
		 System.out.println(" no Continue button");
	  }
	  VerifyElement(password);
	password.sendKeys(Enterpassword);
	}
public void ClickonLogin()
	{
	Login.click();
	}
public void EnterSearchInput(String Searchvalue)
	{
	Searchinput.sendKeys(Searchvalue);
	}
public void ClickonSearchbutton()
	{
	Searchbutton.click();
	}
public void Waitforaction()
	{
	VerifyElement(TVs);
	}
public void MoveOverToTVsandAppliance(WebDriver driver)
	{
	 MoveOver = new Actions(driver);
	 MoveOver.moveToElement(TVs).perform();
	}
public void MoveOverToMiTV(WebDriver driver)
	{
   	 MoveOver.moveToElement(Mi).perform();
	}
public void WaitforMiTV()
	{
	VerifyElement(Mi);
	}
public void ClickonMiTV()
	{
	Mi.click();
	}

}
