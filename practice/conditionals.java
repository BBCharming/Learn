//1. tenary
//2. switch case
import java.util.*;
public class conditionals
{
  public static void main(String[] head)
  {
    //declare vairables and instaciate objects
    int score = 0;
    Scanner i =  new Scanner(System.in);
    //get user input
    System.out.print("Enter Score: ");
    score = i.nextInt();
    String gender;
    i.nextLine();
    System.out.println("Enter Gender: ");
    gender = i.nextLine();
    String response = switch(gender)
    {
       case "male" -> "Ma Nigga";
       case "female" -> "Ma lady";
       default -> "That's Why you're Gay";
    };
    // categorize score
  ///  String category = (score == 1 && score == 2)? "Distiction" : (score == 3 && score == 4 )? "Merit"  : (score == 5 && score == 6)? "Credit" : (score == 7 && score == 8)? "Satisfatory": (score == 9)? "Umsatisfactory": "Invalid credit score";
    String category = switch (score)
    {
       case 1,2 -> "Distiction";
       case 3,4 -> "Merit";
       case 5,6 -> "Credit";
       case 7,8 -> "Satisfactory";
       case 9   -> "unsatisfactory";
       default -> "Invalid Credit score";
    };
     //  interger types: int byte short long char lomh long unsigned su
    //special: strings 
    // display results
   System.out.println(response);
  }
}

