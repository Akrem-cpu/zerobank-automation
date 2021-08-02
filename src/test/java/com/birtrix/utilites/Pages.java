package com.birtrix.utilites;

import com.birtrix.page.*;

import java.security.PublicKey;

public class Pages {

    private Pages(){}
    private  static AccountSummary accountSummary;
    private static Zero_logn zero_logn;
    private static AccountActivity accountActivity;
    private static ALlPages aLlPages;
    private static AccountFunds accountFunds;
    private static MyMoneyMap myMoneyMap;
    private static PayBills payBills;
    private static OnlineStatements onlineStatements;


    public static AccountFunds getAccountFunds(){
        if ( accountFunds == null){
            accountFunds = new AccountFunds();
        }
        return accountFunds;
    }
    public static MyMoneyMap getMyMoneyMap(){
        if (myMoneyMap == null){
            myMoneyMap = new MyMoneyMap();
        }
        return myMoneyMap;
    }
    public static PayBills getPayBills(){
        if (payBills == null){
            payBills = new PayBills();
        }
        return payBills;
    }
    public static OnlineStatements getOnlineStatements(){
        if ( onlineStatements == null){
            onlineStatements = new OnlineStatements();
        }
      return onlineStatements;
    }






    public static ALlPages getALlPages(){
        if (aLlPages == null){
            aLlPages = new ALlPages();
        }
        return aLlPages;
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
        aLlPages =null;
        accountActivity = null;
        onlineStatements = null;
        payBills = null;
        myMoneyMap = null;
        accountFunds = null;
    }


}
