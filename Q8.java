import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        String[] usernames = {"Mwaba", "Benjamin", "Henry", "Kalumbu", "Lisa", "Precious"};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter user name: ");
        String name = input.nextLine();
        boolean found = false;
        for (String username : usernames) {
           if(username.equalsIgnoreCase(name)){
               found = true;
               break;
           }
        }
        if(found){
            System.out.println("User found");
        }
        else{
            System.out.println("User not found");
        }
    }
}
