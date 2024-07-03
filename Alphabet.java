import java.util.Scanner;

class Alphabet
{
   public static void main(String[] args)
    {

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a character :");
     char ip = sc.next().charAt(0);

    if((ip >='a' && ip<='z')||(ip >='A' && ip<='Z'))
    {
     System.out.println("It is an alphabet!");
    }
    else
    {
      System.out.println("Not an alphabet!");
    }

    }
}