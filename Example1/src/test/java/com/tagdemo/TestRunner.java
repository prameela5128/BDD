package com.tagdemo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features="./src/test/resources/TagFeature")
//,tags= {"~@t1"})
public class TestRunner {

}
