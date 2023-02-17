package progressive.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import progressive.bdd.base.BaseClass;

public class AutoSteps extends BaseClass {

	@Given("user is in the homepage")
	public void user_is_in_the_homepage() {
		homePage.getTitle();
	}

	@When("user select auto from product")
	public void user_select_auto_from_product() throws InterruptedException {
		homePage.autoElement();
		Thread.sleep(3000);

	}

	@When("user will be in auto page")
	public void user_will_be_in_auto_page() {
		aboutP.getTitle("AUTO");
	}

	@When("user input {int} in zipcode")
	public void user_input_in_zipcode(Integer int1) {
		aboutP.inputZipCode(int1.toString());

	}

	@When("user input <zipcode> in zipcode")
	public void user_input_zipcode_in_zipcode(Integer int1) {
		aboutP.inputZipCode(int1.toString());
	}

	@When("click get a quote")
	public void click_get_a_quote() {
		aboutP.clickGetAQuote();

	}

	@Then("user will be in birthdate page")
	public void user_will_be_in_birthdate_page() {
		birthdatePage.getTitle();

	}

	@Then("user will be in {string} page")
	public void user_will_be_in_page(String string) {
		birthdatePage.getTitle(string);

	}

}
