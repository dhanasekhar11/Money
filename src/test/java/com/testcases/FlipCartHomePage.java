package com.testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipCartHomePage {
	@FindBy(xpath="//button[@class=\"_2AkmmA _29YdH8\"]")
	public WebElement closeLogin;
	@FindBy(xpath="//div[@class=\"_6BWGkk\"]")
	public WebElement iPhonePrice;

	@FindBy(name="q")
	
	public WebElement searchTb;
	public FlipCartHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchtext(String srch)
	{
		
		searchTb.sendKeys(srch,Keys.ENTER);
	}

}
