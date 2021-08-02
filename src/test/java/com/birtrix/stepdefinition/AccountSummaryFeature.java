package com.birtrix.stepdefinition;

import com.birtrix.page.Zero_logn;
import com.birtrix.utilites.BrowserUitls;
import com.birtrix.utilites.Driver;
import com.birtrix.utilites.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;



public class AccountSummaryFeature {
    @Given("user is log in into zero bank account")
    public void user_is_log_in_into_zero_bank_account() {
        Pages.getZero_logn().signinButton.click();
        Zero_logn.Login();

    }
    @Then("user should see title {string}")
    public void userShouldSeeTitle(String arg0) {

        BrowserUitls.titleAssert(arg0);




            }
    @Then("user should see")
    public void user_should_see(List<String> list) {
        BrowserUitls.assertMultipleText(list,Pages.getAccountSummary().allH2HeaderUnderAccountSummary);

    }


    @Then("user should see this under the credit account")
    public void user_should_see_this_under_the_credit_account(List<String> dataTable) {
      BrowserUitls.assertMultipleText(dataTable,Pages.getAccountSummary().allThUnderCreditAccount);
    }


}
