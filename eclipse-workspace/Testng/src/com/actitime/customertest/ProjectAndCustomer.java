package com.actitime.customertest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseClass;

public class ProjectAndCustomer extends BaseClass {
	@Test(groups="regressionTest")
	public void ProjectsAndCustomers()
	{
	 driver.findElement(By.xpath("//div[text()='Tasks']")).click();
	 driver.findElement(By.linkText("Projects & Customers")).click();
	 driver.findElement(By.xpath("//input[@value='Create New Project']")).click();
	 driver.findElement(By.name("customerId")).sendKeys("Our Company");
	 driver.findElement(By.name("name")).sendKeys("Company420");
	 driver.findElement(By.name("createProjectSubmit")).click();

	}

}
