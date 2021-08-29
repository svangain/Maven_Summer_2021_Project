package day2_071121;

public class loop {
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

        //using for loop to iterate through these values
        for (int i = 0; i < zipcode.length; i++){
            //print statement
            System.out.println("My zipcode is " + zipcode[i] + " and countries is " + countries[i]);
            //to change incrementation to skip every other value on the list we need to redefine the i
            //i = i + 1;
        }//end of loop

    }//end of main method
}//end of java class
