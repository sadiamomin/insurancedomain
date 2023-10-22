package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.baseclass;

public class Loginpom extends baseclass {
	
	@FindBy(xpath="//p[text()='Username : Admin']")
	private WebElement username;
	
	@FindBy(xpath="//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials']/p[2]")
	private WebElement password;
	
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement inputUsername;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement inputPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	private WebElement forgotPassword;
	
	public Loginpom()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String getUsername() 
	{
		
		 String uName= username.getText();
		 System.out.println(uName);
		return uName.substring(uName.indexOf("A"),uName.length()).trim();
	}
	
	public String getPassword() 
	{
		
		 String pass= password.getText();
		 System.out.println(pass);
		 
		 return pass.substring(pass.lastIndexOf("a"),pass.length()).trim();
	}
	
	public void setUsername(String setUsername) 
	{
		inputUsername.sendKeys(setUsername);
	}
	
	public void setPassword(String setPassword) 
	{
		inputPassword.sendKeys(setPassword);
	}
	
	public void clickLogin() 
	{
		login.click();
		
	}

}