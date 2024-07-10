class CheckSumProduct
{
	public static void main(String[] args) 
	{
		int num = 526734;
		int sum=0;
		int product=1;

		while(num>0)
		{
			int rem = num%10;
			sum+=rem;
			product*=rem;
			num=num/10;
		}
		if(sum==product)
		{
			System.out.println("Sum and product of number is equal");
		}
		else
		{
			System.out.println("Sum and product of number is not equal");
		}
	}
}
