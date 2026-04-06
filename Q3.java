import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = input.nextInt();
        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        int quotient = number1 / number2;
        System.out.println("Sum: " + sum + "\nDifference: " + difference + "\nProduct: " + product + "\nQuotient: "
        + quotient);
        if(number1 >= number2){
            System.out.println("The first number is greater than the second number.");
        }
        else if (number1 <= number2) {
            System.out.println("The first number is less than the second number.");
        }
        else{
            System.out.println("The first number is equal to the second number.");
        }
    }
}
