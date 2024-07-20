/*

Given a number “n”, find if it is Disarium or not. 
A number is called Disarium if sum of its digits powered with their respective positions is equal to the number itself.

Examples: 

Input   : n = 135
Output  : Yes 
1^1 + 3^2 + 5^3 = 135
Therefore, 135 is a Disarium number

Input   : n = 89
Output  : Yes 
8^1+9^2 = 89
Therefore, 89 is a Disarium number

*/

import java.util.Scanner;
class Disarium 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int temp=num;

		int count=0,sum=0;
		for(int i=num ;i>0;i/=10)
		{
			count++;
		}
		while(temp>0)
		{
			int rem=temp%10;
			int pow=1;
			for(int j=0;j<count;j++)
			{
				pow=pow*rem;
			}
			sum+=pow;
			temp/=10;
			count--;
		}
		if(num==sum)
		{
			System.out.println(num+" is a disarium number");
		}
		else
		{
			System.out.println(num+" is not a disarium number");
		}
	}
}
