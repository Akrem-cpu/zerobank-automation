package com.birtrix.utilites;

import com.birtrix.page.AccountActivity;
import com.birtrix.page.AccountSummary;
import com.birtrix.page.AllSerivecLink;
import com.birtrix.page.Zero_logn;

import java.security.PublicKey;

public class Pages {

    private Pages(){}
    private  static AccountSummary accountSummary;
    private static Zero_logn zero_logn;
    private static AllSerivecLink allSerivecLink;
    private static AccountActivity accountActivity;





    public static AllSerivecLink getAllserivecLink(){
        if(allSerivecLink == null){
            allSerivecLink = new AllSerivecLink();
        }
        return allSerivecLink;
    }
    public static AccountActivity getAccountActivity(){
        if(accountActivity == null){
            accountActivity = new AccountActivity();
        }
        return accountActivity;
    }

    public static Zero_logn getZero_logn(){

        if(zero_logn==null){
            zero_logn = new Zero_logn();
        }
        return zero_logn;
    }
    public static AccountSummary getAccountSummary(){
        if( accountSummary == null){
            accountSummary = new AccountSummary();
        }
        return accountSummary;
    }





    public static void closePages(){
        zero_logn = null;
        accountSummary = null;
    }


}
