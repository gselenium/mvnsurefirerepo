package com.gktech.testcases.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void gmail(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		System.out.println("Executing gmail login page");
	}
	
	@Test
	public void quikr(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://quikr.com");
		System.out.println("Executing quikr login page");
	}
}
 
