package day12_082221;

import Reusable_classes.Reusable_annotation;
import Reusable_classes.Reusable_method;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class testNg_assertions extends Reusable_annotation {



    @Test
    public void testScenario() throws InterruptedException {
        driver.navigate().to("https://www.Google.com");
        Thread.sleep(2500);
        //verify the title says 'Google' using hard assert
        //Assert.assertEquals("google",driver.getTitle());

        //soft Assert is more beneficial
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Google",driver.getTitle());

        //verifying the title using if else condition
        String actualTitle = driver.getTitle();
        if(actualTitle.equals("Google")){
            System.out.println("Title matches");
        } else {
            System.out.println("Title doesn't match " + actualTitle);
        }//end of get title condition


        //click on Sign in
        Reusable_method.clickMethod(driver,"//*[text()='Sign in']","Sign In Button");

        //need to call assertAll command to capture the exception at the end
        softAssert.assertAll();
    }//end of test

}//end of java
