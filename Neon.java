/*

A positive integer whose sum of digits of its square is equal to the number itself is called a neon number.

Input : 9
Output : Neon Number
Explanation: square is 9*9 = 81 and 
sum of the digits of the square is 9.

Input :12
Output : Not a Neon Number
Explanation: square is 12*12 = 144 and 
sum of the digits of the square is 9 (1 + 4 + 4) which is not equal to 12.

*/


import java.util.Scanner;
class Neon
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
       
	    int square=num*num;
		int sum=0;

		while(square>0)
		{
			int rem = square%10;
			sum=sum+rem;
			square=square/10;
		}
		if(num==sum)
		{
			System.out.println(num+" is a neon number.");
		}
		else
		{
           System.out.println(num+" is not a neon number");
		}
	}
}
