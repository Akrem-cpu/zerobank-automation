package com.birtrix.utilites;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserUitls {
    public static void titleAssert(String title){

        String actualTitle = Driver.getDriver().getTitle();
        waitFor().until(ExpectedConditions.titleIs(title));
        Assert.assertEquals(actualTitle,title);

    }


    public static WebDriverWait waitFor(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        return wait;
    }
   public static void sleep(int second ){
        second = second*1000;
       try {
           Thread.sleep(second);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }

   }

   public static void assertMultipleText(List<String> txt , List<WebElement> ele){
        List<String> eleToTxt = new ArrayList<>();
       for (WebElement each: ele) {
           eleToTxt.add(each.getText());
       }

        Assert.assertEquals(txt,eleToTxt);

   }
  public static void clickOnOneElementOfTheList(List<WebElement> listEle,String txt){
      for (WebElement each: listEle) {
          if(each.getText().equals(txt)){
              each.click();
              break;
          }
      }
  }

  public static Select selectObject(WebElement element){
      return new Select(element);
  }




}
