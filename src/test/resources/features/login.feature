Feature: User should Login
  Background:
    Given Navigate to the page

    Scenario: should be able to login
      When input username
      Then input password
      Then click login button