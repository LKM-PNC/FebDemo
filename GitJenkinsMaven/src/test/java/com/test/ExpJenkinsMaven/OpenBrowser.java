package com.test.ExpJenkinsMaven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class OpenBrowser {
  
	WebDriver driver;
	
  @BeforeTest //open Browser and open url
  public void beforeTest() {
  
  	  System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
  	  driver = new ChromeDriver(); //open Browser
  	  System.out.println("Browser Opened");
  	  
  	  driver.get("http://the-internet.herokuapp.com/login"); // open URL
  	  
	    	  
  }

  @Test //login
  public void f() {
	  
  //enter username and password
	  driver.findElement(By.name("username")).sendKeys( "tomsmith");
	  driver.findElement(By.name("password")).sendKeys( "SuperSecretPassword!");
	// click enter (login)
	  driver.findElement(By.className("radius")).click();
	  System.out.println("Loggedin Successfull");
	 
  }
  
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
	  System.out.println("Browser Closed");
  }

}
