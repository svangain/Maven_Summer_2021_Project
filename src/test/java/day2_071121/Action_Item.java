package day2_071121;
public class Action_Item {
    public static void main(String[] args) {

        //Setup variables for dynamic array
        String[] zipcode;
        int[] street;
        zipcode = new String[5];
        zipcode[0] = "11419";
        zipcode[1] = "11735";
        zipcode[2] = "11418";
        zipcode[3] = "11358";
        zipcode[4] = "11589";

        street = new int[5];
        street[0] = 135;
        street[1] = 128;
        street[2] = 35;
        street[3] = 145;
        street[4] = 69;

        for (int i = 0; i < 5; i++) {

            //getting the length of the variable
            System.out.println(" My street is " + street[i] + " My zipcode is " + zipcode[i]);


        }
    }//end of main
}//end of Action Item
