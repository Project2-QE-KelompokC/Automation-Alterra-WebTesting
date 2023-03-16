
@RegressionTesting
Feature: Regression Testing
  Scenario: User registered appear on user list page validation
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When admin click button User on side bar
    Then appear User List Page
    And user registered appear on User List Page

  @RegressionTesting
  Scenario: Add new user mentor with  role user and status active validation
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When admin click button User on side bar
    Then appear User List Page
    When admin click button Add New User
    Then appear modal form Add New User
    When admin input valid name "User555"
    And admin input valid email "user555@gmail.com"
    And admin input password "User555"
    And select Mentor on team dropdown
    And select User on role dropdown
    And select Active on status dropdown
    When admin click button Submit on modal Add New User
    Then appear name "User555"
    And email "user555@gmail.com" on list user


  @RegressionTesting
  Scenario: Update data user name and
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When admin click button User on side bar
    Then appear User List Page
    When admin click icon edit user on full name "User555"
    Then appear modal form Edit User
    When admin edit name "User666"
    And Admin edit email "User666@gmail.com"
    When admin click button Submit on modal Edit User
    Then appear new name "User666" on list user
    And appear new email "User666@gmail.com" on list user


  @RegressionTesting
  Scenario: Add new user mentor with  role user and status active validation
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When admin click button User on side bar
    Then appear User List Page
    When admin click icon delete user "User666"
    Then appear modal confirmation Delete User
    And admin click button Yes on modal Delete User