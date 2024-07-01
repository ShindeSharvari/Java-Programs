import java.util.Scanner;

class FullName
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
  
        System.out.print("Enter the first name : ");
        String fname = sc.nextLine();

        System.out.print("Enter the middle name : ");
        String mname = sc.nextLine();

        System.out.print("Enter the last name : ");
        String lname = sc.nextLine();


       System.out.println("Full name is : "+fname+" "+mname+" "+lname);

     }
}