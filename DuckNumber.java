/*check entered number is duck number or not
 DUCK NUMBER - If number contain 0 in it ,but  not at first*/

import java.util.Scanner;

class DuckNumber
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();

		int rem=0;
		while(num>0)
		{
			rem=num%10;
			if(rem==0)
			{
				System.out.println("The entered number is a duck number");
				break;
			}
			else if(num/10==0)  // reached end 
			{
               System.out.println("The entered number is not a duck number");
			}
			num=num/10;
		}
	}
}
