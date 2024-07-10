class SumEvenOdd 
{
	public static void main(String[] args) 
	{
		int num = 1238764;
		int evenSum=0;
		int oddSum=0;

		while(num > 0)
		{
			int rem = num%10;
			if(rem % 2==0)
			{
				evenSum = evenSum + rem;
			}
			else
			{
				oddSum = oddSum + rem;
			}
			num = num/10;
		}
		System.out.println("Even Sum : "+evenSum);
		System.out.println("Odd Sum : "+oddSum);
	}
}
