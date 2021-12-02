package com.birtrix.utilites;

import com.birtrix.page.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PagesV2 extends ALlPages {
    static final String ACCOUNT_ACTIVITY = "b";
    static final String ACCOUNT_FUNDS = "c";
    static final String ACCOUNT_SUMMARY = "Zero - Account Summary";
    static final String LOGIN = "Zero - Personal Banking - Loans - Credit Cards";
    static final String LOGIN2 = "Zero - Log in";


    public static PayBills getPage() {
        return new PayBills();
    }

    public static void main(String[] args) {
        WebElement a = Driver.getDriver().findElement(By.xpath("jhsdf"));
         new WebDriverWait(Driver.getDriver(),2).until(ExpectedConditions.textToBePresentInElement(a,"hello"));
    }
}


