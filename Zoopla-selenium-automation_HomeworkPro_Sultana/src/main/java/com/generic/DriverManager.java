package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;

public class DriverManager {
	//any method get driver
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to(new BaseConfig().getData("QA_URL"));//Config
		driver.manage().window().maximize();
		return driver;
	}
	

		
		
	}
		
	
	










