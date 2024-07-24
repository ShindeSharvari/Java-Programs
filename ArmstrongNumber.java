/*

Check entered number is an armstrong number or not

Enter the number:153
153 is  armstrong number.

Enter the number:4566
4566 is not  armstrong number.

NOTE : If sum of power of digits equal to number , then that number is said to be armstrong number.
       where, 
	   power = count of digit in given number.

*/

import java.util.Scanner;
class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
                Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int temp=num,sum=0,count=0;

		for(int i=num ;i!=0;i/=10)
		{
			count++;
		}
		for(int i=num ;i!=0;i/=10)
		{
			int rem =i%10;
			int pow = 1;
			for(int j=0;j<count;j++)
			{
				pow=pow*rem;
			}
			sum=sum+pow;
		}
                if(temp==sum)
		{
		     System.out.println(+temp+" is armstrong number.");
		}
		else
		{
                     System.out.println(+temp+" is not armstrong number.");
		}
	}
}
