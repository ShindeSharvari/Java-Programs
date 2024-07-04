import java.util.Scanner;
class Month 
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the month :");
	   String month = sc.next();

	   switch(month)
		{
		   case "December":
           case "January":
           case "February":
			{
			   System.out.println("Winter Season");
			   break;
			}

		   case "March":
           case "April":
           case "May":
			{
			   System.out.println("Summer Season");
			   break;
			}

		   case "June":
           case "July":
           case "August":
			{
			   System.out.println("Rainy Season");
			   break;
			}

		   case "September":
           case "October":
           case "November":
			{
			   System.out.println("Autumn Season");
			   break;
			}

			default :
			{
				System.out.println("Invalid input");
			}
		}
	}
}
