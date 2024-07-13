import java.util.Scanner;

class DuckNumber
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();

		int rem=0,reverse=0;
		while(num>0)
		{
			rem=num%10;
			if(rem==0)
			{
				System.out.println("The entered number is a duck number");
				break;
			}
			reverse=(reverse*10)+rem;
			num=num/10;
		}
		if(rem!=0)
		    {
		      System.out.println("The entered number is not a duck number");
            }
	}
}
