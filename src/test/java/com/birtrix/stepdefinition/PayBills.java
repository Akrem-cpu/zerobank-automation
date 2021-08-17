package com.birtrix.stepdefinition;

import com.birtrix.utilites.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PayBills {

    @When("user fill the amount")
    public void user_fill_the_amount() {
       Pages.getPayBills().AmountBox.click();
       Pages.getPayBills().AmountBox.sendKeys("500");
    }
    @When("user fill the date")
    public void user_fill_the_date() {
        Pages.getPayBills().dateBox.click();
        Pages.getPayBills().dateBox.sendKeys("2021-08-02");

    }
    @When("user click on pay")
    public void user_click_on_pay() {
      Pages.getPayBills().payButton.click();
    }
    @Then("user should see {string} displayed")
    public void user_should_see_displayed(String expectedText) {
        if(expectedText.contains("successfully")) {
            String actualText = Pages.getPayBills().successMessage.getText();
            Assert.assertEquals(expectedText, actualText);
        }else {
            if(Pages.getPayBills().AmountBox.getAttribute("value").isEmpty()){
                String actualText = Pages.getPayBills().AmountBox.getAttribute("validationMessage");
                Assert.assertEquals(actualText,expectedText);
            }else {
                String actualText = Pages.getPayBills().dateBox.getAttribute("validationMessage");
                Assert.assertEquals(actualText,expectedText);
            }
        }
    }


    @And("user try to make a payment with out filling the date or amount")
    public void userTryToMakeAPaymentWithOutFillingTheDateOrAmount() {

    }
}
