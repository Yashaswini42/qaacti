package com.acti.Testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.Base.DriverScript;
import com.acti.Pages.LoginPage;

public class LoginPageTest extends DriverScript {

	LoginPage lp;
	
	 public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void Pretest()
	{
		initapp();
		 lp= new LoginPage();
	}
	
	@AfterMethod
	public void Posttest()
	{
		driver.close();
	}
	
	
	@Test(priority=1)
	public void TestverifyActiveLogo()
	{
		boolean flag = lp.verifyActiLogo();
		//System.out.println(flag);
		Assert.assertTrue(flag);
		
	}
	
	@Test(priority=2)
	public void  TestLoginpageTitle()
	{
		String tit=lp.verifyLoginpageTitle();
		//System.out.println("title: "+tit);
		Assert.assertEquals("actiTIME - Login", tit);
	}
	
//	@Test(priority=3)
//	public void TestvalidateLoginfunction()
//	{
//		lp.validateLogin("admin", "manager");
//	}
	
	@Test(priority=3)
	public void TestvalidateLoginfunction()
	{
		lp.validateLogin(pro.getProperty("username"), pro.getProperty("password"));
	}
	
}
