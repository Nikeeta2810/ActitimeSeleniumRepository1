package com.actitime.customertest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseClass;

public class LoginTest extends BaseClass{
	@Test
	public void verifyHomePage(){
		String expTittle="actiTIME - Enter Time-Track";
		//capture tittle from the Application
		String actTitle=driver.getTitle();
		Assert.assertEquals(actTitle, expTittle);
		
	}
	@Test
	public void verifyHomePageLogo(){
    boolean imgStat=driver.findElement(By.xpath("//img[contains(@src,'custom/logo')]")).isDisplayed();
		Assert.assertTrue(imgStat);
		
	}
}
