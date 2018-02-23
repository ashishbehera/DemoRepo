Feature: Free CRM Login Feature

#  Scenario: Free CRM Login Test Scenario
#
#    Given User is already on Login Page
#    When title of login page is Free CRM
#    Then user enters username as "naveenk" and password as "test@123"
#    Then  user clicks on login button
#    And user is on home page
#
#    Scenario: user is able to create a new contact
#      Given User is already on Home Page
#      When  mouse over on contacts link
#      Then user clicks on New Contact link
#      Then user enters firstname and lastname
#      Then user clicks on save button
#      Then verify new contact created
#      Then close the browser

  Scenario Outline: Free CRM Login Test Scenario

    Given User is already on Login Page
    When title of login page is Free CRM
    Then user enters username as "<username>" and password as "<password>"
    Then  user clicks on login button
    And user is on home page
    Then close the browser

    Examples:

      | username | password |
      | naveenk  | test@123 |
    #  | tom      | test456  |




