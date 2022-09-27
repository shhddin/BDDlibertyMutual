package bdd.stepdefinition;

import bdd.base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomepageSteps extends BaseClass {
	@Given("user is in the homepage to checks for buttons")
	public void user_is_in_the_homepage_to_checks_for_buttons() {
		homePage.homePageElement();
	}

	@Then("user get title {string}")
	public void user_get_title(String string) {
		homePage.getTitle("Only pay for what you need");
	}

	@Then("then select Auto")
	public void then_select_auto() {
		homePage.selectAuto();
	}

	@Then("user input {int} to the zipcode")
	public void user_input_to_the_zipcode(Integer int1) {
		homePage.inputZipcode(int1.toString());
	}

	@Then("click the price button")
	public void click_the_price_button() {
		homePage.clickGetMyPriceButton();
	}

	@Then("user will be in the {string} page")
	public void user_will_be_in_the_page(String string) {
		homePage.getTextDenied("Access Denied");
	}

}
