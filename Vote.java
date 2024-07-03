import java.util.Scanner;

class Vote
{
   public static void main(String[] args)
    {

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter your age :");
     int num = sc.nextInt();

    if(num >= 18)
    {
     System.out.println("You can vote!");
    }
    else
    {
      System.out.println("You can't vote");
    }

    }
}