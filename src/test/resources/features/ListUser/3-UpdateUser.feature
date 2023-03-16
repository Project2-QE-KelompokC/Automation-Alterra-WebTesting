
@UpdateUser @KelompokC @PositiveCase
Feature: Update Data User
  Scenario: Update data user name and
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When admin click button User on side bar
    Then appear User List Page
    When admin click icon edit user on full name "User5"
    Then appear modal form Edit User
    When admin edit name "User55"
    And Admin edit email "User55@gmail.com"
    When admin click button Submit on modal Edit User
    Then appear new name "User5" on list user
    And appear new email "User55@gmail.com" on list user

  @UpdateInvalidUser @KelompokC @NegativeCase
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