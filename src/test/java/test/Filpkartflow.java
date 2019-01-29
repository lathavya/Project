package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import generic.Excel;
import utilities.BuynowPage;
import utilities.FlipkartHomepage;
import utilities.SelectedTvpage;

public class Filpkartflow extends BaseTest {
	
	@Test
	public void BasicFlow() {
		
		extent.createTest("BasicFlow", "Sample description");
		
		FlipkartHomepage FH = new FlipkartHomepage(driver);
		BasePage BP = new BasePage(driver);
		SelectedTvpage ST = new SelectedTvpage(driver);
		BuynowPage NP = new BuynowPage(driver);
		Excel e = new Excel("D:\\Downloads\\applaunch-master (1)\\need\\excel\\excel.xlsx");
		String un= e.getData("sheet1", 0, 0);
		String pw = e.getData("sheet1", 0, 1);
		System.out.println(un+ pw);
		
	/*	BP.Verifytitle("Online Shopping Site for Mobiles");
		FH.WaitforUsername();
		FH.EnterUsername(un);
		FH.Enterpassword(pw);
		FH.ClickonLogin();
		BP.Sleep(2000);
		FH.Waitforaction();
		FH.MoveOverToTVsandAppliance(driver);
		//FH.EnterSearchInput("MiTV");
		FH.WaitforMiTV();
		FH.ClickonMiTV();
		//FH.ClickonSearchbutton();
		BP.Sleep(2000);
		ST.waitforpricedropdown();
	    ST.SelectPricedropdown("20000");
	  //ST.WaitforBrand();
	 // ST.SelectMiBrand();
	//  ST.selectSmartTV();
	//   BP.Sleep(6000);
	  // ST.SelectCustomerRating(driver);	
	  //ST.ClickonResolution();	
	  //NP.ClickonMiLEDSmart();
	  //FH.MoveOverToMiTV(driver);
	
	  /*String title = driver.getTitle();
	    System.out.println(title);*/
	}
}

