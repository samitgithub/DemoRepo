package com.demoqa.qa.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoqa.qa.base.TestBase;
import com.demoqa.qa.utils.*;

public class Elementpage extends TestBase{
	
	Actions action = new Actions(driver);
	TestUtils ScrSht = new TestUtils();

	
	@FindBy(xpath = "//span[text()='Text Box']")
	WebElement TxtBox;
	
	@FindBy(xpath = "//span[text()='Check Box']")
	WebElement ChkBox;
	
	@FindBy(xpath = "//span[text()='Radio Button']")
	WebElement Rdbtn;
	
	@FindBy(xpath = "//span[text()='Web Tables']")
	WebElement WebTbls;
	
	@FindBy(xpath = "//span[text()='Buttons']")
	WebElement Bttns;
	
	@FindBy(xpath = "//span[text()='Links']")
	WebElement Lnks;
	
	@FindBy(xpath = "//span[text()='Upload and Download']")
	WebElement Uplddwnld;
	
	@FindBy(xpath = "//span[text()='Dynamic Properties']")
	WebElement Dyncprop;
	
	@FindBy(id = "userName")
	WebElement user;
	
	@FindBy(id = "userEmail")
	WebElement email;
	
	@FindBy(id = "currentAddress")
	WebElement crntAddrss;
	
	@FindBy(id = "permanentAddress")
	WebElement prmntAddrss;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submit;
	
	public Elementpage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String ValidatehomepageUrl() {
		return driver.getCurrentUrl();
	}

	public void ClickTxtBox() throws IOException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		action.moveToElement(TxtBox).build().perform();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		TxtBox.click();
		TestUtils.takeScreenshotAtEndOfTest();
	}
	
	
	public void TxtBoxData() {
		
		user.sendKeys("Samit");
		email.sendKeys("sam@asd.com");
		crntAddrss.sendKeys("asd234");
		prmntAddrss.sendKeys("fg677");
		((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
		action.moveToElement(submit).build().perform();
		submit.click();
	}
	//Other example of above by parameterize
	public void TxtBoxDataPara(String usr, String mail, String ca, String pa) {
		
		user.sendKeys(usr);
		email.sendKeys(mail);
		crntAddrss.sendKeys(ca);
		prmntAddrss.sendKeys(pa);
		((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
		action.moveToElement(submit).build().perform();
		submit.click();
	}
	
	
	
	
	
	
	public void ClickChkBox() throws IOException{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		action.moveToElement(ChkBox).build().perform();
		ChkBox.click();
		TestUtils.takeScreenshotAtEndOfTest();
	}
	
	public void ClickRdbtn() throws IOException{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		action.moveToElement(Rdbtn).build().perform();
		Rdbtn.click();
		TestUtils.takeScreenshotAtEndOfTest();
	}
	
	public void ClickWebTbls() throws IOException{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		action.moveToElement(WebTbls).build().perform();
		WebTbls.click();
		TestUtils.takeScreenshotAtEndOfTest();
	}
	
	public void ClickBttns() throws IOException{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		action.moveToElement(Bttns).build().perform();
		Bttns.click();
		TestUtils.takeScreenshotAtEndOfTest();
	}
	
	public void ClickLnks() throws IOException{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		action.moveToElement(Lnks).build().perform();
		Lnks.click();
		TestUtils.takeScreenshotAtEndOfTest();
	}
	
	public void ClickUplddwnld() throws IOException{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		action.moveToElement(Uplddwnld).build().perform();
		Uplddwnld.click();
		TestUtils.takeScreenshotAtEndOfTest();
	}
	
	public void ClickDyncprop() throws IOException{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		action.moveToElement(Dyncprop).build().perform();
		Dyncprop.click();
		TestUtils.takeScreenshotAtEndOfTest();
	}

}
