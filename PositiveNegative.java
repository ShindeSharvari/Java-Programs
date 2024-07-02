import java.util.Scanner;

class PositiveNegative
{
   public static void main(String[] args)
    {

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the number to check positive or negative :");
     int num = sc.nextInt();

    if(num > 0)
    {
     System.out.println("The entered number "+num+" is positive number.");
    }
    else
    {
      System.out.println("The entered number "+num+" is negative number.");
    }

    }
}