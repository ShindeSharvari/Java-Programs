import java.util.Scanner;

class ScanDataTypes
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter the byte data: ");
     byte a = sc.nextByte();

     System.out.print("Enter the short data: ");
     short b = sc.nextShort();

     System.out.print("Enter the int data: ");
     int c = sc.nextInt();

     System.out.print("Enter the long data: ");
     long d = sc.nextLong();

     System.out.print("Enter the float data: ");
     float e = sc.nextFloat();

     System.out.print("Enter the double data: ");
     double f = sc.nextDouble();

     System.out.print("Enter the char data: ");
     char g = sc.next().charAt(0);

     System.out.print("Enter the boolean data: ");
     boolean h = sc.nextBoolean(); // reads "true" or "false", but leaves the newline character in the buffer

     System.out.print("Enter the string: ");
     sc.nextLine(); // consumes the remaining newline character in the buffer
     String i = sc.nextLine();  // reads the actual string input from the user

     System.out.println("The byte date u entered : "+a);
     System.out.println("The short date u entered : "+b);
     System.out.println("The int date u entered : "+c);
     System.out.println("The long date u entered : "+d);
     System.out.println("The float date u entered : "+e);
     System.out.println("The double date u entered : "+f);
     System.out.println("The char date u entered : "+g);
     System.out.println("The boolean date u entered : "+h);
     System.out.println("The string u entered : "+i);

   }
 
}
