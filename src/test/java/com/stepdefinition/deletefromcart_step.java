package com.stepdefinition;

import java.io.IOException;

import com.pages.deletefromcart;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class deletefromcart_step {
deletefromcart ob9 = new deletefromcart();
	

	@Given("^user launched Demoblaze$")
	public void user_launched_Demoblaze() {
		ob9.demoblaze_homePage();
	    
	}

	@When("^user selects  the product and addtocart$")
	public void user_selects_the_product_and_addtocart()  {
	   ob9.Select_product();
	}

	@When("^the user clicks on Cart button$")
	public void the_user_clicks_on_Cart_button() throws IOException, InterruptedException {
		ob9.Add_cart();
	}

	@When("^the user remove the cart$")
	public void the_user_remove_the_cart() {
	    ob9.cart();
	}

}
