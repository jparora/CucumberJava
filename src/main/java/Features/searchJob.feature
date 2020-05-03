Feature: Search for the specific jobs

Scenario: User Enter the details for job search
     Given User is available on login page
     When Title of login page is CV Library
     Then User Enters Email and Password
          |jparora.1486@gmail.com|red786monkey|
     And User Click on Login btn
     Then User land on My account page
     Then User Enters job details the Keyword, Location and Search limit
          |Test Lead|London|up to 50 miles|
     Then User Click on the Find Jobs btn
     Then user get list of jobs available with refine seatch option
     

