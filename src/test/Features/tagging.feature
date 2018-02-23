@FunctionalTest
Feature: Create different functionality of Free CRM

  @SmokeTest
  Scenario: Create Calendar
    Given :I am in calendar page

  @SmokeTest @RegressionTest
  Scenario: Create Contacts
    Given :I am in Contacts page

  @SmokeTest @RegressionTest
  Scenario: Create Deal
    Given :I am in deal page

  @SmokeTest @End2EndTest
  Scenario: Create Tasks
    Given :I am in task page

  @RegressionTest @End2EndTest
  Scenario: Create Cases
    Given :I am in case page

  @End2EndTest
  Scenario: Create Email
    Given :I am in Email page

  @SmokeTest @RegressionTest
  Scenario: Create Print
    Given :I am in Print page

  @SmokeTest @RegressionTest
  Scenario: Create Docs
    Given :I am in Docs page

  @SmokeTest
  Scenario: Create Reports
    Given :I am in reports page

  @RegressionTest
  Scenario: Create Forms
    Given :I am in forms page

  Scenario: Create SMS
    Given :I am in sms page

