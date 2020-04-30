package com.acti.Testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.Base.DriverScript;
import com.acti.Pages.EnterTimeHomePage;
import com.acti.Pages.LoginPage;
import com.acti.Pages.TaskListPage;

public class TestCreatecustomer extends BaseTest {

	
	
	@Test
	public void testcreatecustomer()
	{
		lp.validateLogin("admin", "manager");
		String userlogged = et.getuserloggedintext();
		System.out.println(userlogged);	
		et.clicktaskMenu();
		tp.clickAddNewbtn();
		tp.clicknewcustomeroption();
		tp.enterCustomerName("test2");
		tp.entercustDesc("creating test customer");
		tp.clickcreatecustbtn();
	}
}
