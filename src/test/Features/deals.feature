Feature: Deal data creation

  Scenario: Free CRM Create a new deal scenario

    Given User is already on Login Page
    When title of login page is Free CRM
    Then user enters username and password
    | naveenk | test@123 |

    Then  user clicks on login button
    Then  user is on home page
    Then  user moves to new deal page
    Then user enters deal deatils
    | test deal | 1000 | 50 | 10 |
    Then close the browser