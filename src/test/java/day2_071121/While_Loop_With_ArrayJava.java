package day2_071121;

public class While_Loop_With_ArrayJava {
    public static void main(String[] args) {


        //iterate through different zipcodes value and print them out in for loop
        String[] zipcode, countries;
        zipcode = new String[6];
        zipcode[0] = "11218";
        zipcode[1] = "10001";
        zipcode[2] = "10002";
        zipcode[3] = "11219";
        zipcode[4] = "13337";
        zipcode[5] = "10006";

        //set the initializer first
        int i = 0;
        //call the while loop and define the end point
        while (i < zipcode.length){
            System.out.println("My zipcode is " + zipcode[i]);

            //incrementation
            i = i +1;//same as i++

        }//end of while loop


    }// end of main method
}// end of java class




