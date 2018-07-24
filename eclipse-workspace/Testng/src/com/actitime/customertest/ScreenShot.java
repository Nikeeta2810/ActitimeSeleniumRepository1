package com.actitime.customertest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class ScreenShot {
	@Test
	public void createCustomerTest() throws IOException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://amazon.com");
		//capture the screenshot
		EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
		 File srcImg =edriver.getScreenshotAs(OutputType.FILE);
		 //create new file in D Drive
		 File destFile=new File("D:\\ScreenShotSelenium\\amazon.png");
		 //copy the screenShot in the new file
		 FileUtils.copyFile(srcImg, destFile);
		 
		 
		 
		
	}
	

}
