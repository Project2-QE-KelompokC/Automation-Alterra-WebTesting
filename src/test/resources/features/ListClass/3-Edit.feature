@KelompokC
Feature: Edit Data Class Page

  Scenario: Edit Data Classes Page
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When admin click button class on side bar
    Then class list page will appear
    And user registered appear on class list page
    When admin click icon edit class on full name "Immersive Frontend Batch 1"
    Then appear modal form Edit class
    And admin click exit button