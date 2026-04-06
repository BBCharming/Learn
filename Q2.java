import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter User name: ");
        String username = input.nextLine();
        System.out.println("Enter age: ");
        int age = input.nextInt();
        System.out.println("Enter account balance: ");
        double accountBalance = input.nextDouble();
        System.out.println("Hello, " + username + " you're " + age + " years old and your account balance is K"
        + accountBalance);
    }
}
