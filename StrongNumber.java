/*

Check given number is strong number or not.

Strong number :- Sum of factorial of digit equal to number itself .

Enter the number:145
145 is a strong number.

Enter the number:2324
2324 is not a strong number.

*/

import java.util.Scanner;
class StrongNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int temp=num;

		int sum=0;;

		while(num!=0)
		{
			int rem=num%10;
			int fact=1;
			for(int i =rem;i>0;i--)
			{
				fact=fact*i;
			}
			sum+=fact;
			num/=10;
		}
		if(temp==sum)
		{
			System.out.println(+temp+" is a strong number.");
		}
		else
		{
            System.out.println(+temp+" is not a strong number.");
		}
	}
}