Feature: - to test loginn functionality

  Scenario: login is successful with valid credential
    #Gherkin
    Given open the browser
    When user enter the url
    And user enters username
    And user enters password
    When click on login button
    Then user is navigated to homepage
