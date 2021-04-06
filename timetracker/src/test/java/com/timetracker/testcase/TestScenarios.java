package com.timetracker.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.timetracker.pageobjects.LoginPage;
import com.timetracker.pageobjects.ProfileEditPage;
import com.timetracker.pageobjects.TimePage;
import com.timetracker.webactions.DriverProvider;

public class TestScenarios {
	
	@BeforeMethod
	public void initializeDriver() {	//Function to initialize the driver before each test
		DriverProvider.driver = DriverProvider.initializeDriver("Chrome");
	}
	
	@Test(priority = 0)
    public void updateUserPassword() { 
		//Test data
		String username = "testuser_001";
		String password = "Apr@2021";
		String passwordNew = "Mar@2021";
		
		//Object initializations for different pages
		LoginPage loginPage = new LoginPage(DriverProvider.driver); 
		ProfileEditPage profileEdit = new ProfileEditPage(DriverProvider.driver);
		TimePage timePage = new TimePage(DriverProvider.driver);
		
		//Test steps for execution
		
		//Steps to login into time tracker
		loginPage.navigateToURL();
		loginPage.enterLogin(username);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
		
		//Navigate to profile edit page
		loginPage.clickProfileEditLink();
		
		//Steps to update user password
		profileEdit.enterPassword(passwordNew);
		profileEdit.enterConfirmPassword(passwordNew);
		profileEdit.clickSave();
		
		//Logout from time tracker
		timePage.clickLogoutLink();
		
		//Steps to login again with updated password
		loginPage.enterPassword(passwordNew);
		loginPage.clickLogin();
		
		//Assertion for successful login
		Boolean logoutExist = DriverProvider.driver.findElement(By.xpath("//a[@href='logout.php']")).isDisplayed();
		Assert.assertTrue(logoutExist);
	}

	@Test(priority = 1)
	public void updateUserLogin() { 
		//Test data
		String username = "testuser_002";
		String password = "Mar@2021";
		String usernameNew = "testuser_003";
		
		//Object initializations for different pages
		LoginPage loginPage = new LoginPage(DriverProvider.driver); 
		ProfileEditPage profileEdit = new ProfileEditPage(DriverProvider.driver);
		TimePage timePage = new TimePage(DriverProvider.driver);
		
		//Test steps for execution
		
		//Steps to login into time tracker
		loginPage.navigateToURL();
		loginPage.enterLogin(username);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
		
		//Navigate to profile edit page
		loginPage.clickProfileEditLink();
		
		//Steps to update username
		profileEdit.clearLogin();
		profileEdit.enterLogin(usernameNew);
		profileEdit.clickSave();
		
		//Logout from time tracker
		timePage.clickLogoutLink();
		
		//Steps to login again with updated password
		loginPage.clearLogin();
		loginPage.enterLogin(usernameNew);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
		
		//Assertion for successful login
		Boolean logoutExist = DriverProvider.driver.findElement(By.xpath("//a[@href='logout.php']")).isDisplayed();
		Assert.assertTrue(logoutExist);
	}

	@AfterMethod
	public void closeDriver() {		//Function to close the driver after each test
		DriverProvider.driver.close();
	}
	
}
