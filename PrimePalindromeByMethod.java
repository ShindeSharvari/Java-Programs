/*

Enter the number of PrimePalindrome you wanted
10
0
1
2
3
5
7
11
101
131
151

*/

import java.util.Scanner;
class PrimePalindromeByMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of PrimePalindrome you wanted");
		int num=sc.nextInt();

		nPalindromePrime(num);
	}

	public static void nPalindromePrime(int num)
	{
		int count=0;
		int start=0;
		while(count!=num)
		{
			if(isPalindrome(start) && isPrime(start))
			{
				System.out.println(start);
				count++;
			}
			start++;
		}
	}

	public static boolean isPrime(int num)
	{
		int den=2;
		for( ;den<num;den++)
		{
			if(num%den==0)
			{
				return false;
			}
		}
		return true;
	}

	public static boolean  isPalindrome(int num)
	{
		int rev=0;
		for(int i=num;i!=0;i/=10)
		{
			rev=rev*10+(i%10);
		}
		return num==rev;
	}
}
