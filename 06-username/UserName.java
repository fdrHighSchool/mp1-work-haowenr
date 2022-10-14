
import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
   
    Scanner s = new Scanner(System.in);

    
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Are you a teacher or student? ");
    String role = s.nextLine();
    
    System.out.println("Hello " + getInitial(firstName) + "." + getInitial(lastName) + ".");

    s.close();
  } 
  
  public static String getInitial(String n) {
    return n.substring(0, 1);
  } 

} 