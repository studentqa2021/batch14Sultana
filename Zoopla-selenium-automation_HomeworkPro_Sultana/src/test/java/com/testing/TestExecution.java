package com.testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.Baselogin;
import com.generic.DriverManager;

public class TestExecution {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver= new DriverManager().getDriver();
		
		
	}
	
	@Test
	public void login() {
		new Baselogin().getLogin(driver);
		
	}
	
	
	@AfterTest
	public void teardown() {
		driver.quit();
		
		
	}

}
