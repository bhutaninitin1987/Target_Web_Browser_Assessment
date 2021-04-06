package com.timetracker.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.timetracker.webactions.DriverActions;

public class TimePage extends DriverActions {

	public TimePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//List of Web Elements on Time Tracker Login page
	String logoutLink = "logout.php";
	
	//Functions to perform the actions on time page
	public void clickLogoutLink() {
		click(By.xpath("//a[@href = 'logout.php']"));
	}
}
