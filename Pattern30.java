/*

                            10
                        11  12
                    13  14  15
                16  17  18  19
            20  21  22  23  24
        25  26  27  28  29  30
    31  32  33  34  35  36  37
38  39  40  41  42  43  44  45

*/
class Pattern30 
{
	public static void main(String[] args) 
	{
		int n=8;
		int num=10;
		for(int i=0;i<n;i++)
		{   
           // for (int space=0;space<n-i-1 ;space++ ) // This will also works.

		    for (int space=1;space<n-i ;space++ )
			{
				System.out.print("  "+"  ");
			}
			for(int star=0 ; star<=i;star++)
			{
				System.out.print(num+"  ");
				num++;
			}
			System.out.println();
		}
	}
}
