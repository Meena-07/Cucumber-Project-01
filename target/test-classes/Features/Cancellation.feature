@Func1
Feature: 
  Check with cancellation of existing booking in Adactin web Application

  Scenario Outline: 
    check with cancellation functionality

    Given you are in login page
    When you enters username "<user>",Password "<pass>" and click login
    And you click bookIternary, enters orderid "<orderid>" and proceeded with cancellation of orderid
    Then you should cancelled booking

    Examples: 
      | user     | pass     | orderid    |
      | Meenaa07 | Meenaa07 | LOC12SK1Z4 |
