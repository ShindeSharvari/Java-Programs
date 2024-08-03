import java.util.Scanner;
class ArmstrongByMethod 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		if(isArmstrong(num))
		{
			System.out.println(num+" is an armstrong number.");
		}
		else
		{
			System.out.println(num+" is not an armstrong number.");
		}

	}

	public static boolean isArmstrong(int num)
	{
		int ct=count(num);
		int sum=0;
		for(int i=num;i!=0;i/=10)
		{
			int rem=i%10;
			sum = sum + power(rem,ct);
		}
		return num==sum;
	}

	public static int power(int base,int raise)
	{
		int pow=1;
		for(int i=0; i<raise ;i++)
		{
			pow = pow*base;
		}
		return pow;
	}

	public static int count(int num)
	{
		int count=0;
		for(int i =num; i!=0;i/=10)
		{
			count++;
		}
		return count;
	}
}
