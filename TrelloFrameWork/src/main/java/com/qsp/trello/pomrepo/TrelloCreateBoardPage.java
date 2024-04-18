package com.qsp.trello.pomrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloCreateBoardPage {
	WebDriver driver;
	public TrelloCreateBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@data-testid='create-board-title-input']")
	private WebElement boardTitle;
	
	public WebElement getBoardTitle() {
		return boardTitle;
	}
	public WebElement getCreateOption() {
		return createOption;
	}
	@FindBy(xpath = "//button[text()='Create']")
	private WebElement createOption;

}
