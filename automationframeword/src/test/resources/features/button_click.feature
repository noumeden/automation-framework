Feature: i access to webdriveruniversity,i click on button click to visualise content

  Scenario: En tant que utilisateur,je dois acceder sur le sit webdriver university , cliquer sur le button
    clicks pour visualiser le contenu de la page.
    Given I access the webdriver university
    When  click on BUTTON CLICKs
    Then i should get message  "Lets Get Clicking!"
    And get the content of every element

    Scenario: i click on login on CLIK ME to visualise each element

      Given I access the webdriver university
      And I click on the login button
      When I click on CLICK ME button
      Then I should get alert message of each element
      