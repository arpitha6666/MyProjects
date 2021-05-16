package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ebay_HomeStepDefination {
	
@Given("I am on Ebay home page")
public void i_am_on_ebay_home_page() {
System.out.println("I am on Ebay home page");

}

@When("I click on Advanced link")
public void i_click_on_advanced_link() {
	System.out.println("I click on Advanced link");
    
}

@Then("I navigate to Advanced search page")
public void i_navigate_to_advanced_search_page() {
	System.out.println("I navigate to Advanced search page");
}
}
