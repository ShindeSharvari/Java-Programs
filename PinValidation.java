// Verify user enter pin with stored pin and show status and only four attempts allowed 

import java.util.Scanner;

class PinValidation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int stored = 9011;
		int attempt = 0;

		do
		{
			System.out.print("Enter your pin :");
		    int pin = sc.nextInt();
			if(pin==stored)
			{
				System.out.println("Logged In !");
				break;
			}
			else
			{
               System.out.println("Invalid pin");
			   attempt++;
			}
		}
		while (attempt < 4);

		if(attempt == 4)
		{
			System.out.println("Maximum limit reached !");
		}
	}
}
