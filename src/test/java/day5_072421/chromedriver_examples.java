package day5_072421;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromedriver_examples {
    public static void main(String[] args) {

        //set the property and path to your chromedriver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        //set the conditions for chromeoptions before the webdriver is defined
        ChromeOptions options = new ChromeOptions();
        //set arguments to maximize the driver and make it incognito
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //define the webdriver

        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://www.bing.com");


    }//end of main
}//end of java class
