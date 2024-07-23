import java.util.Scanner;
class UglyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int num=sc.nextInt();
                int temp=num;
		while(temp>1)
		{
			if(temp%2==0)
			{
				temp/=2;
			}
			else if(num%3==0)
			{
				temp/=3;
			}
			else if(num%5==0)
			{
				temp/=5;
			}
			else
			{
				break;
			}
		}
		if(temp==1)
		{
		    System.out.println(num+" is an ugly number.");
		}
		else
		{
                     System.out.println(num+" is not an ugly number.");
		}
	}
}
