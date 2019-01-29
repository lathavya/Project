package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class BuynowPage extends BasePage {
	
	@FindBy(xpath="//div[.='Mi LED Smart TV 4A 80 cm (32)']")
	private WebElement MiLEDSmart;
	
public BuynowPage(WebDriver driver)
	{
	super(driver);
	PageFactory.initElements(driver, this);
	}

public void VerifyLEB()
	{
	VerifyElement(MiLEDSmart);
	}
public void ClickonMiLEDSmart(){
	MiLEDSmart.click();
}
}
