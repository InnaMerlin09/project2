package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class StaysSteps {
    HomePage homePage = new HomePage();



    @Given("user is on home page in Stays tab")
    public void user_is_on_home_page_in_stays_tab() {
        homePage.verifyUserIsOnHomePage();
        homePage.verifyStaysTabIsActivated();
    }

    @When("user enters destination {string} in Going to field")
    public void user_enters_destination_in_going_to_field(String destination) {

        homePage.enterDestination();
    }

    @And("user clicks on Search button")
    public void user_clicks_on_search_button() {
        homePage.clickSearchButton();
    }

    @Then("verify user is redirected to page with the result")
    public void verify_user_is_redirected_to_page_with_the_result() {
        homePage.verifyResultPageIsOpen();
    }
}
