import java.util.Scanner;
class OddInRangeByMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number ");
		int start = sc.nextInt();

        System.out.println("Enter the end number ");
		int end = sc.nextInt();

        System.out.println("Odd numbers between "+start+" and "+end+" are");
		oddRange(start,end);
	}

	public static void oddRange(int start , int end)
	{
		while(start<=end)
		{
			if(checkOdd(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}
	public static boolean checkOdd(int num)
	{
		return num%2!=0;
	}
}
