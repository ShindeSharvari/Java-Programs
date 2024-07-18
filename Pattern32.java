/*

              *
            *   *
          *       *
        *           *
      *               *
    *                   *
  *                       *
* * * * * * * * * * * * * * *

*/

class Pattern32
{
	public static void main(String[] args) 
	{
		int n=8;
		for (int i=0; i<n ;i++ )
		{
			for(int space=0 ; space<n-i-1 ;space++)
			{
				System.out.print(" "+" ");
			}
			for(int star=0 ; star<=2*i ;star++)
			{
				if(star==0 || star==2*i || i==n-1)
				{
				  System.out.print("*"+" ");
                }
				else
				{
					System.out.print(" "+" ");
				}
				
			}
           System.out.println();
		}
	}
}