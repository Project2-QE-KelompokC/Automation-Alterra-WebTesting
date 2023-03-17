
@AddNewUser @KelompokC @Positive
Feature: Add new user
  Scenario Outline: Add new user mentor with  role user and status active validation
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "<emailLogin>" and password "<passwordLogin>"
    Then click button login
    And already on Dashboard page
    When admin click button User on side bar
    Then appear User List Page
    When admin click button Add New User
    Then appear modal form Add New User
    When admin input valid name "<newNameUser>"
    And admin input valid email "<newEmail>"
    And admin input password "<newPassword>>"
    And select Mentor on team dropdown
    And select User on role dropdown
    And select Active on status dropdown
    And admin click button Submit on modal Add New User

    Examples:
      | emailLogin      | passwordLogin | newNameUser | newEmail            | newPassword |
      | Admin@gmail.com | qwerty        | saya12345   | saya12345@gmail.com | saya12345   |

  @AddInvalidUser @KelompokC @Negative
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