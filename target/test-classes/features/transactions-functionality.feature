
Feature: Find Transactions in	Account	Activity
  Scenario: Search date range
    Given user is log in into zero bank account
    When user click on "Account Activity"
    And the user accesses the Find Transactions tab
    And the user enters date range from "2012-09-01" to "2012-09-06"
    Then user click on find button
    And results table should only show transactions dates between "2012-09-01" to "2012-09-06"
    And  the results should be sorted by most recent date
    Then the user enters date range from "2012-09-02" to "2012-09-06"
    Then user click on find button
    Then results table should only show transactions dates between "2012-09-02" to "2012-09-06"
   Then the	results	table should only not contain transactions dated "2012-09-01"

  Scenario:	Search	description
    Given user is log in into zero bank account
    When user click on "Account Activity"
    And the user accesses the Find Transactions tab
    And the user enters description "ONLINE"
    And user click on find button
    And results table should only show descriptions containing "ONLINE"
    And the user enters description "OFFICE"
    And user click on find button
    Then results table should only show descriptions containing "OFFICE"
    But results table should not show descriptions containing "ONLINE"



