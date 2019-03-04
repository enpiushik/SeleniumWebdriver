@test
Feature: I want to be able to use google and phptravels demo

  @google
  Scenario: I am testing google search web app
    Given I am on google home page
    When I am checking elements availability on google web page Chrome
    Then I am checking elements availability on google web page Firefox
    And I am checking elements availability on google web page Internet Explorer

  @demoChrome
  Scenario: I am testing phptravels demo web app Chrome
    Given I am on demo home page Chrome
    When I am checking elements in topBar Chrome
    Then I am checking elements in header on demo web page Chrome
    And I am checking elements in banner on demo web page Chrome
    Then I am checking first section elements on demo web page Chrome

  @demoFirefox
  Scenario:
    Given I am on demo home page Firefox
    When I am checking elements on demo web page Firefox

  @demoIE
  Scenario:
    Given I am on demo home page IE