
Feature: how to connect to campus-fitec

  Scenario Outline: I validate successfull login
    Given I access webdriver campus-fitec
    When I enter my <username>
    And I enter my <password>
    Then I access in home page campus-fitec

    Examples:
      |username|password|
      |Formateur203|Formateur203|
      |Formateur204|Formateur204|

  Scenario Outline: I validate unsuccessfull login
    Given I access webdriver campus-fitec
    When I enter my <username>
    And I enter my <password>
    Then I access in home page campus-fitec

    Examples:
      |username|password|
      |Formateur20|Formateur20|
      |formateur204|formateur204|