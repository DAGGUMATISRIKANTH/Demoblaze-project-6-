package com.stepdefinition;

import java.io.IOException;

import com.pages.loginwithexcel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginwithexcel_step {
	 loginwithexcel ob6=new  loginwithexcel();
	 

		
		@Given("^user launches chromebrowser$")
		public void user_launches_chromebrowser()  
		{
		  ob6.url();  
		}

		@When("^user opens  Demoblaze website$")
		public void user_opens_Demoblaze_website()  {
		    ob6.demoblaze_homePage();
		}

		@Then("^user clicked on login button$")
		public void user_clicked_on_login_button()  {
		    ob6.userclick();
		}

		@Then("^the values are taken from the excelsheet$")
		public void the_values_are_taken_from_the_excelsheet() throws IOException, InterruptedException  {
			for(int i=1;i<=3;i++)
			{
				ob6.usernamepassword(i);
				ob6.url();
				ob6.demoblaze_homePage();
				ob6.userclick();
			}
		}
	}


