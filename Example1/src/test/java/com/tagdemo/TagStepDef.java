package com.tagdemo;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TagStepDef {
	@Before
	public void init() {
		System.out.println("in init method");    
	}
	@After
	public void cleanup() {
		System.out.println("in clean up method");    

	}
	

	@Given("^application is launched$")
	public void application_is_launched() throws Throwable {
		System.out.println("in given step :execution is launched");    

	}


	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	System.out.println("in given step :login");    

	}
	
	@Given("^user is on product page$")
	public void user_is_on_product_page() throws Throwable {
		System.out.println("in given step : product page ");    
	 
	}
	
	@Given("^user is on cart tag$")
	public void user_is_on_cart_tag() throws Throwable {
		System.out.println("in given step : cart tag ");    

	}
	
	@Given("^user is on payment page$")
	public void user_is_on_payment_page() throws Throwable {
		System.out.println("in given step : payment page");    

	}
	
	@When("^user selects payment mode CC$")
	public void user_selects_payment_mode_CC() throws Throwable {
		System.out.println("in when step : cc");    

	}
	
	@When("^user selects payment mode DC$")
	public void user_selects_payment_mode_DC() throws Throwable {
		System.out.println("in when step : DC");    

	}
	
	@When("^user selects payment mode cash$")
	public void user_selects_payment_mode_cash() throws Throwable {
		System.out.println("in when step : cash");    

	}
	
	@When("^user selects payment mode gpay$")
	public void user_selects_payment_mode_gpay() throws Throwable {
		System.out.println("in when step : gpay");    
    
	}
	
	@When("^user selects payment mode paytm$")
	public void user_selects_payment_mode_paytm() throws Throwable {
		System.out.println("in when step : user selects");    
	}
	
	
}
