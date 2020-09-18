package com.capg.hotelbooking.login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="./src/test/resources/login",
glue="com.capg.hotelbooking.stepdef")
public class TestRunner {

}
