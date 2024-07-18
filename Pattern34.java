/*

*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*

*/

class Pattern34 
{
	public static void main(String[] args) 
	{ 
		int n=11;
	    for(int i=0;i<n ;i++ )
	    {  
			if(i<=n/2)
			{
			  for (int j=0;j<=i ;j++ )
			   {
				  System.out.print("*"+" ");
			   }
			}
			else
			{
			    for(int k= 0;k<n-i;k++)
			     {
				    System.out.print("*"+" ");
			     }
			}
			System.out.println();
	    }
	}
}
