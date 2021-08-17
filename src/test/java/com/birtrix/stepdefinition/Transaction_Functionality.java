package com.birtrix.stepdefinition;

import com.birtrix.page.AccountActivity;
import com.birtrix.utilites.BrowserUitls;
import com.birtrix.utilites.Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.WeakHashMap;

public class Transaction_Functionality {

    @When("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_find_transactions_tab() {
        BrowserUitls.clickOnOneElementOfTheList(Pages.getAccountActivity().tabsUnderAccountActivity,"Find Transactions");
    }
    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String string, String string2) {
      if(!Pages.getAccountActivity().startDateSearchInputBox.getAttribute("value").isEmpty()){
          Pages.getAccountActivity().startDateSearchInputBox.clear();
      } if(!Pages.getAccountActivity().endDateSearchInputBox.getAttribute("value").isEmpty()){
          Pages.getAccountActivity().endDateSearchInputBox.clear();
      }
      Pages.getAccountActivity().startDateSearchInputBox.sendKeys(string);
      Pages.getAccountActivity().endDateSearchInputBox.sendKeys(string2);
    }
    @Then("user click on find button")
    public void user_click_on_find_button() {
      Pages.getAccountActivity().findButton.click();
    }
    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String startDate1, String endDate1) {
        List<String> list = BrowserUitls.changeListOfWebElementToStringList(Pages.getAccountActivity().allListOfFiltredDate);
       Assert.assertTrue(AccountActivity.rangerOfDateChecker(list));
    }
    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {
        List<String> list = BrowserUitls.changeListOfWebElementToStringList(Pages.getAccountActivity().allListOfFiltredDate);
        Assert.assertTrue(AccountActivity.checkIfResultIsSorted(list));
    }

    @Then("the	results	table should only not contain transactions dated {string}")
    public void theResultsTableShouldOnlyNotContainTransactionsDated(String notContain) {
        BrowserUitls.sleep(1);
        List<String> actualList = BrowserUitls.changeListOfWebElementToStringList(Pages.getAccountActivity().allListOfFiltredDate);
        Assert.assertFalse(actualList.stream().anyMatch(p-> p.equals(notContain)));
    }


    @When("the user enters description {string}")
    public void the_user_enters_description(String string) {
        if( !Pages.getAccountActivity().descriptionInputBox.getAttribute("value").isEmpty()){
            Pages.getAccountActivity().descriptionInputBox.clear();
        }
        Pages.getAccountActivity().descriptionInputBox.sendKeys(string);
    }
    @When("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String string) {
        BrowserUitls.sleep(1);
        Assert.assertTrue(AccountActivity.checkIfTheListOfWebelmentIncludeAString(
                 Pages.getAccountActivity().ListOfAllDescriptionFliterd,string));
    }
    @Then("results table should not show descriptions containing {string}")
    public void results_table_should_not_show_descriptions_containing(String string) {
        Assert.assertFalse(AccountActivity.checkIfTheListOfWebelmentIncludeAString(
                Pages.getAccountActivity().ListOfAllDescriptionFliterd,string));
    }













}
