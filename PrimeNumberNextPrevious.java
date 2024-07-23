import java.util.Scanner;

class PrimeNumberNextPrevious
	{
      public static void main(String[] args) 
		{
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number: ");
          int num = sc.nextInt();

         // Check if the input number is a prime number
         int den = 2;
         for (; den < num; den++) 
			 {
               if (num % den == 0) 
				   {
                     break;
                   }
             }

        if (num == den) 
		{
             System.out.println(num + " is a prime number.");
        } 
		else
		{
			// Find the previous prime number
            int prevPrime = num - 1;
            while (prevPrime > 1)
				{
                   int den2 = 2;
                   for (; den2 < prevPrime; den2++) 
					   {
                         if (prevPrime % den2 == 0) 
							 {
                                break;
                             }
                        }
                    if (prevPrime == den2) 
						{
                          System.out.println(prevPrime + " is the previous prime number before " + num);
                          break;
                        }
                   prevPrime--;
                 }

            // Find the next prime number
            int nextPrime = num + 1;
            while (true)
				{
                   int den3 = 2;
                   for (; den3 < nextPrime; den3++)
					   {
                         if (nextPrime % den3 == 0)
							 {
                               break;
                             }
                       }
                if (nextPrime == den3)
				{
                    System.out.println(nextPrime + " is the next prime number after " + num);
                    break;
                }
                nextPrime++;
            }
        }
    }
}
