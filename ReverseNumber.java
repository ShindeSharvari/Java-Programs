import java.util.Scanner;

class ReverseNumber 
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
			reverse=(reverse*10)+rem;
			num=num/10;
		}
		System.out.println("The reverse of entered number is : "+reverse);
	}
}
