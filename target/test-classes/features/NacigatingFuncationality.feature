
Feature:	Navigating	to	specific	accounts	in	Accounts	Activity

  Scenario:	Savings	account redirect
    Given user is log in into zero bank account
    When When the user clicks on "Savings" card link on the Account Summary page
    Then user should see title "Zero - Account Activity"
    And Account	drop down should have "Savings" selected

  Scenario:	Brokerage account redirect
    Given user is log in into zero bank account
    When When the user clicks on "Brokerage" card link on the Account Summary page
    Then user should see title "Zero - Account Activity"
    And Account	drop down should have "Brokerage" selected

  Scenario:	Checking account redirect
    Given user is log in into zero bank account
    When When the user clicks on "Checking" card link on the Account Summary page
    Then user should see title "Zero - Account Activity"
    And Account	drop down should have "Checking" selected

  Scenario:	Checking account redirect
    Given user is log in into zero bank account
    When When the user clicks on "Credit Card" card link on the Account Summary page
    Then user should see title "Zero - Account Activity"
    And Account	drop down should have "Credit Card" selected

  Scenario:	Loan account redirect
    Given user is log in into zero bank account
    When When the user clicks on "Loan" card link on the Account Summary page
    Then user should see title "Zero - Account Activity"
    And Account	drop down should have "Loan" selected