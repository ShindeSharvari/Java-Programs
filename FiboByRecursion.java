class FiboByRecursion 
{
	public static void main(String[] args) 
	{
		System.out.println(fibo(5,0,0,1));
	}

	public static int fibo(int n,int count,int n1,int n2)
	{
		if(count==n-1)
		{
			return n1;
		}
		int n3=n1+n2;
		return fibo(n,count+1,n2,n3);
	}
}
