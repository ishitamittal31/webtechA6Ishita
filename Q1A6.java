// ishita mittal - 19105121

// For division and multiplication two numbers should not be zero. If zero is
// entered for any number then throw an exception in respective methods.
// So design an exception handler (ArithmeticException) in multiply () and
// Division () methods respectively to check whether any number is zero or
// not.
import java.util.*;
class Q1A6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = sc.nextInt();
        System.out.println("Enter second number:");
        int number2 = sc.nextInt();
        divide(number1, number2);

        multiply(number1, number2);
    }
    public static void divide(int i, int j){
        try{
            System.out.println("The result of division is: " + i/j);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide number with 0" + e);
            
        }
        
    }
    public static void multiply(int i, int j){
        try{
            System.out.println("The result of multiplication is: " + i*j);
        }
        catch(ArithmeticException e){
            System.out.println("Exception occured. Cannot perform operation");
        }
    }
}