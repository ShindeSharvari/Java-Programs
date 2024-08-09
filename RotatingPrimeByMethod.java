class RotatingPrimeByMethod 
{
	public static void main(String[] args) 
	{
		System.out.println(isRotatingPrime(102));
	}

	public static boolean isRotatingPrime(int num)
	{
		if(isPrime(num))
		{
			int rot = rotate(num);
			while(rot!=0)
			{
				if(isPrime(rot))
				{
					rot = rotate(rot);
				}
				else
				{
					break ;
				}
			}
			return num==rot;
		}
		else
		{
			return false;
		}
	}

	public static int rotate(int num)
	{
		int last = num%10;
		num/=10;
		int ans = last * power(10,count(num))+num;
		return ans;

    //  return(num%10)* power(10,count(num)-1)+num/10;
	}

   public static boolean isPrime(int num)
	{
		int den=2;
		for( ;den<num;den++)
		{
			if(num%den==0)
			{
				return false;
			}
		}
		return true;
	}
}
