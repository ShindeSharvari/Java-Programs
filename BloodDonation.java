import java.util.Scanner;

class BloodDonation
{
   public static void main(String[] args)
    {

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the hemoglobin level :");
     float num = sc.nextFloat();

    if(num >= 13)
    {
     System.out.println("You can donate blood.");
    }
    else
    {
      System.out.println("you cant't donate blood.");
    }

    }
}
