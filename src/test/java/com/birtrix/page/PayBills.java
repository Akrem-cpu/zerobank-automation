package com.birtrix.page;

import com.birtrix.utilites.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBills implements b {


    public PayBills(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//input[@id='sp_amount']")
    public WebElement AmountBox;

    @FindBy(xpath = "//input[@id='sp_date']")
    public WebElement dateBox;

    @FindBy(xpath = "//input[@id='pay_saved_payees']")
    public WebElement payButton;

    @FindBy(xpath = "//span[.='The payment was successfully submitted.']")
    public WebElement successMessage;




}
interface b{
    String a = "hello";
}




