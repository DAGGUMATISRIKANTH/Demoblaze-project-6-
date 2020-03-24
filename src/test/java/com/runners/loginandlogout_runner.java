package com.runners;

import org.junit.runner.RunWith;

import com.runner.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resources\\Feature\\Testcase.feature",
plugin = {"pretty","html:reports/cucumber-html-report"},
tags= {"@tc06_loginandlogout"},
glue= {"steps"},
monochrome=true
)

public class loginandlogout_runner {

}
