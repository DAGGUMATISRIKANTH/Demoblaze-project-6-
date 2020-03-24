package com.runners;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\main\\resources\\Feature\\Testcase.feature",
plugin = {"pretty","html:reports/cucumber-html-report"},
tags= {"@tc01_loginwithexceldata"},
glue= {"steps"},
monochrome=true
)
public class loginwithexcel_runner {

}
