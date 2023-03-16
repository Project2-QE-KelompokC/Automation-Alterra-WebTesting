Feature: Mente page functionality


  Scenario:User see list mente in page mentee
    Given user already login
    When user click main menu mentee
    Then user see data mente list


  Scenario:User filter search nama data mente list with valid data
    Given user already login and on page Mentee list
    When user filter nama "sarah" with valid data
    Then user appear data nama sarah


  Scenario:User filter by search nama data mente list with invalid
    Given user already login and on page Mentee list
    When user filter nama "@#Mamsn"  with invalid data
    Then data mentee list nama not appear


  Scenario:User filter data mente list with filter class
    Given user already login and on page Mentee list
    When user filter by class choose "FE 3"
    Then user appear data with class FE 3


  Scenario:User filter data mente list with filter education
    Given user already login and on page Mentee list
    When user filter by education choose "IT"
    Then user appear data with filter education IT


  Scenario: User filter data mente list with filter status
    Given user already login and on page Mentee list
    When user filter by status choose "Join Class"
    Then user appear data with filter status Join Class

@Test
  Scenario: User delete data mentee list
    Given user already login and on page Mentee list
    When user click delete button in data name boni
    And user click yes pop up confirmation delete
    Then user succesfully delete mentee name boni



