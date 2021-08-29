package Action_Item_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing {
    public static void main(String[] args) throws InterruptedException {

        String[] colors; colors = new String[3];
        colors[0]= "red";
        colors[1]= "blue";
        colors[2]= "yellow";

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

        //define the webdriver
        WebDriver driver = new ChromeDriver();

        for (int i=0; i<colors.length; i++) {
            driver.navigate().to("https://www.bing.com");

            //Maximize window
            driver.manage().window().maximize();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(colors[i]);

            driver.findElement(By.xpath("//*[@id='sb_form_go']")).submit();
            Thread.sleep(2000);

            //capture results
            String result = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();

            String[] arrayResult = result.split(" ");
            System.out.println("My search number for colors " + colors[i] + " is " + arrayResult[0]);

        }//end of loop

        driver.quit();

    }//end of main
}//end of java
