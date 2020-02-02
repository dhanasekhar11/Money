package com.testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	@FindBy(xpath="//a/descendant::span[@class='a-price-whole']")
	public WebElement iPhonePrice;
	@FindBy(id="twotabsearchtextbox")
	public WebElement searchTb;
	AmazonHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void searchtext(String srch)
	{
		
		searchTb.sendKeys(srch,Keys.ENTER);
	}
	
	
}//"iphone xr 64gb - yellow"
