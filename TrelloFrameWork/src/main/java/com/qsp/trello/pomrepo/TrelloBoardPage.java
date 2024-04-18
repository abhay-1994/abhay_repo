package com.qsp.trello.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloBoardPage {
	WebDriver driver;
	public TrelloBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//p[text()='Create']")
	WebElement createOption;
	
	public WebElement getCreateOption() {
		return createOption;
	}
	public WebElement getCreateBoard() {
		return createBoard;
	}
	@FindBy(xpath = "//span[text()='Create board']")
	WebElement createBoard;
	

}
