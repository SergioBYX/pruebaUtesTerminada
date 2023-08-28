# Autor: Sergio A.
@stories
Feature: Filling out the form to create a user
  @scenario
  Scenario: Create user successfully
    Given correctly the information in the alphanumeric fields
    When Click on the Sign in button
    Then you can fill the login fields for the start of session

