Feature: Feature to test end to end functionality of a website to order mobile phones

  Scenario: To check functionality of live website
    Given User is on the browser
    When User launches the Url
    Then user is taken to Page with title as

  Scenario: Navigation to Mobile Page
    Given User is on the home page of website
    When User proceeds(clicks) on the option
    Then User is navigated to Mobile selecting page

  Scenario: To check sort button functionality
    Given User is on the Mobiles Page
    When User selects the Sort By dropdown
    And User Selects option sort by name from dropdown
    Then Products are sorted by name

  Scenario: To verify the price of the mobile.
    Given user is on the mobiles page. Step2
    And user notes the price of Sony Experia.
    When user clicks the Sony Experia mobile.
    Then user is navigated to Page Sony Xperia - Mobile.
    And user checks the price of mobile here.
    Then user comapres the two prices.
