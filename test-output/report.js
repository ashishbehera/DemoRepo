$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Automation/CucumberProjectDirectories/FreeCRMBDDFramework/src/test/java/com/qa/features/FreeCRM.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Validate Free CRM Home Page Test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "user logs into the application",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "validate logged in username",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 13564720987,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 55169449,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 1659122725,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_home_page_title()"
});
formatter.result({
  "duration": 59828620,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[CRMPRO]\u003e but was:\u003c[#1 Free CRM for Any Business: Online Customer Relationship Software]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.qa.stepdefinition.HomePageSteps.validate_home_page_title(HomePageSteps.java:35)\r\n\tat ✽.Then validate home page title(D:/Automation/CucumberProjectDirectories/FreeCRMBDDFramework/src/test/java/com/qa/features/FreeCRM.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "HomePageSteps.validate_logged_in_username()"
});
formatter.result({
  "status": "skipped"
});
});