/*

* * * * * * * * * * *
* * * * * * * * *
* * * * * * *
* * * * *
* * *
*
* * *
* * * * *
* * * * * * *
* * * * * * * * *
* * * * * * * * * * *

*/

class Pattern40
{
	public static void main(String[] args) 
	{
		int n=11,space=0,star=n;

		for(int i=0; i<n ;i++)
		{
			for(int j=0;j<star;j++)
			{
				System.out.print("* ");
			}
			for(int j=0;j<space;j++)
			{
				System.out.print("  ");
			}
			System.out.println();
			if(i<n/2)
			{
				space+=2;
				star-=2;
			}
			else
			{
				space-=2;
				star+=2;
			}
		}
	}
}