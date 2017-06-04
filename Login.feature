Feature: Application login
  Scenario Outline: Login to the page
    Given user opens the page
    Then User enter the "<LoginId>"
    Then User enters the "<Password>"
    And Click on sign in button
    And close the browser
    Examples:
      | LoginId |Password |
      |shris    |123      |
    |Rohit    |256      |
    |Parrot|789         |


