/* Write a Java program that takes an integer input n from the user
 and prints the multiplication table for that number up to 10. 
The program should print each line in the format: n x i = result, where i ranges from 1 to 10.

Question Description:

Use System.out.println(n+"x" +i+ "="+(n*i)) to print results.*/



import java.util.Scanner;

public class PrintTable
{
  public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the number to print table: ");
      int n = scanner.nextInt();

      for (int i = 1; i <= 10; i++)

      {
          System.out.println(n+" x " +i+ " = "+(n*i));
      }
   }
}