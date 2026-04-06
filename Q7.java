import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        int number = 0;
       // int tempValue1 = 0;
        //int tempValue2 = 0;
        int sum = arr[0];
        int average = 0;
        int minValue = arr[0];
        int maxValue = arr[0];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter a number: ");
            number = input.nextInt();
            arr[i] = number;
           // System.out.println("Array elements: " + arr[i]);
        }
        for(int i = 0; i < arr.length - 1; i++){
            sum = arr[i] + arr[i+1];
            average = sum / arr.length;
        }
        for(int i = 1; i < arr.length; i++){
            if(minValue > arr[i]){
                minValue = arr[i];
            }
        }
        for(int i = 1; i < arr.length; i++){
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        System.out.println("Sum: " + sum + "\nAverage: " + average + "\nMinimum Value: " + minValue + "\nMaximum Value: "
        + maxValue);
    }
}
