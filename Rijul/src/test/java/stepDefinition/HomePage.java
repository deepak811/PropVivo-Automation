package stepDefinition;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLevel.PVHomePage;

public class HomePage extends BaseClass{
	
	 @Given("^Launch google search and search for Propvio and launch propvivo url$")
	    public void launch_google_search_and_search_for_propvio_and_launch_propvivo_url() throws InterruptedException  
	 {
	    BaseClass.initialization();   
	    Thread.sleep(2000);
	    }

	    @When("^click on servie tab and verify that user landed on serive page$")
	    public void click_on_servie_tab_and_verify_that_user_landed_on_serive_page() throws InterruptedException  {
	        PVHomePage HM=new PVHomePage();
	        Thread.sleep(2000);
	        HM.AssertForServiceTab();
	        
	    }
	    @Then("^click on why propVivo tab and verify that user landed on why propVivo page$")
	    public void click_on_why_propvivo_tab_and_verify_that_user_landed_on_why_propvivo_page() throws InterruptedException {
	    	PVHomePage HM=new PVHomePage();
	        
	    	HM.AssertForWhyPropVivoTab();
	    }

	    @Then("^click on request for proposal tab and verify that user landed on request for proposal page$")
	    public void click_on_request_for_proposal_tab_and_verify_that_user_landed_on_request_for_proposal_page() throws InterruptedException {
PVHomePage HM=new PVHomePage();
HM.AssertForRequestForProposalTab();
	       
	    }

	    @Then("^click on Real estate document tab and select resale certificate verify that user landed on resale certificate page$")
	    public void click_on_real_estate_document_tab_and_select_resale_certificate_verify_that_user_landed_on_resale_certificate_page() throws InterruptedException  {
	        
	    	PVHomePage HM=new PVHomePage();
	    	HM.AssertForRealEstateDocumentTab();
	    }

	    @Then("^click on blog tab and verify that user landed on blog page$")
	    public void click_on_blog_tab_and_verify_that_user_landed_on_blog_page() throws InterruptedException  {
	    	PVHomePage HM=new PVHomePage();
	    	HM.AssertForBlogTab();
	       
	    }

	    @Then("^click on contact us tab and verify that user landed on contact us page$")
	    public void click_on_contact_us_tab_and_verify_that_user_landed_on_contact_us_page() throws InterruptedException  {
	    	PVHomePage HM=new PVHomePage();
	    	HM.AssertForContactUsTab();
	      
	    }

	    @Given("^user clicks on login button$")
	    public void user_clicks_on_login() throws InterruptedException  {
	    	   
		    Thread.sleep(2000);
	    	PVHomePage HM=new PVHomePage();
	    	HM.LoginFeature();
	    }

	    @When("^user enter username  and password$")
	    public void user_enter_username_and_password() throws IOException, ParseException, InterruptedException {
	    	PVHomePage HM=new PVHomePage();
	    	HM.EnterUserCred();
	       
	    }

	    @Then("^user clicks on Login button$")
	    public void user_clicks_on_Login_button() throws InterruptedException  {
	    	Thread.sleep(1000);
	    	System.out.println("no submit");
	    	//PVHomePage HM=new PVHomePage();
	    	//HM.SubmitLoginCred();
	       
	    }
}
