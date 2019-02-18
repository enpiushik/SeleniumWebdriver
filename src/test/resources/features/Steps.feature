@test
Feature: I want to be able to use google

  Background:
    Given I am on google home page

  Scenario: I am testing google search web app
    When I am checking elements availability on google web page Chrome
    Then I am checking elements availability on google web page Firefox
    And I am checking elements availability on google web page Internet Explorer
