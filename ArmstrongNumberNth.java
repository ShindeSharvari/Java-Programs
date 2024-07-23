import java.util.Scanner;

class ArmstrongNumberNth 
	{
        public static void main(String[] args) 
		{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the position of Armstrong number: ");
            int pos = sc.nextInt();
            int count = 0;               // for position to check

            for(int num=0; ;num++)
			{
               int sum = 0;
               int digitCount = 0;      // to check count of digit in number

               for(int temp=num ;temp!= 0;temp/=10)      
			   {
                  digitCount++;
               }

               for(int temp=num;temp!= 0;temp/=10)     
			   {
                  int digit = temp % 10;   // extract number
                  int pow = 1;
                  for (int i = 0; i < digitCount; i++)   // give power to extracted number
				  {
                      pow *= digit;
                  }
                sum += pow;                           // sum after power 
               }

               if (sum == num)                       // If equals then armstrong and make count
			   {
                  count++;
               }
                            
               if (count == pos)                  // Check count and pos are same to display the nth number    
			   {
                   System.out.println("The " + pos + "th Armstrong number is: " + num);
                   break;
               }
        }
    }
}