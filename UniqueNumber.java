/*

A unique number is a positive integer whose digits are distinct, i.e., no digit is repeated. 

For example:

123 is a unique number because it has three distinct digits: 1, 2, and 3.
121 is not a unique number because it has a repeated digit: 1.
98765 is a unique number because it has five distinct digits: 9, 8, 7, 6, and 5.

*/

import java.util.Scanner;
class UniqueNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
                int temp1=num;
                while(temp1>0)   
		 {
		   int rem=temp1%10;
		   temp1/=10;
		   int temp2=temp1,rem2=0;   // stored in temp2 so inner loop will work on temp2 and temp1 will be as it is for outer loop.
		   while(temp2>0)
			{
			   rem2=temp2%10;
		           if(rem2==rem)
		             {
			       break;
		             } 
			   temp2/=10;
		        }  
		   if(rem2==rem)
		   {   
		       System.out.println(num+" is not an unique number.");
			break;
		   } 
		}
		if(temp1==0)   //outer loop becomes zero , means conditon false.
		{
			System.out.println(num+ " is an unique number");
		}
	}
}
