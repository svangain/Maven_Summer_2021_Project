package Action_item_6;

import Reusable_classes.Reusable_method;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Aetna {

    //declare the global variables outside the annotation methods
    WebDriver driver;
    Workbook readableFile;
    WritableWorkbook writableFile;
    WritableSheet writableSheet;
    int rowCount;

    //precondition for express
    @BeforeSuite
    public void setTheDriverAndWorkbook() throws IOException, BiffException {
        //step 1: locate the file path where you save it
        readableFile = Workbook.getWorkbook(new File("src/main/resources/action item 6.xls"));
        //create a writable file that mimics the readable in order to write back your result and not corrupt the readable
        writableFile = Workbook.createWorkbook(new File("src/main/resources/action item 6_Results.xls"),readableFile);
        //Step 2: accessing the excel sheet from the workbook
        writableSheet = writableFile.getSheet(0);
        //Step 3: row count will return all the rows which is not empty
        rowCount = writableSheet.getRows();
        //set the driver
        driver = Reusable_method.setDriver();
    }//end of before suite

    @Test
    public void ExpressCheckoutIteration() throws InterruptedException, WriteException {
        for (int i = 1; i < 2; i++) {
            //get cell's 2 arguments are column and row
            String size = writableSheet.getCell(0, i).getContents();
            String qty = writableSheet.getCell(1, i).getContents();

            //navigate to express
            driver.navigate().to("https://www.aetna.com/");
            Thread.sleep(2500);
            //click on polo link
            Reusable_method.clickMethod(driver, "//*[text()='Shop for a plan']", "Shop for a plan");
            Thread.sleep(2500);
            Reusable_method.clickMethod(driver, "//*[text()='Medicare']", "Medicare");
            Thread.sleep(2500);


        }//end of loop
    }//end of test
}//end of java
