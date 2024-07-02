import java.util.Scanner;

class EvenOdd
{
   public static void main(String[] args)
    {

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number to check even or odd :");
     int num = sc.nextInt();

    if(num % 2 == 0)
    {
     System.out.println("The entered number "+num+" is even number.");
    }
    else
    {
      System.out.println("The entered number "+num+" is odd number.");
    }

    }
}