package palindrome;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StepDefinition
{
	String s,rs;
	boolean flag = false;
	
	@Given("^a \"([^\"]*)\"$")
	public void a(String str) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   s = str;
	}
	
	@When("^I reverse the String$")
	public void i_reverse_the_String() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   StringBuilder sb = new StringBuilder(s);
	   rs = sb.reverse().toString();
	}

	@Then("^I verfiy if they are palindrome or not$")
	public void i_verfiy_if_they_are_palindrome_or_not() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	   if(rs.equals(s))
	   {
		   System.out.println("The string '"+s+"' is palindrome");
	   }
	   else
	   {
		   System.out.println("The string '"+s+"' is not palindrome");
	   }
	}

}
