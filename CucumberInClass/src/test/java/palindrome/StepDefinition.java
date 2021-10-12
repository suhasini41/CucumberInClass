package palindrome;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class StepDefinition
{
	String s,rs;
	String actualResult = " ";
	
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

	@Then("^I verfiy if they are equal to the \"([^\"]*)\"$")
	public void i_verfiy_if_they_are_equal_to_the(String ExpectedResult) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 if(rs.equals(s))
		   {
			   System.out.println("The string '"+s+"' is palindrome");
			   actualResult = "palindrome";
			   
		   }
		   else
		   {
			   System.out.println("The string '"+s+"' is not palindrome");
			   actualResult = "not palindrome";
		   }
		 Assert.assertEquals(actualResult, ExpectedResult);
	}

}
