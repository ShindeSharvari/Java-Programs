import java.util.Scanner;
class NeonNumberInRangeByMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number ");
		int start = sc.nextInt();

        System.out.println("Enter the end number ");
		int end = sc.nextInt();

        System.out.println("Neon numbers between "+start+" and "+end+" are");
		neonRange(start,end);
	}

	public static void neonRange(int start , int end)
	{
		while(start<=end)
		{
			if(checkNeon(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}

	public static boolean checkNeon(int num)
	{
		return num == sumOfSquare(num);
	}

	public static int square(int num)
    {
		return num*num;
	}
	public static int sumOfSquare(int num)
	{
		int sum=0;
		int square= square(num);
		while(square>0)
		{
			sum=sum+(square%10);
			square/=10;
		}
		return sum;
	}
}