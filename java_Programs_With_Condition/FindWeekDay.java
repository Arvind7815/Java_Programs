package java_Programs_With_Condition;
import java.util.Scanner;
public class FindWeekDay {
	
	public void findWeekDay(String weekName)
	    {
		if(weekName.equalsIgnoreCase("monday"))
		{
			System.out.println("Is is first day of the week");
		}
		else if(weekName.equalsIgnoreCase("tuesday"))
		{
			System.out.println("Is is second day of the week");
		}
		else if(weekName.equalsIgnoreCase("wednesday"))
		{
			System.out.println("Is is third day of the week");
		}
		else if(weekName.equalsIgnoreCase("thursday"))
		{
			System.out.println("Is is forth day of the week");
		}
		else if(weekName.equalsIgnoreCase("friday"))
		{
			System.out.println("Is is fifth day of the week");
		}
		else if(weekName.equalsIgnoreCase("saturday"))
		{
			System.out.println("Is is sixth day of the week");
		}
		else if(weekName.equalsIgnoreCase("sunday"))
		{
			System.out.println("It is Holiday");
		}
		else
		{
			System.out.println("It is invalid week of the day");
		}
	}
	public static void main(String[] args) {
		
		FindWeekDay ob = new FindWeekDay();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Week Day Name ");
		String weekName=sc.next();
		ob.findWeekDay(weekName);	
		
			sc.close();
	}
}

