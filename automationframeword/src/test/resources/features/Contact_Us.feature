@contact-us @regression
Feature: WebDriver university - contact Us page

  Scenario: validate sucessfull submission -unique data
    Given I access the webdriver university contact us page
    When I enter a unique first name
    And I enter a unique last name
    And  I enter a unique email adress
    And I enter a  unique password
    And I enter a unique comment
    And I click submit button
    Then I should be presented with message

    Scenario: validate sucessfull submission -unique data
      Given I access the webdriver university contact us page
      When I enter a specific first name joe
      And I enter a specific last name blogs
      And I enter a specific email adress joe_blogs123@gmail.com
      And I enter a specific comment "How are you?"
      And I click submit button
      Then  I should be presented with message