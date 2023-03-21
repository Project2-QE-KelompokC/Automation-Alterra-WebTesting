Feature: Mente page functionality

  @KelompokC @Mentee-F009 @Positive
  Scenario:User see list mente in page mentee
    Given user already login
    When user click main menu mentee
    Then user see data mente list

  @KelompokC @Mentee-F010 @Positive
  Scenario:User filter search nama data mente list with valid data
    Given user already login and on page Mentee list
    When user filter nama "sarah" with valid data
    Then user appear data nama sarah

  @KelompokC @Mentee-F011 @Negative
  Scenario:User filter by search nama data mente list with invalid
    Given user already login and on page Mentee list
    When user filter nama "@#Mamsn"  with invalid data
    Then data mentee list nama not appear

  @KelompokC @Mentee-F012 @Positive
  Scenario:User filter data mente list with filter class
    Given user already login and on page Mentee list
    When user filter by class choose "FE 3"
    Then user appear data with class FE 3

  @KelompokC @Mentee-F013 @Positive
  Scenario:User filter data mente list with filter education
    Given user already login and on page Mentee list
    When user filter by education choose "IT"
    Then user appear data with filter education IT

  @KelompokC @Mentee-F014 @Positive
  Scenario: User filter data mente list with filter status
    Given user already login and on page Mentee list
    When user filter by status choose "Join Class"
    Then user appear data with filter status Join Class

  @KelompokC @Mentee-F015 @Positive
  Scenario: User delete data mentee list
    Given user already login and on page Mentee list
    When user click delete button in data name boni
    And user click yes pop up confirmation delete
    Then user succesfully delete mentee name boni

  @KelompokC @Mentee-F016 @Positive
  Scenario: add new mentee with valid data
    Given user already login and on page Mentee list
    When user click button add new mentee
    And user fill data add new mentee with valid data
    And user click button save
    Then user succesfully add new mente go to page mentee list

  @KelompokC @Mentee-F017 @Negative
  Scenario: add new mentee with invalid data
    Given user already login and on page Mentee list
    When user click button add new mentee
    And user fill data add new mentee with invalid data
    And user click button save
    Then user cant be click save data invalid

  @KelompokC @Mentee-F018 @Positive
  Scenario: Edit data mentee with valid data
    Given user already login and on page Mentee list
    When user click button edit
    And user fill edit mentee with valid data
    And user click submit
    Then user appear edited data mentee in mentee page

  @KelompokC @Mentee-F019 @Negative
  Scenario: Edit data mentee with invalid data
    Given user already login and on page Mentee list
    When user click button edit
    And user fill edit mentee with invalid data
    And user click submit
    Then user cant be click submit with invalid data