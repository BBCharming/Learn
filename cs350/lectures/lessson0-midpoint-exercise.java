
import java.util.Scanner;

class Lesson1 {
    public static void main(String[] argv) {
        String name;
        double m, x1, x2, y1, y2;
        Scanner input = new Scanner(System.in);

        // 1. Get coordinates 
        System.out.print("Enter the value of x1: ");
        x1 = input.nextDouble();

        System.out.print("Enter the value of y1: ");
        y1 = input.nextDouble();

        System.out.print("Enter the value of x2: ");
        x2 = input.nextDouble();

        System.out.print("Enter the value of y2: ");
        y2 = input.nextDouble();

        // 2. Calculate the gradient
        m = (y2 - y1) / (x2 - x1);

        // 3. Clear the buffer!
        // This consumes the 'enter' key press from the last double input
        input.nextLine();

        System.out.print("Your name please: ");
        name = input.nextLine();

        // 4. print the output using println
        System.out.println("Hello, " + name + ", the value for the gradient is " + m);

        input.close();
    }
}
