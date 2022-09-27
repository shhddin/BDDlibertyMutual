package bdd.stepdefinition;

import bdd.base.BaseClass;
import io.cucumber.java.en.Given;

public class SearchNow extends BaseClass {
	@Given("user will serach {string}")
	public void user_will_serach(String string) {
		homePage.searchNow(string);
	}
}
