@hera
Feature: User want to visit disney homepage

Scenario: Homepage login page positive scenario

Given User want to visit homepage
When Click on signin button
And User enters username and password
And User able to click signin button
Then User successfully login and verify
