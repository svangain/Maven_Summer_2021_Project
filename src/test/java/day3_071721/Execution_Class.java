package day3_071721;

public class Execution_Class {

    public static void main(String[] args) {
        //process of calling a static method to another class is known as inheritance
        //adding two numbers
        //Reusable_Methods.addTwoNumbers(100, 20);

        //subtracting two numbers
        Old_Reusable_Methods.subtractTwoNumber(50, 60);

        int result = Old_Reusable_Methods.addTwoNumbersForReturn(10,20);
        int newResult = result + 5;
        System.out.println("New result is " + newResult);

    }//end of main method
}//end of java class
