
Feature: List log
  @ListLog
  Scenario: add list log
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When user click from title

  @KelompokC @AddListLog
  Scenario: list log status join class status Join Class
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When user clik from side mente
    Then user clik from ... detail
    And user clik add new log
    When user click dropdown "Unit 1"
    Then user input "Ini merupakan judul 1" from text are title
    And User input feedback "ini merupakan fedback 1"
    And  User click save buttom
    And Appear new title "Ini merupakan judul 1"

  @KelompokC @AddListLog
  Scenario: list log status join class status Join Class
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When user clik from side mente
    Then user clik from ... detail
    And user clik add new log
    When user click dropdown "Unit 2"
    Then user input "Ini merupakan judul 2" from text are title
    And User input feedback "ini merupakan fedback 2"
    And  User click save buttom
    And Appear new title "Ini merupakan judul 2"


  @KelompokC @AddListLog
  Scenario: list log status join class status Join Class
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When user clik from side mente
    Then user clik from ... detail
    And user clik add new log
    When user click dropdown "Unit 3"
    Then user input "Ini merupakan judul 3" from text are title
    And User input feedback "ini merupakan fedback 3"
    And  User click save buttom
    And Appear new title "Ini merupakan judul 3"