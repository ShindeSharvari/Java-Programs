import java.util.Scanner;

class DigitCheck 
{
	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter the number : ");
	  int num = sc.nextInt();

	  System.out.print("Enter the digit : ");
	  int digit = sc.nextInt();
	  int rem=0 ;
      
	  while(num>0)
		{
           rem=num%10;
		   if(rem==digit)
			{
			   System.out.println("Digit is present in number");
			   break;
			}
			else if (num/10==0)
			{
				   System.out.println("Digit is not present in number");
			}
		   num=num/10;
		}
	}
}
