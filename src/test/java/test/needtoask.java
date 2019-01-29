package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import generic.BasePage;

public class needtoask  {
public static void main(String[] args) {
//	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	BasePage BP = new BasePage(driver);
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9035718788");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("lathavya");
	driver.findElement(By.xpath("//button[.='Login']")).click();
	BP.Sleep(1000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("MiTV");
	BP.Sleep(1000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	BP.Sleep(2000);
	int x = driver.findElement(By.xpath("(//div[.='Resolution'])[1]")).getLocation().getX();
	System.out.println(x);
	
}

}
