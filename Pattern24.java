/*

		* * * * * * * *
		  * * * * * * *
			* * * * * *
			  * * * * *
				* * * *
				  * * *
					* *
					  *

*/

class Pattern24
{
	public static void main(String[] args) 
	{
		int n=8;
		for (int i=0; i<n ;i++ )
		{
			for(int space=0 ; space<i ;space++)
			{
				System.out.print(" "+" ");
			}
			for(int star=0 ; star<n-i ;star++)
			{
				System.out.print("*"+" ");
			}
           System.out.println();
		}
	}
}