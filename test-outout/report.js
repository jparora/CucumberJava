$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/USER/eclipse-workspace/learnjava/src/main/java/Features/searchJob.feature");
formatter.feature({
  "line": 1,
  "name": "Search for the specific jobs",
  "description": "",
  "id": "search-for-the-specific-jobs",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User Enter the details for job search",
  "description": "",
  "id": "search-for-the-specific-jobs;user-enter-the-details-for-job-search",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is available on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Title of login page is CV Library",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User Enters Email and Password",
  "rows": [
    {
      "cells": [
        "jparora.1486@gmail.com",
        "red786monkey"
      ],
      "line": 7
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User Click on Login btn",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User land on My account page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User Enters job details the Keyword, Location and Search limit",
  "rows": [
    {
      "cells": [
        "Test Lead",
        "London",
        "up to 50 miles"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User Click on the Find Jobs btn",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user get list of jobs available with refine seatch option",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchJob.user_available_on_login_Page()"
});
formatter.result({
  "duration": 28599382607,
  "status": "passed"
});
formatter.match({
  "location": "SearchJob.title_of_login_page()"
});
formatter.result({
  "duration": 406215944,
  "status": "passed"
});
formatter.match({
  "location": "SearchJob.User_Enter_Email_Password(DataTable)"
});
formatter.result({
  "duration": 6503102961,
  "status": "passed"
});
formatter.match({
  "location": "SearchJob.user_click_login_btn()"
});
formatter.result({
  "duration": 23672681805,
  "status": "passed"
});
formatter.match({
  "location": "SearchJob.User_on_home_page()"
});
formatter.result({
  "duration": 249066455,
  "status": "passed"
});
formatter.match({
  "location": "SearchJob.user_Enters_job_details_the_Keyword_Location_and_Search_limit(DataTable)"
});
formatter.result({
  "duration": 3477040984,
  "status": "passed"
});
formatter.match({
  "location": "SearchJob.user_Lick_on_the_Find_Jobs_btn()"
});
formatter.result({
  "duration": 1645006010,
  "status": "passed"
});
formatter.match({
  "location": "SearchJob.user_get_list_og_jobs_available()"
});
formatter.result({
  "duration": 3478244253,
  "status": "passed"
});
});