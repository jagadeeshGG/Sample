package com.demowebshop.generic;

import org.testng.annotations.DataProvider;

public class DataProviderClass extends BaseClass
{
@DataProvider(name ="TestData")

public String [][] getData()
{
	String [][]arr={{"FirstName","LastName","jagadeeshgp018@gmail.com","password"}};
	return arr;
	
	}
}
