Feature: Login

  A user be able to login with username and password.
#  Agile story
#  Test Method = Test Case = Scenario
#  Test + Data Provider = Scenario Outline _ Examples table

  Scenario: Login as sales mananer and verify that title is Home
    Given user is on the login page
    When user logs in as a helpdesk
    Then user should verify that title is a Home
