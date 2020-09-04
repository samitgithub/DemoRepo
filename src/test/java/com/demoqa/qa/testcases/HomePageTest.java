package com.demoqa.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoqa.qa.base.TestBase;
import com.demoqa.qa.pages.homepage;



public class HomePageTest extends TestBase {
	
	homepage homePage;

	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		homePage = new homepage();
	}
		
	@Test(priority=1)
	public void HomePageTitleTest() {
		String title = homePage.Validatehomepagetitle();
		Assert.assertEquals(title, "ToolsQA");
	}
	
	@Test(priority=2)
	public void LogoImageTest() {
		boolean flag = homePage.ValidateImage();
		Assert.assertTrue(flag);	
	}
	
	@Test(priority=3)
	public void ClickOnElementsTest() {
		homePage.clickElement();
		boolean Elepagedisplayed = driver.findElement(By.xpath("//div[@class='main-header' and text()='Elements']")).isDisplayed();
		System.out.println(Elepagedisplayed);
		Assert.assertTrue(Elepagedisplayed);
	}
	
	@Test(priority=4)
	public void ClickOnFormsTest() {
		homePage.clickForms();
		boolean Formpagedisplayed = driver.findElement(By.xpath("//div[@class='main-header' and text()='Forms']")).isDisplayed();
		System.out.println(Formpagedisplayed);
		Assert.assertTrue(Formpagedisplayed);
	}
	
	@Test(priority=5)
	public void ClickOnAlertFrmTest() {
		homePage.clickAlertsFrams();
		boolean AlertFrmpagedisplayed = driver.findElement(By.xpath("//div[@class='main-header' and text()='Alerts, Frame & Windows']")).isDisplayed();
		System.out.println(AlertFrmpagedisplayed);
		Assert.assertTrue(AlertFrmpagedisplayed);
	}
	
	@Test(priority=6)
	public void ClickOnWidgetsTest() {
		homePage.clickWidgets();
		boolean Widgetpagedisplayed = driver.findElement(By.xpath("//div[@class='main-header' and text()='Widgets']")).isDisplayed();
		System.out.println(Widgetpagedisplayed);
		Assert.assertTrue(Widgetpagedisplayed);
	}
	
	@Test(priority=7)
	public void ClickOnInteractionsTest() {
		homePage.clickInteractions();
		boolean Intrctnpagedisplayed = driver.findElement(By.xpath("//div[@class='main-header' and text()='Interactions']")).isDisplayed();
		System.out.println(Intrctnpagedisplayed);
		Assert.assertTrue(Intrctnpagedisplayed);
	}
	
	@Test(priority=8)
	public void ClickOnBookStoreTest() {
		homePage.clickBookApplication();
		boolean BookStorepagedisplayed = driver.findElement(By.xpath("//div[@class='main-header' and text()='Book Store']")).isDisplayed();
		System.out.println(BookStorepagedisplayed);
		Assert.assertTrue(BookStorepagedisplayed);
	}
	
		
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}


