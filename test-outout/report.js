$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/USER/eclipse-workspace/learnjava/src/main/java/Features/searchJobDefinitionMaps.feature");
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
        "Email",
        "Password"
      ],
      "line": 7
    },
    {
      "cells": [
        "jparora.1486@gmail.com",
        "red786monkey"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User Click on Login btn",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User land on My account page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User Enters job details the Keyword, Location and Search limit",
  "rows": [
    {
      "cells": [
        "Keyword",
        "Location",
        "Distance"
      ],
      "line": 12
    },
    {
      "cells": [
        "Test Lead",
        "London",
        "up to 25 miles"
      ],
      "line": 13
    },
    {
      "cells": [
        "Test Analyst",
        "Bristol",
        "up to 50 miles"
      ],
      "line": 14
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user get list of jobs available with refine search option",
  "keyword": "Then "
});
formatter.match({
  "location": "SerchJobDefinitionMaps.user_available_on_login_Page()"
});
formatter.result({
  "duration": 6869972668,
  "status": "passed"
});
formatter.match({
  "location": "SerchJobDefinitionMaps.title_of_login_page()"
});
formatter.result({
  "duration": 185056520,
  "status": "passed"
});
formatter.match({
  "location": "SerchJobDefinitionMaps.User_Enter_Email_Password(DataTable)"
});
formatter.result({
  "duration": 1431301662,
  "status": "passed"
});
formatter.match({
  "location": "SerchJobDefinitionMaps.user_click_login_btn()"
});
formatter.result({
  "duration": 3581334174,
  "status": "passed"
});
formatter.match({
  "location": "SerchJobDefinitionMaps.User_on_home_page()"
});
formatter.result({
  "duration": 1340627209,
  "status": "passed"
});
formatter.match({
  "location": "SerchJobDefinitionMaps.user_Enters_job_details_the_Keyword_Location_and_Search_limit(DataTable)"
});
formatter.result({
  "duration": 10738896023,
  "status": "passed"
});
formatter.match({
  "location": "SerchJobDefinitionMaps.user_get_list_og_jobs_available()"
});
formatter.result({
  "duration": 645066989,
  "status": "passed"
});
});