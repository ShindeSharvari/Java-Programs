import java.util.Scanner;
class TimeTable
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the day :");
	   String day = sc.next();

	   switch(day.toLowerCase())
		{
		   case "monday":
			{
			   System.out.println("English");
			   System.out.println("Marathi");
			   System.out.println("Algebra");
			   break;
			}
			case "tuesday":
			{
			   System.out.println("Hindi");
			   System.out.println("Sanskrit");
			   System.out.println("Geograpghy");
			   break;
			}
			case "wednesday":
			{
			   System.out.println("Science");
			   System.out.println("Hindi");
			   System.out.println("Geometry");
			   break;
			}
			case "thursday":
			{
			   System.out.println("English");
			   System.out.println("Music");
			   System.out.println("Algebra");
			   break;
			}
			case "friday":
			{
			   System.out.println("Scinece");
			   System.out.println("Hindi");
			   System.out.println("Marathi");
			   break;
			}
			case "saturday":
			{
			   System.out.println("Geomerty");
			   System.out.println("Science");
			   System.out.println("Hindi");
			   break;
			}
			case "sunday":
			{
			   System.out.println("It's holiday ! Have fun no lectures today.");
			   break;
			}

			default :
			{
				System.out.println("Invalid Day");
			}
		}
	}
}
