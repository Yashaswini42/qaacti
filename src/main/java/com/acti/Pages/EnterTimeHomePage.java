package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;
import com.acti.Utils.common;

public class EnterTimeHomePage extends DriverScript {
	
	@FindBy(id="container_tasks")WebElement taskmenu;
	//@FindBy(class="userProfileLink username")WebElement usertxt;
	@FindBy(xpath="//a[@class='userProfileLink username']") WebElement userloggedName;
	@FindBy(id="logoutLink")WebElement logoutlink;
	
	public EnterTimeHomePage()
	{
		PageFactory.initElements(driver, this);
	}
    
	public void clicktaskMenu()
	{
		common.highlightele(taskmenu);
		taskmenu.click();
	}
	
	
	public void clicklogoutlink()
	{
		common.highlightele(logoutlink);
		logoutlink.click();
	}
	
	
	public String getuserloggedintext()
	{
		common.highlightele(userloggedName);
		return userloggedName.getText();
	}
}
