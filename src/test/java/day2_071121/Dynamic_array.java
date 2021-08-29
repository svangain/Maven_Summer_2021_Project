package day2_071121;

public class Dynamic_array {
    public static void main(String[] args) {
        //setup variables for dynamic array
        String[] zipcode, countries;
        zipcode = new String[6];
        zipcode[0] = "11218";
        zipcode[1] = "10001";
        zipcode[2] = "10002";
        zipcode[3] = "11219";
        zipcode[4] = "13337";
        zipcode[5] = "10006";

        countries = new String[6];
        countries[0] = "usa";
        countries[1] = "india";
        countries[2] = "china";
        countries[3] = "russia";
        countries[4] = "canada";
        countries[5] = "iceland";




        System.out.println("my zipcode is " + zipcode[0]);
        //letting the length of the variable
        System.out.println("my zipcode length is " + zipcode.length);

        System.out.println("my countries is " + countries[0] + countries[5]);



    }//end of main method
}//end of java class
