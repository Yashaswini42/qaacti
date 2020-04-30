package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;
import com.acti.Utils.common;

public class TaskListPage extends DriverScript {
	
	//@FindBy(partialLinkText="Add New")WebElement addnewlink;
     @FindBy(xpath="//div[@class='title ellipsis']") WebElement addnewbtn;
     @FindBy(xpath="//div[@class='item createNewCustomer']") WebElement newcustomeroption;
	 @FindBy(xpath="//div[@class='customerNameDiv']//input[@placeholder='Enter Customer Name']")WebElement customernametb;
	 @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")WebElement customerDescTextarea;
	 @FindBy(xpath="//div[contains(text(),'Create Customer')]")WebElement createcustbtn;

	 public TaskListPage()
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 public void clickAddNewbtn()
	 {
		 common.highlightele(addnewbtn);
		 addnewbtn.click(); 
	 }
	 
	 public void clicknewcustomeroption()
	 {
		 common.highlightele(newcustomeroption);
		 newcustomeroption.click();
	 }
	 
	 
	 public void enterCustomerName(String Customername)
	 {
		 common.highlightele(customernametb);
		 customernametb.sendKeys(Customername);
	 }
	 
	 public void entercustDesc(String custdesc)
	 {
		 common.highlightele(customerDescTextarea);
		 customerDescTextarea.sendKeys(custdesc);
	 }
	 
	 
	 public void clickcreatecustbtn()
	 {
		 common.highlightele(createcustbtn);
		 createcustbtn.click();
	 }
}
