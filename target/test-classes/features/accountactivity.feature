

Feature: Account Activity page should have the title Zero – Account activity. In the Account drop down default option
  should be Savings. Account drop down should have the following options: Savings, Checking, Loan, Credit Card, Brokerage.
  Transactions table should	have column	names Date,	Description, Deposit, Withdrawal.

  Scenario: user should see  Savings, Checking, Loan, Credit Card, Brokerage under account on account activity page
    Given user is log in into zero bank account
    When user click on "Account Activity"
    Then user should see title "Zero - Account Activity"
    Then user should see "Savings" as a by default on account dropdown

    Scenario: user should see all Savings, Checking, Loan, Credit Card, Brokerage option under account select dropdown
      Given user is log in into zero bank account
      Then  user click on "Account Activity"
      Then user click on account dropdown
      Then user should see under account select dropdown
        | Savings     |
        | Checking    |
        | Savings     |
        | Loan        |
        | Credit Card |
        | Brokerage   |
