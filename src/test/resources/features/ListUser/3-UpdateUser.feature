
@UpdateUser @KelompokC @Positive
Feature: Update Data User
  Scenario Outline: Update data user name and
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "<emailLogin>" and password "<passwordLogin>"
    Then click button login
    And already on Dashboard page
    When admin click button User on side bar
    Then appear User List Page
    When admin click icon edit user on full name "<userName>"
    Then appear modal form Edit User
    When admin edit name "<updateName>"
    And Admin edit email "<updateEmail>"
    And admin click button Submit on modal Edit User

    Examples:
      | emailLogin      | passwordLogin | userName  | updateName | updateEmail          |
      | Admin@gmail.com | qwerty        | saya12345 | saya123456 | saya123456@gmail.com |

  @UpdateInvalidUser @KelompokC @Negative
  Scenario: Update data user name and
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When admin click button User on side bar
    Then appear User List Page
    When admin click icon edit user on full name "User4"
    Then appear modal form Edit User
    When admin edit invalid name "wwww"
    And Admin edit invalid email "bukanEmail"
    When admin click button Submit on modal Edit User invalid data
    Then user "BapakKita" list data don't change