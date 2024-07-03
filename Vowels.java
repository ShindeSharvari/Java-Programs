import java.util.Scanner;

class Vowels
{
   public static void main(String[] args)
    {

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a character :");
     char ip = sc.next().charAt(0);

    if((ip >='a' && ip<='z')||(ip >='A' && ip<='Z'))
    {
     
     if(ip=='a'||ip=='e'||ip=='i'||ip=='o'||ip=='u'||ip=='A'||ip=='E'||ip=='I'||ip=='O'||ip=='U')
     {
        System.out.println("It is a vowel !");
     }
     else
     {
        System.out.println("It is a consonant !"); 
     }
    }
    else
    {
      System.out.println("Not an alphabet!");
    }

   }
}