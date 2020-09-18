package com.capg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverDemo{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Program Files\\Desktop Dumps\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.get("http://www.google.com");
		driver.get("D:\\Program Files\\Desktop Dumps\\Downloads\\capgemini bootcamp\\BDD Material\\hotelBooking\\login.html");
		String title = driver.getTitle();
		System.out.println(title);
		
		String text="hotel booking application";
		String sourcecode=driver.getPageSource().toLowerCase();
		if(sourcecode.contains(text)) {
			System.out.println("page contains expected heading");
		}
		else {
			System.out.println("no page heading available");
		}
		
		WebElement usernameTxt=driver.findElement(By.className("userName"));
		usernameTxt.sendKeys("Capgemini");
		WebElement pwdTxt=driver.findElement(By.xpath("//*[@id=\"mainCnt\"]/div/div[1]/form/table/tbody/tr[2]/td[2]/input"));
		pwdTxt.sendKeys("admin@123");
		WebElement btn=driver.findElement(By.className("btn"));
		btn.click(); //login button clicked
		String error=driver.switchTo().alert().getText();
		if(error.equalsIgnoreCase("Invalid Username password!!!")) {
			System.out.println("expected error msg displayed");
		}
		else {
			System.out.println("wrong error msg displayed");
		}
		//driver.close();
	}
}

