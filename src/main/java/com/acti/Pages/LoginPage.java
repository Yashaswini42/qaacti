package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.acti.Base.DriverScript;

/* 
 * script:LoginPage
 * Tester:Yashaswini
 * Verified by : Yashaswini
 * Date created: 4/28/2020
 * Date Modified : 4/28/2020
 */

public class LoginPage extends DriverScript{

	
	//************page element************/
	
	@FindBy(id="logoContainer")WebElement actiLogo;
	@FindBy(id="username")WebElement usernameTb;
	@FindBy(name="pwd")WebElement passwordTb;
	@FindBy(id="loginButton")WebElement loginBtn;
	@FindBy(id="keepLoggedInCheckBox")WebElement logchbx;
	
	
	//**************initialization***********/
	
	public LoginPage()
	{
		//pageFactory is a class in POM used to initialize page elements in a class
		PageFactory.initElements(driver, this);
	}
	
	
	//*************page actions/Methods**************/
	
	public boolean verifyActiLogo()
	{
		return actiLogo.isDisplayed();
	}
	
	public void validateLogin(String username, String password)
	{
		usernameTb.sendKeys(username);
		passwordTb.sendKeys(password);
		loginBtn.click();
	}
	
	
	public String verifyLoginpageTitle()
	{
		return driver.getTitle();
	}
	
}
