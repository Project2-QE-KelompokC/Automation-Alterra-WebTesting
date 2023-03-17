
Feature: List log
  @ListLog
  Scenario: add list log
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When user click from title
    Then user can be write
@COba
  Scenario: list log status join class
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When user clik from side mente
    Then user clik from ... detail
    And user clik add new log
    When user click dropdown "Join Class"
#    Then user should be select status choose "Interview"
#    And  User click save buttom

    Scenario: list log status unit 1
      Given open the website alta-dashboard-immersive.vercel.app
      When input email "Admin@gmail.com" and password "qwerty"
      Then click button login
      And already on Dashboard page
      When user clik from side mente
      Then user clik from ... detail
      And user clik add new log
      When user click dropdown "Unit 1"


      Scenario: list log status unit 2
        Given open the website alta-dashboard-immersive.vercel.app
        When input email "Admin@gmail.com" and password "qwerty"
        Then click button login
        And already on Dashboard page
        When user clik from side mente
        Then user clik from ... detail
        And user clik add new log
        When user click dropdown "Unit 2"


        Scenario: list log status unit3
          Given open the website alta-dashboard-immersive.vercel.app
          When input email "Admin@gmail.com" and password "qwerty"
          Then click button login
          And already on Dashboard page
          When user clik from side mente
          Then user clik from ... detail
          And user clik add new log
          When user click dropdown "Unit 3"


          Scenario: list log status repeat unit 1
            Given open the website alta-dashboard-immersive.vercel.app
            When input email "Admin@gmail.com" and password "qwerty"
            Then click button login
            And already on Dashboard page
            When user clik from side mente
            Then user clik from ... detail
            And user clik add new log
            When user click dropdown "Repeat Unit 1"


            Scenario: list log status repeat unit 2
              Given open the website alta-dashboard-immersive.vercel.app
              When input email "Admin@gmail.com" and password "qwerty"
              Then click button login
              And already on Dashboard page
              When user clik from side mente
              Then user clik from ... detail
              And user clik add new log
              When user click dropdown "Repeat Unit 2"


              Scenario: list log status repeat unit 3
                Given open the website alta-dashboard-immersive.vercel.app
                When input email "Admin@gmail.com" and password "qwerty"
                Then click button login
                And already on Dashboard page
                When user clik from side mente
                Then user clik from ... detail
                And user clik add new log
                When user click dropdown "Repeat Unit 3"


                Scenario: list log status placement
                  Given open the website alta-dashboard-immersive.vercel.app
                  When input email "Admin@gmail.com" and password "qwerty"
                  Then click button login
                  And already on Dashboard page
                  When user clik from side mente
                  Then user clik from ... detail
                  And user clik add new log
                  When user click dropdown "Placement"


                  Scenario: list log status eliminated
                    Given open the website alta-dashboard-immersive.vercel.app
                    When input email "Admin@gmail.com" and password "qwerty"
                    Then click button login
                    And already on Dashboard page
                    When user clik from side mente
                    Then user clik from ... detail
                    And user clik add new log
                    When user click dropdown "Eliminated"


                    Scenario: list log status graduated
                      Given open the website alta-dashboard-immersive.vercel.app
                      When input email "Admin@gmail.com" and password "qwerty"
                      Then click button login
                      And already on Dashboard page
                      When user clik from side mente
                      Then user clik from ... detail
                      And user clik add new log
                      When user click dropdown "Graduated"


                      Scenario: list log status interview
                        Given open the website alta-dashboard-immersive.vercel.app
                        When input email "Admin@gmail.com" and password "qwerty"
                        Then click button login
                        And already on Dashboard page
                        When user clik from side mente
                        Then user clik from ... detail
                        And user clik add new log
                        When user click dropdown "Interview"

                        Scenario: list log form feedback
                          Given open the website alta-dashboard-immersive.vercel.app
                          When input email "Admin@gmail.com" and password "qwerty"
                          Then click button login
                          And already on Dashboard page
                          When user clik from side mente
                          Then user clik from ... detail
                          And user clik add new log
                          And user input "asdasdas" from text area

  Scenario: list log from textare title
    Given open the website alta-dashboard-immersive.vercel.app
    When input email "Admin@gmail.com" and password "qwerty"
    Then click button login
    And already on Dashboard page
    When user clik from side mente
    Then user clik from ... detail
    And user clik add new log
    And user input "sdasda" from text are title

