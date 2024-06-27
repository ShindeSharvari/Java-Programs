import java.util.Scanner;

public class IfStatement
{
   public static void main(String[] args)
  {
    Scanner scanner =  new Scanner(System.in);
    System.out.println("Are u a incubation student:");
    String a = scanner.next();
    boolean ip= a.equalsIgnoreCase("yes");
    if(ip == true)
   {
     System.out.println("Please pay the fees");
   }
   System.out.println("Attend the class");
  }
}