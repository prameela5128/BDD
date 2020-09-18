package com.stepdef;
import java.util.Map;
import java.util.Set;

import org.testng.*;
import com.capg.dto.Calculator;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddStepDefinition {
	Calculator calc;
	public Calculator getCalc() {
		return calc;
	}
	public void setCalce(Calculator calc) {
		this.calc=calc;
	}
	int res;
	
	@Given("^Calculator class object created$")
	public void calculator_class_object_created() throws Throwable {
		System.out.println("in given step: ");
		calc=new Calculator();
	}

	@When("^add method called with valid input$")
	public void add_method_called_with_valid_input() throws Throwable {
		System.out.println("in when step: ");
		res=calc.add(10, 20);
	}

	@Then("^it should return correct output$")
	public void it_should_return_correct_output() throws Throwable {
		System.out.println("in then step ");
		Assert.assertEquals(res, 30);
	}
	


	@When("^add method called with below inputs$")
	public void add_method_called_with_below_inputs(DataTable table) throws Throwable {
		Map<Integer,Integer> map=table.asMap(Integer.class,Integer.class);
		System.out.println("in when step: ");
		Set<Integer> keys= map.keySet();
		for(int num: keys) {
			System.out.println(num+" "+map.get(num));
		}
	}

	@Then("^it should return zero$")
	public void it_should_return_zero() throws Throwable {
		System.out.println("in then step ");
	}



}
