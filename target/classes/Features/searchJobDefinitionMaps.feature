Feature: Search for the specific jobs

Scenario: User Enter the details for job search
     Given User is available on login page
     When Title of login page is CV Library
     Then User Enters Email and Password
          |Email|Password|
          |jparora.1486@gmail.com|red786monkey|
     And User Click on Login btn
     Then User land on My account page
     Then User Enters job details the Keyword, Location and Search limit
          |Keyword|Location|Distance|
          |Test Lead|London|up to 25 miles|
          |Test Analyst|Bristol|up to 50 miles|
     Then user get list of jobs available with refine search option
     

