package com.pom;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.base.baseclass;

	

	public class PIMpom extends baseclass {
		
		 @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[1]")
		  private WebElement employeeName;
				 
		 @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
			private WebElement employeeID;

		 @FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
		    private WebElement employeeStatus_dropdown;

		 @FindBy(xpath = "((//div[@class='oxd-select-text oxd-select-text--active'])[2]")
		    private WebElement include_dropdown;
		 
		 @FindBy(xpath = ("//input[@placeholder='Type for hints...'])[2]"))
		    private WebElement superviserName;
		 
		 @FindBy(xpath = ("(//div[@class='oxd-select-text oxd-select-text--active'])[3]"))
		    private WebElement job_title;
		 
		 @FindBy(xpath = ("(//div[@class='oxd-select-text oxd-select-text--active'])[4]"))
		    private WebElement sub_unit;
		 
		 @FindBy(xpath = ("//button[@type='reset']"))
		    private WebElement reset_btn;
		 
		 @FindBy(xpath = ("//button[@type='submit']"))
		    private WebElement Search_btn;


           public PIMpom(){
		        PageFactory.initElements(driver, this);
		    }

		   
		}
