package com.qsp.trello.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloHomePage {
	public WebDriver driver;
	public TrelloHomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name = "email")
	private WebElement signUpTextField;
	//Getter method to access
	public WebElement getSignUpTextField() {
		return signUpTextField;
	}
	
	@FindBy(xpath = "//p[text()='Keep everything in the same place—even if your team isn’t.']/../../..//button[text()='Sign up - it’s free!']")
	private WebElement signUpLink;
	
	public WebElement getSignUpLink() {
		return signUpLink;
	}
	@FindBy(xpath = "//div[contains(@class, 'Buttonsstyles__ButtonGroup-sc-1jwidxo-3 jnMZCI')]//a[text()='Log in']")
	private WebElement loginLink;
	public WebElement getLoginLink() {
		return loginLink;
	}


	
}
