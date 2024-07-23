// Print nth strog number.
import java.util.Scanner;
class StrongNumberNth
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the position for stong number:");
		int pos=sc.nextInt();

                int count=0,num=1;
		
                while(true)          // We dont know so we give true when our condition becomes true
		{
                int temp=num;       // assigned to temp so operations will be done on temp and num will be safe to compare.
		int sum=0;
		while(temp>0)
		{
			
			int rem=temp%10;           // Extracting Number
			int fact=1;
			for(int i =rem;i>0;i--)    //Getting factorial of extracted number
			{
				fact=fact*i;
			}
			sum+=fact;                 // Getting sum of factorials
			temp/=10;
		}
		if(num==sum)                  // Comparing num and sum to check strong or not 
		{
			count++;
		}
		if(count==pos)               // check count == pos so to get nth number
		{
		    System.out.println("The "+pos+" position strong number is: "+num);
		    break;
		}
		num++;
	   }
	}
}
