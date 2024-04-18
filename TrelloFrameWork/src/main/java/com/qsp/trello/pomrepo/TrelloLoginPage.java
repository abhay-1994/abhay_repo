package com.qsp.trello.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLoginPage {
	WebDriver driver;
	public TrelloLoginPage(WebDriver driver) {
		this.driver=driver;
		//Initializing all the element present in the login page
		PageFactory.initElements(driver, this);
	}
	
	//elements
	@FindBy(id = "username")
	private WebElement usernameTextField;
	@FindBy(id =  "login-submit")
	private WebElement continueButton;
	@FindBy(id="password")
	private WebElement passwordTextField;
	@FindBy(id = "login-submit")
	private WebElement loginButton;
	//getter methods
	
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}
	public WebElement getContinueButton() {
		return continueButton;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}

}
