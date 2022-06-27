package com.sample.GitProjectWithMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	
		public static WebDriver driver;

		@BeforeTest
		public void setUp()
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium_Driver\\geckodriver.exe");
			 driver=new FirefoxDriver();
			// System.out.println("Launching Browser");
			 
		}

		@Test
		public void doLogin()
		{
			System.out.println("Exicuting Login Test");
			driver.get("https://en-gb.facebook.com/");
			driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("shubhangi21tathe@gmail.com");
			driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("641866");
			driver.findElement(By.name("login")).click();
		    System.out.println("Loggining into facebook account");
		
		}

@AfterTest
public void QuitDriver()
{
	if(driver!=null)
		driver.close();
}
}