Feature: Mente page functionality

  @Test
  Scenario:User see list mente in page mentee
    Given user already login
    When user click main menu mentee
    Then user see data mente list

  @Test
  Scenario:User filter search nama data mente list with valid data
    Given user already login and on page Mentee list
    When user filter nama "sarah" with valid data
    Then user appear data nama sarah

  @Test
  Scenario:User filter by search nama data mente list with invalid
    Given user already login and on page Mentee list
    When user filter nama "@#Mamsn"  with invalid data
    Then data mentee list nama not appear

  @Test
  Scenario:User filter data mente list with filter class
    Given user already login and on page Mentee list
    When user filter by class choose "FE 3"
    Then user appear data with class "FE 3"

  @Test
  Scenario:User filter data mente list with filter education
    Given user already login and on page Mentee list
    When user filter by education choose "IT"
    Then user appear data with filter education "IT"

  @Test
  Scenario: UUser filter data mente list with filter status
    Given user already login and on page Mentee list
    When user filter by status choose "Join Class"
    Then user appear data with filter status "Join Class"




