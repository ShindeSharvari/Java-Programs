class SumOfNumber
{
	public static void main(String[] args) 
	{
		int num = 526734;
		int sum=0;

		while(num>0)
		{
			int rem = num%10;
			sum+=rem;
			num=num/10;
		}
		System.out.println(sum);
	}
}
