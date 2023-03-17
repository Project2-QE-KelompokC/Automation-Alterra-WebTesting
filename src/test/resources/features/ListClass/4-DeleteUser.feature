@KelompokC
Feature: Delete Class
  Scenario: Delete Classes
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When admin click button class on side bar
    Then appear User List Page
    When admin click icon delete Class "Immersive Backend Batch 2"
    Then appear modal confirmation Delete Class
    And admin click button Yes on modal Delete Class