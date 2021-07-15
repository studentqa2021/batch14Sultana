package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//*[contains(text(),'Accept all cookies')])[2]")
	private WebElement acceptAllCookiesBtn;
	
	@FindBy(xpath="(//*[@class='css-18xug1d-ButtonLink-Button-ButtonLinkWithIcon et03gpj0'])[4]")
	private WebElement firstsigninBtn ;
	
	@FindBy(xpath="//*[@id='input-email-address']")
	private WebElement email;
	
	@FindBy(xpath="//*[@name='password']")
	private WebElement pass; 
	
	@FindBy(xpath="//*[@class='css-gi0wky-Button-SignInButton e1oiir0n4']")
	private WebElement secondSigninBtn;
	
	@FindBy(xpath="(//*[@data-ga-label='user account'])[1]")
	private WebElement myzooplaBtn;
	
	@FindBy(xpath="(//*[@class='esdwd6d0 css-wxwl91-StyledLink-Link e33dvwd0'])[5]")
	private WebElement signOutBtn;
	
	
	
	
	public WebElement getAcceptAllCookiesBtn(){
		return acceptAllCookiesBtn;
		
	}
	public WebElement getFirstSigninBtn() {
		return firstsigninBtn;
	}
	
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getSecondSigninBtn() {
		return secondSigninBtn;
	}
	public WebElement getMyzooplaBtn() {
		return myzooplaBtn;
	}
	public WebElement getSignOutBtn() {
		return signOutBtn;
	}
	
	

	
	
}
