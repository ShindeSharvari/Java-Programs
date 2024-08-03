import java.util.Scanner;
class StrongRangeByMethod
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number");
		int start = sc.nextInt();

		System.out.println("Enter the end number");
		int end = sc.nextInt();

        rangeOfStrong(start,end);
	}

	public static void rangeOfStrong(int start,int end)
	{
		while(start<=end)
		{
			if(isStrong(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}

	public static boolean isStrong(int num)
	{
		int sum=0;
		for(int i = num;i!=0;i/=10)
		{
			int rem=i%10;
			sum=sum+fact(rem);
		}
		return num==sum;
	}

	public static int fact(int num)
	{
		int fact=1;
		for(int i=num;i!=0;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
}
