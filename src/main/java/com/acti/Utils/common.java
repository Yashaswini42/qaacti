package com.acti.Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.acti.Base.DriverScript;

public class common extends DriverScript{
	
	
	public static void highlightele(WebElement el)
	{
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border: 2px  solid:red;')", el);
	}
	

}
