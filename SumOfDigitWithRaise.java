/* program to get sum of digit of number with given raise for individual.

e.g  

num=1234
raise=3

1^3+2^3+3^3+4^3=sum 


Enter the number:123
Enter the raise value:2
Sum of digits with raise is : 14

*/

import java.util.Scanner;
class SumOfDigitWithRaise 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		System.out.print("Enter the raise value:");
		int raise=sc.nextInt();
		int temp=num;

		int sum=0;

		while(num!=0)
		{
			int rem=num%10;
			int pow=1;
			for(int i =0;i<raise;i++)
			{
				pow=pow*rem;
			}
			sum=sum+pow;
			num/=10;
		}
			System.out.println("Sum of digits with raise is : "+sum);
	}
}
