/*

          *
        *   *
      *       *
    *           *
  *               *
*                   *
  *               *
    *           *
      *       *
        *   *
          *

*/

class Pattern37 
{
	public static void main(String[] args) 
	{
		int n=11,space=n/2,star=0;

		for(int i=0; i<n ;i++)
		{
			for(int j=0;j<space;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<=star;j++)
			{
				if(j==0 || j==star)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
			if(i<n/2)
			{
				space--;
				star+=2;
			}
			else
			{
				space++;
				star-=2;
			}
		}
	}
}
