
Feature: Sign in
  @Login
  Scenario: Sign in with valid email and password
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page

