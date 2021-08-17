package com.birtrix.page;

import com.birtrix.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class AccountActivity extends ALlPages {
    public AccountActivity(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//select[@id='aa_accountId']")
    public WebElement selectDropDownForAccount;
    @FindBy(xpath = "//ul[@class='ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all']//a")
    public List<WebElement> tabsUnderAccountActivity;
    @FindBy(xpath = "//input[@id='aa_fromDate']")
    public WebElement startDateSearchInputBox;
    @FindBy(xpath = "//input[@id='aa_toDate']")
    public WebElement endDateSearchInputBox;
    @FindBy(xpath = "//button[.='Find']")
    public WebElement findButton;
    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//td[1]")
    public List<WebElement> allListOfFiltredDate;
    @FindBy(xpath = "//input[@id='aa_description']")
    public WebElement descriptionInputBox;
    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']//td[2]")
    public List<WebElement> ListOfAllDescriptionFliterd;





    public static int changeStringToNumber(String str){
        List<String> list = Arrays.stream(str.split("-")).collect(Collectors.toList());
        int num = 0;
        for (String each : list) {
            num += Integer.parseInt(each);
        }
        return num;

    }
    public static boolean rangerOfDateChecker(List<String> date ){
        Collections.sort(date);
        int start = changeStringToNumber(date.get(0));
        int end = changeStringToNumber(date.get(date.size() - 1));
        AtomicBoolean answer = new AtomicBoolean(true);
        date.forEach(p -> {
            int compare = changeStringToNumber(p);
            if (compare < start || compare > end) {
                answer.set(false);
            }
        });

      return answer.get();

    }
    public static boolean checkIfResultIsSorted(List<String> date){
          List<String> sorted= date;
          Collections.sort(sorted);
        for (int i = 0; i < date.size() ; i++) {
           if(!date.get(i).equals(sorted.get(i))){
               return false;
           }
        }
        return true;

    }

    public static boolean checkIfTheListOfWebelmentIncludeAString(List<WebElement> list ,String contain ){

        for (WebElement each : list){
            if(!each.getText().contains(contain)){
                return false;
            }
        }
        return true;

    }





}






