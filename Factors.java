/* Question:

Write a Java program that takes an integer input n from the user and prints the count of the factors of n.

Question Description:

A factor of a number is an integer which divides that number exactly without leaving a remainder.

Use System.out.printin to print the result.*/




import java.util.Scanner;

public class Factors
{
   public static void main(String[] args)
   {

     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the number to get count of the factors: ");
     int n = scanner.nextInt();
     int factorCount = 0;

     for (int i = 1; i <= n; i++)
     {
       if (n % i == 0)
       {
           factorCount++;
       }
     }
  
      System.out.println(factorCount);
    
   }
}

