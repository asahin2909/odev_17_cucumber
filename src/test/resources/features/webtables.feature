Feature: Testing Webtables functionality

  Scenario: Adding and editing a record
    Given User navigates to the webtables page
    When User clicks on the Add button and adds a new record
    And User edits the added record
    Then User should see the updated record
