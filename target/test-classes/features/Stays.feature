Feature: This feature allows user to search a stay

  Scenario: user is searching a stay
    Given user is on home page in Stays tab
    When user enters destination "Paris" in Going to field
    And user clicks on Search button
    Then verify user is redirected to page with the result