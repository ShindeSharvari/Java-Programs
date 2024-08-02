/*

Enter the start number
1
Enter the end number
100
Buzz numbers between 1 and 100 are
7
14
17
21
27
28
35
37
42
47
49
56
57
63
67
70
77
84
87
91
97
98

*/


import java.util.Scanner;
class BuzzNumberInRangeByMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number ");
		int start = sc.nextInt();

        System.out.println("Enter the end number ");
		int end = sc.nextInt();

        System.out.println("Buzz numbers between "+start+" and "+end+" are");
		buzzRange(start,end);
	}

	public static void buzzRange(int start , int end)
	{
		while(start<=end)
		{
			if(checkBuzz(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}

	public static boolean checkBuzz(int num)
	{
		return num%10==7 || num%7==0;
	}
}