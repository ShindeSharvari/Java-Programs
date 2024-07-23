import java.util.Scanner;
class ArmstrongNumberInRange 
{
	public static void main(String[] args) 
	{
                Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number:");
		long start=sc.nextLong();

		System.out.print("Enter the second number:");
		long end=sc.nextLong();

		while(start<=end)
		{
                long count=0;
		for(long i=start ;i!=0;i/=10)
		{
			
			count++;
		}
		long sum=0;
		for(long i=start ;i!=0;i/=10)
		{
			long rem =i%10;
			long pow = 1;
			for(long j=0;j<count;j++)
			{
				pow=pow*rem;
			}
			sum=sum+pow;
		}
                if(start==sum)
		{
			System.out.println(start);
		}
		start++;
	}
  }
}
