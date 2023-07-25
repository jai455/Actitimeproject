package com.ActitimeGenricLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Objectreposetry.LoginPage;

public class Baseclass {
	Filelibrary f=new Filelibrary();
	public static WebDriver driver;
	@BeforeSuite
	public void connectiondatabase()
	{
		Reporter.log("Databaseconnected",true);
	}
	@BeforeTest
	public void launchrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Filelibrary f=new Filelibrary();
		String URL = f.readdatafromexcel("url");
		driver.get(URL);
		driver.get("https://demo.actitime.com/");
		Reporter.log("Browser is Lounch Succesfully",true);
	}
	@BeforeMethod
	public void login() throws IOException
	{
		String un = f.readdatafromexcel("username");
		LoginPage lp=new LoginPage(driver);
		lp.getUntbx().sendKeys(un);
		
		String pw = f.readdatafromexcel("password");
		lp.getPwtbx().sendKeys(pw);
		lp.getLgbtn().click();
		
		Reporter.log("Login is Succesfully",true);
	}
	@AfterSuite
	public void databasdisconnected()
	{
		Reporter.log("Database is Disconnected",true);
	}
	@AfterMethod
	public void logout()
	{
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("logout is succesfully",true);
	}
	@AfterTest
	public void closebrowser()
	{
		driver.close();
		Reporter.log("Browser is close",true);
	}
	

}
