package com.capg.hotelbooking.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name="userName")
	@CacheLookup
	private WebElement userName;
	
	@FindBy(name="userPwd")
	@CacheLookup
	private WebElement password;
	
	@FindBy(className="btn")
	@CacheLookup
	private WebElement loginBtn;
	
	@FindBy(id="userErrMsg")
	@CacheLookup
	private WebElement userError;
	
	@FindBy(id="pwdErrMsg")
	@CacheLookup
	private WebElement passwordError;
	 
	
	public String getUserNameErrorMessage() {
		return userError.getText();
	}
	public String getPasswordErrorMessage() {
		return passwordError.getText();
	}
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void setUserName(String name) {
		userName.sendKeys(name);
	}
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void clickLoginButton() {
		loginBtn.click();;
	}
}
