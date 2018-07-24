package com.actitime.customertest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseClass;

public class UserTest  extends BaseClass{
	
	@Test(groups="smokeTest")
	 public void createCustomerTest()
    {
    	System.out.println("create the Customer ");
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//div[text()='Users']")).click();
    	driver.findElement(By.xpath("//span[text()='Create New User']")).click();   
    	driver.findElement(By.name("username")).sendKeys("lavanya");
    	driver.findElement(By.name("passwordText")).sendKeys("lavanya@123");
    	driver.findElement(By.name("passwordTextRetype")).sendKeys("lavanya@123");
    	driver.findElement(By.name("firstName")).sendKeys("Lavanya");
    	driver.findElement(By.name("lastName")).sendKeys("Raj");  
    	driver.findElement(By.name("email")).sendKeys("nickgup9@gmail.com");  
    	driver.findElement(By.name("workdayDurationStr")).sendKeys("2:00");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
    	
   

}
