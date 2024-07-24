/*

Enter the number of pairs: 10
1,2
2,3
3,5
5,7
11,13
17,19
29,31
41,43
59,61
71,73

*/

import java.util.Scanner;
class TwinPrimePairs
{
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the number of pairs: ");
       int pair = scanner.nextInt();

	   int p1=1;
	   int num=p1+1;
	   int count=0;
	   for(int i=0; ;i++)
	  {
		   int den=2;
		   for(;den<num;den++)
		  {
			   if(num%den==0)
			  {
				   break;
			  }
		  }
		  if(num==den)
		  {
			  if(num-p1<=2)
			  {
				  System.out.println(p1+ ","+num);
				  i++;
				  p1=num;
				  count++;
			  }
			  else
			  {
				  p1=num;
			  }
		  }
		  if(count==pair)
		  {
			  break;
		  }
		  num++;
	  }
  }
}