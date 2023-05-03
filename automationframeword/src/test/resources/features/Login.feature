@login @regression
Feature: Webdriver Uniniversity- Login Page

#  Background:  Given I access the webdriver university contact login page


 Scenario: Validate succeffull login
Given I access the webdriver university contact login page
  When I enter username "webdriver"
   And enter a password "webdriver123"
    And I click on the login button
    Then I should be presented "validation succeeded"

@smoke
  Scenario Outline: Validate -successful login & unsuccessful login message
    Given I access the webdriver university contact login page
    When I enter a username <username>
    And I enter a password <password>
    And  I click on the login button
    Then  I should be presented with the following login validation message <loginMessage>

    Examples:

      | username  | password     | loginMessage         |
     | webdriver | webdriver123 | validation succeeded |
     | webdriver | password123  | validation failed    |
    | joe_blogs | password1    | validation failed    |