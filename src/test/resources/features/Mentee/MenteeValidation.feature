Feature: Mentee page validation
  @KelompokC
  Scenario: Verify field filter search name
    Given user already login and on page Mentee list
    When user click field search nama for fill
    Then user should be fill nama "cek"

  @KelompokC
  Scenario: Verify dropdown filter class
    Given user already login and on page Mentee list
    When user click dropdown filter class
    Then user should be select class choose "FE 3"

  @KelompokC
  Scenario: Verify dropdown filter education
    Given user already login and on page Mentee list
    When user click dropdown filter education
    Then user should be select filter education choose "IT"

  @KelompokC
  Scenario: Verify dropdown filter status
    Given user already login and on page Mentee list
    When user click dropdown filter status
    Then user should be select filter status choose "Join Class"

  @KelompokC
  Scenario: Verify button add new mentee
    Given user already login and on page Mentee list
    When user click button add new mentee
    Then button can be click go to page new mentee

  @KelompokC
  Scenario: Verify button details
    Given user already login and on page Mentee list
    When user click button details
    Then button can be click go to details page

  @KelompokC
  Scenario: Verify button edit
    Given user already login and on page Mentee list
    When user click button edit
    Then button can be click appear pop up page edit

  @KelompokC
  Scenario: Verify button delete
    Given user already login and on page Mentee list
    When user click button delete
    Then button can be click appear pop up confirmation delete





