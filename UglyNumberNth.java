/*

Enter the position u want an ugly number :11
The 11 position ugly number is : 15

*/

import java.util.Scanner;
class UglyNumberNth
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the position u want an ugly number :");
		int pos=sc.nextInt();
        int count=0;
		for(int num=1; ;num++)
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
			count++;
		}
		if(count==pos)
		{
			System.out.println("The "+pos+" position ugly number is : "+num);
			break;
		}
		}
	}
}
