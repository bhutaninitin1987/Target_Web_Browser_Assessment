package com.timetracker.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.timetracker.webactions.DriverActions;

public class ProfileEditPage extends DriverActions {

	public ProfileEditPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//List of Web Elements on Time Tracker Profile Edit page
	String loginTextField = "login";
	String passwordTextField = "password1";
	String confirmPasswordTextField = "password2";
	String saveButton = "btn_save";
	
	//Functions to perform the actions on profile edit page
	public void  enterLogin(String username) {
		writeText(By.id(loginTextField), username);
	}
		
	public void  enterPassword(String password)	{
		writeText(By.id(passwordTextField), password);
	}
		
	public void  enterConfirmPassword(String confirmPassword) {
		writeText(By.id(confirmPasswordTextField), confirmPassword);
	}
		
	public void  clickSave() {
	    click(By.id(saveButton));
	}
	
	public void clearLogin() {
		clearText(By.id(loginTextField));
	}
	
}
