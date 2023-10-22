package com.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.baseclass;
import com.utility.Utility;

public class LoginTest extends baseclass {
	
	com.pom.Loginpom LoginPom ;
	
	
	
	@BeforeMethod
	public void setUp() 
	{
		launchTheWeb();
		
	}
	
	@AfterClass
	public void tearDown() 
	{
		//driver.quit();
	}
	@Test
	public void loginTest() throws InterruptedException 
	{  
		LoginPom = new com.pom.Loginpom();
		
		LoginPom.setUsername(LoginPom.getUsername());
		Thread.sleep(3000);
		
		LoginPom.setPassword(LoginPom.getPassword());
		Thread.sleep(3000);
		
		LoginPom.clickLogin();
		
		 String actualUrl = driver.getCurrentUrl();
	      String expectedUrl = "dashboard";
	      Assert.assertTrue(actualUrl.contains(expectedUrl));
		
		
	}
	@Test
	public void test_users() throws EncryptedDocumentException, IOException 
	{
		LoginPom = new com.pom.Loginpom();
       Utility utility = new Utility();
		
		Sheet sh = utility.read_Excel("Sheet1");
		
	    String key=  (String) utility.getSingleStringData(1, 0, sh);
		String value=(String) utility.getSingleStringData(1, 0, sh);
		LoginPom.clickLogin();
	}
	
	public void getDataFromExcel() throws EncryptedDocumentException, IOException {
		Utility utility = new Utility();
		
		Sheet sh = utility.read_Excel("Sheet1");
		
	    String key=  (String) utility.getSingleStringData(1, 0, sh);
		String value=(String) utility.getSingleStringData(1, 0, sh);
		
		
		
		
				
	}


}