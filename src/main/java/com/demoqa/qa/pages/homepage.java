package com.demoqa.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.qa.base.TestBase;


public class homepage extends TestBase {

	
	Actions action = new Actions(driver);
	
//		PageFactory Or ObjectRepo
	
	@FindBy(xpath = "//h5[text()='Elements']")
	WebElement Element;
	
	@FindBy(xpath = "//h5[text()='Forms']")
	WebElement Forms;
	
	@FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
	WebElement AlertsFrams;
	
	@FindBy(xpath = "//h5[text()='Widgets']")
	WebElement WidgetsP;
	
	@FindBy(xpath = "//h5[text()='Interactions']")
	WebElement InteractionsP;
	
	@FindBy(xpath = "//h5[text()='Book Store Application']")
	WebElement BookApplication;
	
	@FindBy(xpath = "//img[contains(@src,'/images/Toolsqa.jpg')]")
	WebElement image;
	
	//Initializing Page Objects
	
	public homepage() {
		
		PageFactory.initElements(driver, this);
	}

	//Actions
	
	public String Validatehomepagetitle() {
		return driver.getTitle();
	}
		
	public boolean ValidateImage() {
		return image.isDisplayed();
	}
		
	public Elementpage clickElement() {
		((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
		action.moveToElement(Element).build().perform();
		Element.click();
		return new Elementpage();
	}
		
	public Forms clickForms() {
		((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
		action.moveToElement(Forms).build().perform();
		Forms.click();
		return new Forms();
	}
	
	public AlertsFramesWindows clickAlertsFrams() {
		((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
		action.moveToElement(AlertsFrams).build().perform();
		AlertsFrams.click();
		return new AlertsFramesWindows();
	}
	
	public Widgets clickWidgets() {
		((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
		action.moveToElement(WidgetsP).build().perform();
		WidgetsP.click();
		return new Widgets();
	}
	
	public Interactions clickInteractions() {
		((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
		action.moveToElement(InteractionsP).build().perform();
		InteractionsP.click();
		return new Interactions();
	}
	
	public BookStoreApplication clickBookApplication() {
		((JavascriptExecutor)driver).executeScript("scroll(0, 800)");
		action.moveToElement(BookApplication).build().perform();
		BookApplication.click();
		return new BookStoreApplication();
	}
	
}
