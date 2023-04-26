package com.demowebshop.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class BaseClass
{
public WebDriver driver;
@Parameters({"URL","chrome_key","chrome_value"})
@BeforeMethod()
public void openAp(String URL,String Key,String Value)
{
	
System.setProperty(Key,Value);
 driver=new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  driver.get(URL);
}
@AfterMethod

public void close()
{
	driver.close();
}
}
