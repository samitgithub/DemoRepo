package com.demoqa.qa.testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demoqa.qa.base.TestBase;
import com.demoqa.qa.pages.Elementpage;
import com.demoqa.qa.pages.homepage;
import com.demoqa.qa.utils.TestUtils;

public class ElementPageTest extends TestBase {

	homepage homePage;
	Elementpage Elementpage;
	String sheetName = "Sheet1";
	
	public ElementPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new homepage();
		homePage.clickElement();
		Elementpage = new Elementpage();
	}

	@Test(priority=1)
	public void HomePageTitleTestEle() {
		String title = Elementpage.ValidatehomepageUrl();
		System.out.println(title);
		Assert.assertEquals(title, "https://demoqa.com/elements");
		}
	
	
	@Test(priority=2)
	public void ClkTxtBoxTest() throws IOException{
		Elementpage.ClickTxtBox();
		Elementpage.TxtBoxData();
		}
	
	@Test(priority=3, dataProvider="DataDrivenapproach")
	public void ClkTxtBoxPapaTest(String name, String email, String ca, String pa) throws IOException{
		Elementpage.ClickTxtBox();
		//Elementpage.TxtBoxDataPara("Samit", "hgdc@hfk.com" , "djkhfjkshk", "hjhhkk");
		Elementpage.TxtBoxDataPara(name, email, ca, pa);
		}
	
	@DataProvider
	public Object[][] DataDrivenapproach() {
		Object data[][] = TestUtils.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=4)
	public void ClickChkBoxTest() throws IOException{
		Elementpage.ClickChkBox();
		}
	
	@Test(priority=5)
	public void ClickRdbtnTest() throws IOException{
		Elementpage.ClickRdbtn();
		}
	
	@Test(priority=6)
	public void ClickWebTblsTest() throws IOException{
		Elementpage.ClickWebTbls();
		}
	
	@Test(priority=7)
	public void ClickBttnsTest() throws IOException{
		Elementpage.ClickBttns();
		}
	
	@Test(priority=8)
	public void ClickLnksTest() throws IOException{
		Elementpage.ClickLnks();
		}
	
	@Test(priority=9)
	public void ClickUplddwnldTest() throws IOException{
		Elementpage.ClickUplddwnld();
		}
	
	@Test(priority=10)
	public void ClickDyncpropTest() throws IOException{
		Elementpage.ClickDyncprop();
		}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
