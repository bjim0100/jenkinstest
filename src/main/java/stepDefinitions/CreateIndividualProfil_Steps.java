package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class CreateIndividualProfil_Steps extends DriverFactory{

	@Given("^user navigates to url$")
	public void user_navigates_to_url() throws Exception  {
	    profilePage.getmarketcircle();
	}

	@When("^user submits email$")
	public void user_submits_email() throws Exception  {
	    profilePage.enteremail();
	}

	@When("^user submits password$")
	public void user_submits_password() throws Exception  {
	    profilePage.enterpassword();
	}

	@When("^user clicks login button$")
	public void user_clicks_login_button() throws Exception  {
	    profilePage.clicklogin();
	}

	@Given("^user clicks on header$")
	public void user_clicks_on_header() throws Exception  {
	   profilePage.clickprofilename();
	}
	
	@Given("^user clicks on profile$")
	public void user_clicks_on_profile() throws Exception  {
	    profilePage.clickprofile();
	}

	@When("^user clicks on edit profile$")
	public void user_clicks_on_edit_profile() throws Exception  {
	    profilePage.clickeditprofile();
	}

	@When("^user submits \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_submits_and(String firstname, String lastname) throws Exception  {
	   profilePage.enterFirstname(firstname);
	   profilePage.enterLastname(lastname);
	}

	@When("^user submits \"([^\"]*)\"$")
	public void user_submits(String address) throws Exception  {
	    profilePage.enteraddress(address);
	}

//	@When("^user edits Date of birth$")
//	public void user_edits_Date_of_birth() throws Exception  {
//	    profilePage.enterdateofbirth();
//	}
	
	

	@When("^user sends phone number \"([^\"]*)\"$")
	public void user_sends_phone_number(String number) throws Exception  {
	   profilePage.sendnumber(number);
	}

	@When("^user submits  profile email$")
	public void user_submits_profile_email() throws Exception  {
	    profilePage.sendprofileemail();
	}



	@When("^user submits  gps \"([^\"]*)\"$")
	public void user_submits_gps(String gps) throws Exception  {
	    profilePage.entergps(gps);
	}
	
	@When("^user selects gender$")
	public void user_selects_gender() throws Exception  {
	 profilePage.selectGender();
	}

	@When("^user changes privacy level$")
	public void user_changes_privacy_level() throws Exception  {
	   profilePage.privacylevel();
	}

	@When("^user clicks save$")
	public void user_clicks_save() throws Exception  {
	    profilePage.clicksave();
	}

	@Then("^user information should be saved successfully$")
	public void user_information_should_be_saved_successfully() throws Exception  {
	    profilePage.editprofilesuccessmessage();
	}


	
}
