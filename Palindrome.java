import java.util.Scanner;

class Palindrome
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();

		int rem=0,reverse=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			reverse=(reverse*10)+rem;
			num=num/10;
		}
		if(temp==reverse)
		{
          System.out.println("The entered number is palindrome number");
		}
		else
		{
		   System.out.println("The entered number is not a palindrome number");
        }
	}
}
