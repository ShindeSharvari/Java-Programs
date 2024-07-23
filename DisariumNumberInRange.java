import java.util.Scanner;
class DisariumNumberInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the starting number : ");
		int start=sc.nextInt();

		System.out.print("Enter the eding number : ");
		int end=sc.nextInt();


		while(start<=end)
		{

		int count=0;
		for(int i=start ;i>0;i/=10)
		{
			count++;
		}
		int temp=start;
		int sum=0;
		while(temp>0)
		{
			int rem=temp%10;
			int pow=1;
			
			for(int j=0;j<count;j++)
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
