Feature: Mentee page validation

  @KelompokC @Mentee-V001 @Positive
  Scenario: Verify field filter search name
    Given user already login and on page Mentee list
    When user click field search nama for fill
    Then user should be fill nama "cek"

  @KelompokC @Mentee-V002 @Positive
  Scenario: Verify dropdown filter class
    Given user already login and on page Mentee list
    When user click dropdown filter class
    Then user should be select class choose "FE 3"

  @KelompokC @Mentee-V003 @Positive
  Scenario: Verify dropdown filter education
    Given user already login and on page Mentee list
    When user click dropdown filter education
    Then user should be select filter education choose "IT"

  @KelompokC @Mentee-V004 @Positive
  Scenario: Verify dropdown filter status
    Given user already login and on page Mentee list
    When user click dropdown filter status
    Then user should be select filter status choose "Join Class"

  @KelompokC @Mentee-V005 @Positive
  Scenario: Verify button add new mentee
    Given user already login and on page Mentee list
    When user click button add new mentee
    Then button can be click go to page new mentee

  @KelompokC  @Mentee-V006 @Positive
  Scenario: Verify button details
    Given user already login and on page Mentee list
    When user click button details
    Then button can be click go to details page

  @KelompokC @Mentee-V007 @Positive
  Scenario: Verify button edit
    Given user already login and on page Mentee list
    When user click button edit
    Then button can be click appear pop up page edit

  @KelompokC @Mentee-V008 @Positive
  Scenario: Verify button delete
    Given user already login and on page Mentee list
    When user click button delete
    Then button can be click appear pop up confirmation delete





