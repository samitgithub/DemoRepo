package com.demoqa.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static WebDriver driver;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sk00345470\\Desktop\\Selenium\\chromedriver.exe");
		driver =  new ChromeDriver(); // Launch Chrome
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/elements"); // Enter Url
		
		
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		
		
		
		
	}

	
	public static String MyCurrentUrl(){
		String Url = driver.getCurrentUrl();
		return Url;
		
		
	}
	
	
}
