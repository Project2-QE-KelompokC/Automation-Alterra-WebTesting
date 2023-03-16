
@AddNewUser @KelompokC @PositiveCase
Feature: Add new user
  Scenario: Add new user mentor with  role user and status active validation
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When admin click button User on side bar
    Then appear User List Page
    When admin click button Add New User
    Then appear modal form Add New User
    When admin input valid name "User5"
    And admin input valid email "user5@gmail.com"
    And admin input password "User5"
    And select Mentor on team dropdown
    And select User on role dropdown
    And select Active on status dropdown
    When admin click button Submit on modal Add New User
    Then appear name "User5"
    And email "user5@gmail.com" on list user

@AddInvalidUser @KelompokC @NegativeCase
  Scenario: Add new user mentor with  role user and status active validation
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When admin click button User on side bar
    Then appear User List Page
    When admin click button Add New User
    Then appear modal form Add New User
    When admin input valid name ""
    And admin input valid email "####"
    And admin input password "User1"
    And select Mentor on team dropdown
    And select User on role dropdown
    And select Active on status dropdown
    When admin click button Submit on modal Add New User
    Then button Submit on modal Add New User can't be click