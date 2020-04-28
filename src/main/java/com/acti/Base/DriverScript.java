package com.acti.Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverScript {
	
	public static WebDriver driver; 
	public static Properties pro;
	
	
	
	public DriverScript() {
		
		try{
			
			File src = new File("./actiConfiguration/config.properties");
			FileInputStream fis = new FileInputStream(src);
		    pro = new Properties();
			pro.load(fis);
			
		}catch (Exception e)
		{
			System.out.println("unable to load property file "+e.getMessage());
		}
	}
	
	
	public void initapp()
	{
		String brow = pro.getProperty("browser");
		
		if(brow.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./actiBrowsers/chromedriver.exe");
			driver=new ChromeDriver();
			
	
		}else if (brow.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./actiBrowsers/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String url = pro.getProperty("qaurl");
		
		driver.get(url);
	}
	
	
	

}
