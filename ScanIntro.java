import java.util.Scanner;

class ScanIntro
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);

     System.out.println("what's your name ? ");
     String name = sc.nextLine();

     System.out.println("what's your age ?(Enter in years) ");
     byte age = sc.nextByte();

     System.out.println("what's your highest qualification ? ");
     sc.nextLine();
     String edu = sc.nextLine();

     System.out.println("what's your passout year ? ");
     short pass = sc.nextShort();

     System.out.println("what's your highest qualification percentage ?: ");
     float per = sc.nextFloat();

     System.out.println("where are u from ? ");
     sc.nextLine();
     String address = sc.nextLine();

     System.out.println("what's your mobile number ? ");
     long mobile = sc.nextLong();

     System.out.println("what's your hobbies ?: ");
     sc.nextLine();
     String hobby = sc.nextLine();
 
     System.out.println("what will you rate ourself on scale of 1-5 ?: ");
     byte rate = sc.nextByte();
     

     System.out.println("-----------INTRODUCTION------------");
     System.out.println("Hi! My name is : "+name);
     System.out.println("I am : "+age+" years old");
     System.out.println("I completed : "+edu);
     System.out.println("I am : "+pass+" passout");
     System.out.println("My highest qualification "+edu+ " percentage is : "+per+"%");
     System.out.println("I am from : "+address);
     System.out.println("My mobile number is : "+mobile);
     System.out.println("My hobbies are : "+hobby);
     System.out.println("I rate "+rate+" myself on a scale of 1-5");

   }
 
}
