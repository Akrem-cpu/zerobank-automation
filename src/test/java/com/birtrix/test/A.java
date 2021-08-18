package com.birtrix.test;

import com.birtrix.utilites.Driver;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A<T extends Number>{
    T ob;
    public A(T ob){
        this.ob = ob;
    }
    public boolean equals1(A<?> a,A<?> c){
        if(a.ob.intValue() == c.ob.intValue()){
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        A<Integer> list = new A<>(1);
        A<Integer> list2 = new A<>(10);
        System.out.println("list.equals1(list2,list) = " + list.equals1(list2, list));


        int[] a = {1,2,3,0,0,0,1,3};



        Map<String,Object> map = new LinkedHashMap<>();


    }
    @Test
    public void test() {
        Driver.getDriver().get("https://www.google.com");
        WebElement search = Driver.getDriver().findElement(By.name("q"));
        search.sendKeys("Apple" + Keys.ENTER);


        // Waiting 30 seconds for an element to be present on the page, checking
        // for its presence once every 5 seconds.
        Wait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {
                return Driver.getDriver().findElement(By.xpath("//b[.='stock']"));
            }
        });
        element.click();

    }

    @Test
    public void tes() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com");
        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total links are " + links.size());

        for (int i = 0; i < links.size(); i++) {
            try {
                String nextHref = links.get(i).getAttribute("href");
                // System.out.println(nextHref);
                URL url = new URL(nextHref); //changed
                HttpURLConnection connection = ((HttpURLConnection) url.openConnection());
                connection.setConnectTimeout(3000);
                connection.setRequestMethod("GET");
                connection.connect();
                int code = connection.getResponseCode();
                if (code != 200)
                    System.out.println(i + "code: " + code + "Url" + url);
                /*
                 * if (code == 200) { System.out.println("Valid Link:" +
                 * nextHref);} else { System.out.println("INVALID Link:" +
                 * nextHref);}
                 */
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("In Exception");
            }
        }
        // Close the browser

        driver.quit();
    }





    public static Object[] zero(int[] a){
        List<Integer> list = Arrays.stream(a).filter(p-> p==0).boxed().collect(Collectors.toList());
        list.addAll(Arrays.stream(a).filter(p-> p!=0).boxed().collect(Collectors.toList()));

        return list.toArray();
    }

}
