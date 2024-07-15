/* Find the even odd count of digit in given number
  
  output :- 
  Enter the number : 345578852
The even number count in 345578852 is 4

The even number count in 345578852 is 5

*/

import java.util.Scanner;

class EvenOddCount
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int evenCount=0,oddCount=0,temp=num;

		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
			num=num/10;
		}
		System.out.println("The even number count in "+temp+" is "+evenCount);
		System.out.println();
		System.out.println("The even number count in "+temp+" is "+oddCount);
	}
}