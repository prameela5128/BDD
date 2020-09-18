package com.capg.hotelbooking.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import com.capg.hotelbooking.page.LoginPage;

public class LoginStepDefinition {
	LoginPage login;
	WebDriver driver;
	
	public LoginStepDefinition() {
		System.setProperty("webdriver.chrome.driver","D:\\Program Files\\Desktop Dumps\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		 login=new LoginPage(driver);
	}
	
	 
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	 	driver.get("D:\\Program Files\\Desktop Dumps\\Downloads\\capgemini bootcamp\\BDD Material\\hotelBooking\\login.html");	 	
	}

	@When("^user enters invalid username password$")
	public void user_enters_invalid_username_password() throws Throwable {
		/*WebElement userTxt=driver.findElement(By.name("userName"));
		WebElement pwdTxt=driver.findElement(By.name("userPwd"));
		WebElement loginBtn=driver.findElement(By.className("btn"));
		
		userTxt.sendKeys("prameela");
		pwdTxt.sendKeys("capgemini123");
		loginBtn.click();*/
		
		login.setUserName("prameela");
		login.setPassword("prameela");
		login.clickLoginButton();
		
	
	}

	@Then("^alert box with Error message should be displayed$")
	public void alert_box_with_Error_message_should_be_displayed() throws Throwable {
		String errorMessage="Invalid login! Please try again!";
		String actualmsg=driver.switchTo().alert().getText();
		Assert.assertEquals(actualmsg, errorMessage);
	}

	@When("^user enters correct crediantials$")
	public void user_enters_correct_crediantials() throws Throwable {
		/*WebElement user=driver.findElement(By.name("userName"));
		WebElement pwd=driver.findElement(By.name("userPwd"));
		WebElement btn=driver.findElement(By.className("btn"));
		
		user.sendKeys("capgemini");
		pwd.sendKeys("capg1234");
		btn.click();*/
		
		login.setUserName("capgemini");
		login.setPassword("capg1234");
		login.clickLoginButton();
	
	}

	@Then("^hotelbooking page should be displayed$")
	public void hotelbooking_page_should_be_displayed() throws Throwable {
		String source= driver.getPageSource();
		Assert.assertTrue(source.contains("Hotel Booking Form"));
	}
	
	@When("^user keeps username and password blank$")
	public void user_keeps_username_and_password_blank() throws Throwable {
		WebElement user1=driver.findElement(By.name("userName"));
		WebElement pwd1=driver.findElement(By.name("userPwd"));
		WebElement btn=driver.findElement(By.className("btn"));
		
		user1.sendKeys("");
		pwd1.sendKeys("");
		btn.click();
	
	}

	@Then("^error message should be displayed$")
	public void error_message_should_be_displayed() throws Throwable {
		String error="* Please enter userName.";
		WebElement errorDiv=driver.findElement(By.id("userErrMsg"));
		String actualMsg=errorDiv.getText();
		Assert.assertEquals(error, actualMsg);
	}


}
