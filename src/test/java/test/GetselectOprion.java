package test;

import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import utilities.FlipkartHomepage;
import utilities.SelectedTvpage;

public class GetselectOprion extends BaseTest{
	@Test
	public void GetselectOption()
	{
	 SelectedTvpage SP= new SelectedTvpage(driver);
	 FlipkartHomepage FH = new FlipkartHomepage(driver);
	 BasePage BP = new BasePage(driver);
	 
	 FH.WaitforUsername();
		FH.EnterUsername("9035718788");
		FH.Enterpassword("lathavya");
		FH.ClickonLogin();
		BP.Sleep(1000);
		FH.Waitforaction();
		FH.MoveOverToTVsandAppliance(driver);
		FH.WaitforMiTV();
		FH.ClickonMiTV();
		BP.Sleep(3000);
	    SP.GetOptionpfmin();
	}

}
