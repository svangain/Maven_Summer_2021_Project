package day9_081421;

import Reusable_classes.Reusable_method;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Mlcalc_with_Reusable_concepts {
    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = Reusable_method.setDriver();

//navigate to mlcalc
        driver.navigate().to("https://www.mlcalc.com");
        Thread.sleep(2500);
//clear and enter a purchase price
        Reusable_method.sendKeysMethod(driver,"//*[@id='ma']","400000","Purchase Price");
//clear and enter down payment
        Reusable_method.sendKeysMethod(driver,"//*[@id='dp']","25","Down Payment");

    }//end of main


}//end of java
