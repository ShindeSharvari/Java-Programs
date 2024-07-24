/*

Given a number N, the task is to check whether the number is an Automorphic number or not.
A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.

Examples : 

Input  : N = 76 
Output : Automorphic
Explanation: As 76*76 = 5776

*/

import java.util.Scanner;
class Automorphic 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
                int temp=num;
		int count=0;
		int square=num*num;

		for(int i=num ;i>0;i/=10)
		{
			count++;
		}
		int rev=0;
		for(int i=count;count>0;count--)  
		{
			int rem=square%10;
			rev=(rev*10)+rem;          // From this we will get last digit as per count but in reverse
			square=square/10;
		}
		int last=0;
		while(rev>0)
		{
                        int rem=rev%10;
			last=(last*10)+rem;     //This will reverse the number again 
			rev=rev/10;
		}
		System.out.println(last);
		if(temp==last)
		{
			System.out.println(+temp+" is an automorphic number.");
		}
		else
		{
			System.out.println(+temp+" is not an automorphic number.");
		}
	}
}
