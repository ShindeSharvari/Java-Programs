// print prime number present in the given range.

import java.util.Scanner;
class PrimeInRange
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start number : ");
		int start = sc.nextInt();

		System.out.print("Enter the end number : ");
		int end = sc.nextInt();

		for(int num=start ;num<=end ;num++)
		{
			int den;
			for(den=2;den<=num;den++)
			 {
			   if(num%den==0)
			    {
				   break;
			    }
			 }
			 if(num==den)
			{
				System.out.print(num+" ");
			}
		}
	}
}
