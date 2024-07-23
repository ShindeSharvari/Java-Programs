/*
Enter the start number :1
Enter the end number :100
The ugly number between 1 and 100 are : 1,2,3,4,5,6,8,9,10,12,15,16,18,20,24,25,27,30,32,36,40,45,48,50,54,60,64,72,75,80,81,90,96,100,

*/

import java.util.Scanner;
class UglyNumberInRange
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start number :");
		int start=sc.nextInt();

		System.out.print("Enter the end number :");
		int end=sc.nextInt();

		System.out.print("The ugly number between "+start+" and "+end+" are : ");

		for(int num=start;num<=end;num++)
		{
			int temp=num;
		    while(temp>1)
		    {
			  if(temp%2==0)
			  {
				temp/=2;
			  }
			  else if(temp%3==0)
			  {
				temp/=3;
			  }
			 else if(temp%5==0)
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
			System.out.print(num+",");
		}
		}
	}
}
