
@DeleteUser @KelompokC @PositiveCase
Feature: Add new user
  Scenario: Add new user mentor with  role user and status active validation
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When admin click button User on side bar
    Then appear User List Page
    When admin click icon delete user "User55"
    Then appear modal confirmation Delete User
    And admin click button Yes on modal Delete User
