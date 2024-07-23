import java.util.Scanner;
class DisariumNumberInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the starting number : ");
		long start=sc.nextLong();

		System.out.print("Enter the eding number : ");
	        long end=sc.nextLong();


		while(start<=end)
		{

		long count=0;
		for(long i=start ;i>0;i/=10)
		{
			count++;
		}
		long temp=start;
		long sum=0;
		while(temp>0)
		{
			long rem=temp%10;
			long pow=1;
			
			for(long j=0;j<count;j++)
			{
				pow=pow*rem;
			}
			sum+=pow;
			temp/=10;
			count--;
		}
		if(start==sum)
		{
			System.out.println(start);
		}
		start++;
		}
	}
}
