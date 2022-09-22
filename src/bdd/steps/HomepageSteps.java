package bdd.steps;

import bdd.base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomepageSteps extends BaseClass {

	@Given("user is in the homepage to checks for buttons")
	public void user_is_in_the_homepage_to_checks_for_buttons() {
		homePage.homePageElement();

	}

	@Then("user will try to get auto qoute")
	public void user_will_try_to_get_auto_qoute() {
		homePage.autoQuoteSteps("Only pay for what you need", "19111", "Access Denied");
	}	

}
