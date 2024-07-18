/*

                        *
                      * * *
                    * * * * *
                  * * * * * * *
                * * * * * * * * *
              * * * * * * * * * * *
            * * * * * * * * * * * * *
              * * * * * * * * * * *
                * * * * * * * * *
                  * * * * * * *
                    * * * * *
                      * * *
                        *

*/
class Pattern35 
{
	public static void main(String[] args) 
	{
		int n=13;
		for (int i=0; i<n;i++ )
		{
			if(i<=n/2)
			{
				for(int space=0 ; space<n-i-1 ;space++)
			    {
					System.out.print(" "+" ");
				}
				for(int star=0 ; star<=2*i ;star++)
				{
					System.out.print("*"+" ");
				}
			}
			else
			{
				for(int space=0 ; space<i ;space++)
				{
					System.out.print(" "+" ");
				}
				for(int star=0 ; star<2*(n-i)-1 ;star++)
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}
}
