package com.acti.Testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.Base.DriverScript;
import com.acti.Pages.EnterTimeHomePage;
import com.acti.Pages.LoginPage;
import com.acti.Pages.TaskListPage;

public class BaseTest extends DriverScript {

	LoginPage lp;
	EnterTimeHomePage et;
	TaskListPage tp;
	
	public BaseTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void PreTest()
	{
		initapp();
        lp=new LoginPage();
        et=new EnterTimeHomePage();
        tp=new TaskListPage();
	}
	
	@AfterMethod
	public void Posttest()
	{
		driver.close();
	}
}
