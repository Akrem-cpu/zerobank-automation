
Feature: Only	authorized	users	should	be	able	to	login	to	the	application.	When	user	logs in
  with	valid	credentials,	Account	summary	page	should	be	displayed.

  Scenario: user login in to zero bank account
    Given user is on login page
    Then user give valid credential
    Then user click on sign in button
    Then user should see title as "Zero - Account Summary"

  Scenario: user login in to zero bank account
    Given user is on login page
    Then user give invalid credential
    Then user click on sign in button
    Then user should see error message that says "Login and/or password are wrong."