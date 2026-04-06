import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        boolean isValid = true;
        int number = 0;
        while(isValid){
            Scanner input =new Scanner(System.in);
            System.out.println("Enter a number between 1 and 10: ");
            number = input.nextInt();
            if(number > 1 && number < 10){
                isValid = false;
            }
        }
        int product = 0;
        for(int i = 0; i <= number; i++){
            product = i * number;
            System.out.println(i + " * " +  number + " = " + product);
        }
    }
}
