
Feature:Account	Activity page should have the title	Zero–Pay Bills.	When user completes	a
  successful Pay operation,The payment was successfully	submitted. should be displayed.
  user tries to make a payment without entering the amount or date,
  Please fill out	this field message! should be displayed.

  Scenario: when user finish the payment and click on pay, user should see The payment was successfully submitted.
    message displayed
    Given user is log in into zero bank account
    When user click on "Pay Bills"
    And  user fill the amount
    And  user fill the date
    And user click on pay
    Then user should see "The payment was successfully submitted." displayed

  Scenario: when user click on payment with out filling the Amount or Date, user should see error message Please fill out this field.
    Given user is log in into zero bank account
    When user click on "Pay Bills"
    And  user try to make a payment with out filling the date or amount
    And user click on pay
    Then user should see "Please fill out this field." displayed
