package com.testGit.GitProject_FacebookLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Secure shell cryptography
public class LoginTest {

	public static WebDriver driver;
	
	@BeforeTest
	public void InitialStep()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Launching Browser");
	}
	
	@Test
	public void DoLogin()
	{
		System.out.println("Executing Login Test");
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.out.println("Entering Username");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("vairajapu@gmail.com");
		
		System.out.println("Entering Password");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("abc1234");
		
		System.out.println("Clicking on Login Button");
		driver.findElement(By.name("login")).click();
		
		System.out.println("Logging into Facebook Login");
	}
	
	@AfterTest
	public void CLoseBrowser()
	{
		if (driver!=null)
			driver.close();
		System.out.println("Closing Browser");
	}
}
