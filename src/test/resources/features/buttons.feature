Feature: Testing Buttons functionality

  Scenario: Clicking on the Click Me button
    Given User navigates to the elements page
    When User clicks on the Buttons section
    And User clicks on the Click Me button
    Then User should see the message
