
/**
 * Write a description of class Date here.
 *
 * @ Haowen Ruan
 * @9/28/22
 */
 import java.util.Scanner;  
public class Date
{
   public static void main(String[] args) {
     Scanner zzz = new Scanner(System.in);
      
     
       System.out.println("Enter the day of the week");
      String day = zzz.nextLine();
       
       System.out.println("Enter the month");
      String Month = zzz.nextLine();
      
       System.out.println("Enter the year");
      String Year = zzz.nextLine(); 
      
       System.out.println("Enter the day of the month");
      String dayofmonth = zzz.nextLine();
      
       zzz.close(); 
       
       System.out.println("American format : " + day + "," + Month + dayofmonth + "," + Year );
       System.out.println("EU format :"  + day + " " + dayofmonth + " " + Month + " " + Year);
    
    }
}
 