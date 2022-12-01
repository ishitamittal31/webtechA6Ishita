//ishita mittal - 19105121

// For addition and subtraction, two numbers should be positive. If any
// negative number is entered then throw an exception in respective
// methods. So design an exception handler (ArithmeticException) in Add ()
// and Subtract () methods respectively to check whether any number is
// negative or not.
import java.util.*;
public class Q2A6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Integer: ");
        int number1 = sc.nextInt();
        System.out.println("Enter second integer: ");
        int number2 = sc.nextInt();
       
        try{
            int result = add(number1, number2);
            System.out.println("Your result is: " + result);
        }catch(ArithmeticException ex){
            System.out.println(ex);
        }

        try{
            int result = subtract(number1, number2);
            System.out.println("Your result is: " + result);
        }catch(ArithmeticException ex){
            System.out.println(ex);
        }
    }
    public static int add(int i, int j){
        if(i<0 || j<0){
            throw new ArithmeticException("Input cannot be negative");
        }
        return i+j;
    }
    public static int subtract(int i, int j){
        if(i<0 || j<0){
            throw new ArithmeticException("Input cannot be negative");
        }
        return i-j;
    }

}