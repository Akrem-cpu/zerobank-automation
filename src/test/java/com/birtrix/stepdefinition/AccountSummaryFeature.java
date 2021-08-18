package com.birtrix.stepdefinition;

import com.birtrix.page.Zero_logn;
import com.birtrix.utilites.BrowserUitls;
import com.birtrix.utilites.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;



public class AccountSummaryFeature {
    @Given("user is log in into zero bank account")
    public synchronized void user_is_log_in_into_zero_bank_account() {
        BrowserUitls.sleep(1);
        if( Pages.getZero_logn().signinButton.isDisplayed()){
            Pages.getZero_logn().signinButton.click();
        }

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
