package bdd.stepdefinition;

import bdd.base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calculator extends BaseClass {
	@When("User in the page")
	public void user_in_the_page() {
		homePage.homepageCalculate();

	}

	@Then("user input {string} to the zipcode")
	public void user_input_to_the_zipcode(String string) {

	}

	@Then("user will click on the option Own")
	public void user_will_click_on_the_option_own() {

	}

	@Then("user will click on less than one year")
	public void user_will_click_on_less_than_one_year() {

	}

	@Then("click on continue")
	public void click_on_continue() {

	}

}
