@KelompokC
Feature: Verify Class Page

  Scenario: User registered appear on user list page validation
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When admin click button class on side bar
    Then class list page will appear
    And user registered appear on class list page