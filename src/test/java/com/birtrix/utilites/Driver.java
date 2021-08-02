package com.birtrix.utilites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){}


    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();


    public static WebDriver getDriver(){

        if (driverPool.get() == null){
            synchronized (Driver.class) {

                String browserType = ConfiReader.getProperty("browser");


                switch (browserType) {
                    case "remote-chrome":
                        try {
                            URL url = new URL("http://"+ConfiReader.getProperty("gridAddress")+":4444/wd/hub");
                            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                            desiredCapabilities.setBrowserName("chrome");
                            driverPool.set(new RemoteWebDriver(url,desiredCapabilities));
                            driverPool.get().manage().window().maximize();
                            driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                        } catch (MalformedURLException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;

                }
            }
        }


        return  driverPool.get();


    }


    public static void closeDriver(){
        if( driverPool.get()!=null){
            driverPool.get().quit();
            driverPool.remove();
        }
    }

}
