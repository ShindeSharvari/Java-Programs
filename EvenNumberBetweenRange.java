import java.util.Scanner;

public class EvenNumberBetweenRange
{

    public static void main(String[] args)
  {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the first number of range: ");
       int m = scanner.nextInt();

       System.out.println("Enter the second number of range: ");
       int n = scanner.nextInt();

       System.out.println("Even numbers between " +m+ " and " +n+ " are: ");
       for(int i = m; i<=n ; i++)
       {
        if(i%2 == 0)
         {
             System.out.print(i + " ");
         }
       }
  }
}