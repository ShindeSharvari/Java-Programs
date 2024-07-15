/* 
Question - Design pattern by taking input from user .

Output :- 
	Enter the length : 6
	Enter the height : 5
	*  *  *  *  *  *
	*  *  *  *  *  *
	*  *  *  *  *  *
	*  *  *  *  *  *
	*  *  *  *  *  *

*/

import java.util.Scanner;

class PatternDesignByUser
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length : ");
		int length = sc.nextInt();

		System.out.print("Enter the height : ");
		int height = sc.nextInt();
		for(int out=0;out<height;out++)
		{
			for(int in=0 ;in<length;in++)
			{
				System.out.print("*" +"  ");
			}
			System.out.println();
		}
	}
}