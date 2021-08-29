package Google_Page_Object;


import Reusable_classes.Reusable_annotation_HTML_report;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass extends Reusable_annotation_HTML_report {
    public BaseClass(WebDriver driver){
        PageFactory.initElements(driver,this);
    }//end of constructor class

    //create static reference for google home page
    public static HomePage homePage(){
        HomePage homePage = new HomePage(driver);
        return  homePage;
    }//end of googleHomePage method

    //create static reference for search result page
    public static SearchResultPage searchResultPage(){
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        return  searchResultPage;
    }//end of search result page method


}//end of class
