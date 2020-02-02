package com.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAmazonIphone {
	@Test
	public void amazonTest() {
		
	
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in");
	AmazonHomePage amhp=new AmazonHomePage(driver);
	amhp.searchTb.click();
	amhp.searchtext("iphone xr 64gb - yellow");
	String ip=amhp.iPhonePrice.getText().toString();
	ip=ip.replace(",","");
    driver.get("https://www.flipkart.com");
    FlipCartHomePage flp= new FlipCartHomePage(driver);
    flp.closeLogin.click();
    flp.searchTb.click();
	flp.searchtext("iphone xr 64gb - yellow");
	String ip2=flp.iPhonePrice.getText().toString();
	String ip3=ip2.replace(",","");
	 String ip4=ip3.substring(1);
	int flipkartPrice = Integer.parseInt(ip4);
	int amazonPrice = Integer.parseInt(ip);
	if(amazonPrice>flipkartPrice)
	{
		System.out.println("flipkart Price of iphone is less");
	}
	else if(amazonPrice==flipkartPrice){
		System.out.println("both prices are same");

	}
	else {
		System.out.println("amazon Price of iphone is less");

	}

	}
}
