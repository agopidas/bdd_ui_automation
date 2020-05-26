package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;

public class OpenWeatherMap_StepDefinitions {

    HomePage home = new HomePage();

    @Given("the user is on the OpenWeatherMap home page")
    public void the_user_is_on_the_OpenWeatherMap_home_page() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        home.openUrl();
    }

    @Then("verify OpenWeatherMap home page image is displayed")
    public void verify_OpenWeatherMap_home_page_image_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify weather map tabs are displayed as {string}")
    public void verify_weather_map_tabs_are_displayed_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("verify weather report can be viewed as {string}")
    public void verify_weather_report_can_be_viewed_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
