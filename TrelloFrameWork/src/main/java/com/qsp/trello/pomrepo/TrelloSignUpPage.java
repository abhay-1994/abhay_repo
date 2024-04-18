package com.qsp.trello.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloSignUpPage  {
	WebDriver driver;
		public TrelloSignUpPage(WebDriver driver) {
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(id = "email")
		private WebElement signUpEmailTextField;
		//Getter method to access
		public WebElement getSignUpEmailTextField() {
			return signUpEmailTextField;
		}
		
		@FindBy(id = "signup-submit")
		private WebElement SignUpButton;
		
		
		public WebElement getSignUpButton() {
			
			return SignUpButton;
		}
	}


