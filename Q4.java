import java.util.*;
public class Q4 {

    //grant access
    public static boolean grantAccess(){
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();
        if (name.equals( "Ben") && password.equals("Woo"))
        {
            System.out.println("Access Granted\n");
            return true;
        }
        else
        {
            System.out.println(" Access Denied\n");
            return false;
        }
    };
    ///

    public static void main(String[] args) {


        int counter = 0;
        if (counter  <= 3)
        {
            boolean code =   grantAccess();
            counter++;
            if (counter == 1 && !code)
            {
                code = grantAccess();
                counter++;
            }
            if (counter == 2 && !code)
            {
                grantAccess();
                counter++;
            }
        }
        else
            System.out.println("System Locked");

    }

}