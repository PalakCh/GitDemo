package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {
	
	 	@Given("^User is on the Netbanking login page$")
	    public void user_is_on_the_netbanking_login_page() throws Throwable {
	      System.out.println("Hi, usr is on netbanking login");
	    }

	    @When("^User login the application with username and password$")
	    public void user_login_the_application_with_username_and_password() throws Throwable {
	    	 System.out.println("user enters username and password");
	    }
	    
	    @When("^User login the application with \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_login_the_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	        System.out.println(strArg1);
	        System.out.println(strArg2);   
	    }

	    @Then("^Home page is populated$")
	    public void home_page_is_populated() throws Throwable {
	    	System.out.println("landed home page");
	    }

	    @And("^Cards are displayed$")
	    public void cards_are_displayed() throws Throwable {
	    	System.out.println("All CC are displayed");
	    }
	    
	    @When("^User login the application with (.+) and (.+)$")
	    public void user_login_the_application_with_and(String username, String password) throws Throwable {
	    	System.out.println(username);
	        System.out.println(password);
	    }

	}


