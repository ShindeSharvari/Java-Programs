/* 
Print the perfect number between given range

Enter the start number
1
Enter the end number
10000
Perfect numbers between 1 and 10000 are
6
28
496
8128

*/

import java.util.Scanner;
class PerfectNumberInRangeByMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number ");
		int start = sc.nextInt();

        System.out.println("Enter the end number ");
		int end = sc.nextInt();

        System.out.println("Perfect numbers between "+start+" and "+end+" are");
		perfectRange(start,end);
	}

	public static void perfectRange(int start , int end)
	{
		while(start<=end)
		{
			if(checkPerfect(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}
	public static boolean checkPerfect(int num)
	{
		return num == sumOfDivisors(num);
	}

	public static int sumOfDivisors(int num)
	{
       int sum=0;
	   for(int i=1;i<=num/2;i++)
		{
		   if(num%i==0)
			{
			   sum+=i;
			}
		}
		return sum;
	}
}