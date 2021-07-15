package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.ScreenShot;

public class Baselogin {
	
	public void getLogin(WebDriver driver) {
		MasterPageFactory pf= new MasterPageFactory(driver);
		ScreenShot.getScreenShot(driver, "Home page");
		if(pf.getAcceptAllCookiesBtn().isDisplayed()) {
		Highlighter.addColor(driver, pf.getAcceptAllCookiesBtn());
		pf.getAcceptAllCookiesBtn().click();
		
		}
		
		
	pf.getFirstSigninBtn().click();
	pf.getEmail().sendKeys(new BaseConfig().getData("user"));
	pf.getPass().sendKeys(new BaseConfig().getData("pass"));
	pf.getSecondSigninBtn().click();
	
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	Actions ac= new Actions(driver);
	ac.moveToElement(pf.getMyzooplaBtn()).perform();
	
	if(pf.getSignOutBtn().isDisplayed()) {
		System.out.println("Test passed");
		Assert.assertTrue(pf.getSignOutBtn().isDisplayed());
	}else {
		System.out.println("Test failed");
		Assert.assertTrue(pf.getSignOutBtn().isDisplayed());
		
		
	}
		
		
		
		
		
	}	
	
		
		
		
		
		
	}
	
	
	


