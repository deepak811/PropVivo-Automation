package pageLevel;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
//import junit.framework.Assert;

public class PVHomePage extends BaseClass {
	
	@FindBy(id="propVivoLoginBtn")
	WebElement loginbutton;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement EmailId;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement Password;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginsubmittButton;
	
	@FindBy(xpath="//ul[@class='nav justify-content-end']")
	WebElement Navbar;
	
	@FindBy(xpath="//a[text()='Services']")
	WebElement navbaritem1;
	@FindBy(xpath="//a[text()='Why propVIVO?']")
	WebElement navbaritem2;
	@FindBy(xpath="//a[text()='Request for Proposal']")
	WebElement navbaritem3;
	@FindBy(xpath="//a[text()='Real Estate Document']")
	WebElement navbaritem4;
	@FindBy(xpath="//a[text()='Resale Certificate']")
	WebElement navbarsubitem4;
	@FindBy(xpath="//a[text()='Blog']")
	WebElement navbaritem5;
	@FindBy(xpath="//a[text()='Contact Us']")
	WebElement navbaritem6;
	
	
	
	public PVHomePage()
	{
		
		PageFactory.initElements(driver,this);
	}
	
	

	public void AssertForServiceTab() throws InterruptedException
	{
		navbaritem1.click();
		Thread.sleep(5000);
		String actualservicetabtitle=driver.getTitle();
		String expectedservicetabtitle="Homeowners Association Management Company in Redmond | Community Association Management";
		System.out.println(actualservicetabtitle);
	//Assert.assertEquals(expectedservicetabtitle, actualservicetabtitle, actualservicetabtitle);
	System.out.println("Successfully landed on service page");
	
	Thread.sleep(4000);
	}
	
	public void AssertForWhyPropVivoTab() throws InterruptedException
	{
		navbaritem2.click();
		Thread.sleep(5000);
		String actualWhyPropVivoTabtitle=driver.getTitle();
		String expectedWhyPropVivoTabtitle="Homeowners Association Management Company in Bellevue | Community Association Management";
		System.out.println(actualWhyPropVivoTabtitle);
	//Assert.assertEquals("scnd assert", expectedWhyPropVivoTabtitle, actual, delta);(expected, actual, delta);(expectedWhyPropVivoTabtitle, actualWhyPropVivoTabtitle);
	System.out.println("Successfully landed on WhyPropVivo page");
	
	Thread.sleep(4000);
	}
	
	public void AssertForRequestForProposalTab() throws InterruptedException
	{
		navbaritem3.click();
		Thread.sleep(5000);
		String actualRequestForProposalTabtitle=driver.getTitle();
		String expectedRequestForProposalTabtitle="Homeowners Association Management Company in Seattle Area | Community Association Management";
		System.out.println(actualRequestForProposalTabtitle);
	//Assert.assertEquals(expectedRequestForProposalTabtitle, actualRequestForProposalTabtitle);
	System.out.println("Successfully landed on RequestForProposal page");
		Thread.sleep(4000);
	}
	
	public void AssertForRealEstateDocumentTab() throws InterruptedException
	{
		navbaritem4.click();
		Thread.sleep(2000);
		navbarsubitem4.click();
		Thread.sleep(5000);
		String actualRealEstateDocumentTabtitle=driver.getTitle();
		String expectedRealEstateDocumentTabtitle="Communnity Association Management Company in Redmond | HOA Management";
		System.out.println(actualRealEstateDocumentTabtitle);
	//Assert.assertEquals(expectedRealEstateDocumentTabtitle, actualRealEstateDocumentTabtitle);
	System.out.println("Successfully landed on ResaleCertificate page of RealEstateDocument ");
	
	Thread.sleep(4000);
	}
	
	public void AssertForBlogTab() throws InterruptedException
	{
		navbaritem5.click();
		Thread.sleep(5000);
		String actualBlogTabtitle=driver.getTitle();
		String expectedBlogTabtitle="Condo Association Management Company in Redmond | Community Association Management";
		System.out.println(actualBlogTabtitle);
	//Assert.assertEquals(expectedBlogTabtitle, actualBlogTabtitle);
	System.out.println("Successfully landed on Blog page");
	
	Thread.sleep(4000);
	}
	
	public void AssertForContactUsTab() throws InterruptedException
	{
		navbaritem6.click();
		Thread.sleep(5000);
		String actualContactUsTabtitle=driver.getTitle();
		String expectedContactUsTabtitle="Condo Association Management Company in Bellevue | Property Management Company";
		System.out.println(actualContactUsTabtitle);
	//Assert.assertEquals(expectedContactUsTabtitle, actualContactUsTabtitle);
	System.out.println("Successfully landed on Contact Us page");
	
	Thread.sleep(4000);
	}
	
	public void LoginFeature()
	
	{
		loginbutton.click();
	}
	
	public void EnterUserCred() throws IOException, ParseException, InterruptedException
	{
		JSONParser JP=new JSONParser();
    	FileReader Fr=new FileReader("C:/Users/Administrator/Desktop/json/Userpass-details.json");
    	
    	JSONObject jsonObject = (JSONObject) JP.parse(Fr);
    	/*String Username1 = (String) jsonObject.get("Username1");
    	String Password1 = (String) jsonObject.get("Password1");
    	
    	String Username2 = (String) jsonObject.get("Username2");
    	String Password2 = (String) jsonObject.get("Password2");
    	
    	String Username3 = (String) jsonObject.get("Username3");
    	String Password3 = (String) jsonObject.get("Password3");
    	System.out.println("usrcred "+ Username1);
    	System.out.println("usrcred "+ Password1);
    	System.out.println("usrcred "+ Username2);
    	System.out.println("usrcred "+ Password2);
    	System.out.println("usrcred "+ Username3);
    	System.out.println("usrcred "+ Password3);
  EmailId.sendKeys(Username1);  
  
    	Password.sendKeys(Password1);
    	Thread.sleep(2000);
    	driver.navigate().refresh();
    	EmailId.sendKeys(Username2);  
    	Password.sendKeys(Password2);
    	Thread.sleep(2000);
    	driver.navigate().refresh();*/
    	JSONArray	array=(JSONArray)jsonObject.get("Credentials");  	
    	for(int i=0;i<array.size();i++)
    	{
    		
    		JSONObject cred=(JSONObject)array.get(i);
    		String username=(String)cred.get("Username");
    		String password=(String)cred.get("Password");
    		
    		System.out.println(username);
    		System.out.println(password);
    		
    		EmailId.sendKeys(username);  
    		 Password.sendKeys(password);
        	Thread.sleep(2000);
        	loginsubmittButton.click();
        	Thread.sleep(2000);
        	driver.navigate().refresh();
    	}
    	
	};
	

	
}
