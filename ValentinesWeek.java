import java.util.Scanner;
class ValentinesWeek
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the day 1-7 :");
	   int day = sc.nextInt();

	   switch(day)
		{
		   case 1 :
			   {
			      System.out.println("It's rose day !");
			      break;
			   }
			case 2 :
			   {
			      System.out.println("It's  propose day !");
			      break;
			   }
			case 3 :
			   {
			      System.out.println("It's chocolate day !");
			      break;
			   }
			case 4 :
			   {
			      System.out.println("It's teddy day !");
			      break;
			   }
			case 5 :
			  {
			      System.out.println("It's promise day !");
			      break;
			  }
			case 6 :
			  {
			      System.out.println("It's hug day !");
			      break;
			  }
			case 7 :
			  {
			      System.out.println("It's kiss day !");
			      break;
			  }  

			default :
			  {
				 System.out.println("Invalid Day");
			  }
		}
	}
}
