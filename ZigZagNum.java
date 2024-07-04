// ZIZZAG pattern printing program  

import java.util.Scanner;
class ZigZagNum
{
	public static void main(String[]args)
	{
		int n1,n2,newNum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1 : ");
		n1=sc.nextInt();
		System.out.println("Enter n2 : ");
		n2=sc.nextInt();
		
		while(n1 != 0 && n2 != 0)
		{
			newNum=newNum*10 + (n2%10);
			n2/=10;
			newNum=newNum*10 + (n1%10);
			n1/=10;
		}

		if(n1 != 0 || n2 != 0)
		{
			System.out.println("Numbers are of different length .");
		}
		else
		{
			while(newNum != 0)
			{
				System.out.print(newNum%10);
				newNum/=10;
			}
		}
		
				
	}
}