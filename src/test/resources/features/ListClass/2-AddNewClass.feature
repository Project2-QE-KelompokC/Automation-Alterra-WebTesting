@KelompokC
Feature: Add New Class
  Scenario: Add New Classes
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When admin click button class on side bar
    Then class list page will appear
    And user registered appear on class list page
    When user click add new class button
    Then appear modal from add new class
    And user click button cancel