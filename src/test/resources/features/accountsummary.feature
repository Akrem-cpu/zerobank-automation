
Feature: Account	summary	page	should	have	the	title	Zero	– Account	summary.	Account
  summary	page	should	have	to	following	account	types:	Cash	Accounts,	Investment
  Accounts,	Credit	Accounts,	Loan	Accounts.	Credit	Accounts table	must	have	columns
  Account,	Credit	Card and	Balance.
  B204-356,B204-356
  @wip
  Scenario: user should see this Cash Accounts, Investment Accounts, Credit	Accounts, Loan Accounts after user login
    Given user is log in into zero bank account
    Then user should see title "Zero - Account Summary"
    Then user should see
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

  Scenario: user should see this Account, Credit Card and Balance under credit account after user login
    Given user is log in into zero bank account
    Then user should see this under the credit account
    |Account|
    |Credit Card|
    |Balance    |
