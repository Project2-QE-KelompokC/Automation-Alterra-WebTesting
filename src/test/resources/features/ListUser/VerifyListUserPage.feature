
@ListUser @Team
Feature: Verify User List Page

  Scenario: User registered appear on user list page validation
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When admin click button User on side bar
    Then appear User List Page
    And user registered appear on User List Page
