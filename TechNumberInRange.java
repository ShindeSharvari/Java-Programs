// Tech number in given range 
import java.util.Scanner;
class TechNumberInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the start number : ");
		int start = sc.nextInt();

		System.out.print("Enter the number : ");
		int end = sc.nextInt();


                for(int num=start;num<=end;num++)
		{
		   int count=0;
		   for(int i=num;i!=0;i/=10)
		   {
                     count++;
		   }
		   if(count%2==0)
		   {
			  int den=1;
			  for(int i=0;i<count/2;i++)
			  {
			    	den=den*10;
			  }
			  int last = num%den;
			  int first = num/den;
			  int sum = first + last;
			  if((sum*sum)==num)
			  {
			    	System.out.println(num);
			  }
		   }
		}
	}
}
