package com.stepdef;

import org.testng.Assert;

import com.capg.dto.Calculator;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SubtractStepDefinition {
	Calculator calc;
	int res;
	
	@When("^subtract method called with (\\d+) and (\\d+) inputs$")
	public void subtract_method_called_with_and_inputs(int arg1, int arg2) throws Throwable {
//		AddStepDefinition add=new AddStepDefinition();
//		calc=add.getCalc();
		calc=new Calculator();
		System.out.println("in when step: "+arg1+" "+arg2);
		res=calc.subtract(arg1, arg2);
	}

	@Then("^it returns (\\d+) value$")
	public void it_returns_value(int arg1) throws Throwable {
		System.out.println("in then step: "+arg1);
		Assert.assertEquals(res, arg1);
	}


	

}
