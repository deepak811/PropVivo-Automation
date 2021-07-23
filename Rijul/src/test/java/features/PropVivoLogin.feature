@FunctionalTest

Feature: PropVivo Website Login Feature Testing 

@smoketest1
Scenario: PropVivo home page navigation link   

Given Launch google search and search for Propvio and launch propvivo url  
When click on servie tab and verify that user landed on serive page
Then click on why propVivo tab and verify that user landed on why propVivo page
Then click on request for proposal tab and verify that user landed on request for proposal page
Then click on Real estate document tab and select resale certificate verify that user landed on resale certificate page
Then click on blog tab and verify that user landed on blog page
Then click on contact us tab and verify that user landed on contact us page

@smoketest2
Scenario: PropVivo Login Feature with invalid user credentials
Given user clicks on login button
When user enter username  and password 
Then user clicks on Login button




