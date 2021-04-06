package com.timetracker.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.timetracker.webactions.DriverActions;

public class LoginPage extends DriverActions {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Time Tracker Web URL
	String url = "https://timetracker.anuko.com/login.php";
		
	//List of Web Elements on Time Tracker Login page
	String loginTextField = "login";
	String passwordTextField = "password";
	String loginButton = "btn_login";
	String profileEditLink = "profile_edit.php";
	
	//Functions to perform the actions on login page
	public void navigateToURL() {
		driver.get(url);
	}
		
	public void  enterLogin(String username) {
		writeText(By.id(loginTextField), username);
	}
			
	public void  enterPassword(String password) {
		writeText(By.id(passwordTextField), password);
	}

	public void  clickLogin() {
	    click(By.id(loginButton));
	}
	
	public void clickProfileEditLink() {
		click(By.xpath("//a[@href = 'profile_edit.php']"));
	}
	
	public void clearLogin() {
		clearText(By.id(loginTextField));
	}

}
