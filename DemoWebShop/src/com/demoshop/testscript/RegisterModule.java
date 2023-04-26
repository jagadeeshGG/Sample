package com.demoshop.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.demowebshop.generic.BaseClass;
import com.demowebshop.generic.DataProviderClass;

public class RegisterModule extends BaseClass
{
	@Test(dataProvider = "TestData", dataProviderClass = DataProviderClass.class)
	public void script(String fn,String ln,String mail,String pass)
	{
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(fn);
		driver.findElement(By.id("LastName")).sendKeys(ln);
		driver.findElement(By.id("Email")).sendKeys(mail);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(pass);
		driver.findElement(By.id("register-button")).click();
		
	}

}
