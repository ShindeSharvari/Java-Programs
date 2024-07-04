import java.util.Scanner;
class ColorSuggestion
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
			      System.out.println("White");
			      break;
			   }
			case "tuesday":
			   {
			      System.out.println("Red");
			      break;
			   }
			case "wednesday":
			   {
			      System.out.println("Green");
			      break;
			   }
			case "thursday":
			   {
			      System.out.println("Yellow");
			      break;
			   }
			case "friday":
			  {
			      System.out.println("Pink");
			      break;
			  }
			case "saturday":
			  {
			      System.out.println("Black");
			      break;
			  }
			case "sunday":
			  {
			      System.out.println("Orange");
			      break;
			  }  

			default :
			  {
				 System.out.println("Invalid Day");
			  }
		}
	}
}
