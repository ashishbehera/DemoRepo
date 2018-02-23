Feature:Free CRM create contacts

  Scenario Outline: Free CRM Create a new contact scenario

    Given User is already on Login Page
    When title of login page is Free CRM
    Then user enters username as "<username>" and password as "<password>"
    Then  user clicks on login button
    Then  user is on home page
    Then  user moves to new contact page
    Then user enters "<firstname>" and "<lastname>" and "<position>"
    Then close the browser


    Examples:

      | username | password | firstname | lastname | position |
      | naveenk  | test@123 | Tom       | Peter    | Manager  |
      | naveenk  | test@123 | David     | Dsouza   | Director |
