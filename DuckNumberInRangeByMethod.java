import java.util.Scanner;
class DuckNumberInRangeByMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number ");
		int start = sc.nextInt();

        System.out.println("Enter the end number ");
		int end = sc.nextInt();

        System.out.println("Duck numbers between "+start+" and "+end+" are");
		duckRange(start,end);
	}

	public static void duckRange(int start , int end)
	{
		while(start<=end)
		{
			if(checkDuck(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}

	public static boolean checkDuck(int num)
	{
		while(num!=0)
		{
			if (num%10==0)
			{
				return true;
			}
			num/=10;
		}
		return false;
	}
}