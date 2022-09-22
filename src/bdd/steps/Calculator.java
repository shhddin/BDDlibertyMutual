package bdd.steps;

import bdd.base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calculator extends BaseClass {
	
	@When("click calculator")
	public void click_calculator() {
	    homePage.homepageCalculate();
	}

	@Then("user will land on calculation page and user will input zipcode {int}")
	public void user_will_land_on_calculation_page_and_user_will_input_zipcode(Integer int1) {
	    calculate.inputZip(int1.toString());
	}

	@Then("user will click on the option Own")
	public void user_will_click_on_the_option_own() {
	   calculate.isOwn(true, false, false);
	}

	@Then("user will click on less than one year")
	public void user_will_click_on_less_than_one_year() {
	  calculate.howOld(true, false, false);
	}

	@Then("click on continue")
	public void click_on_continue() {
	    calculate.clickContinue1();
	}
	
}
