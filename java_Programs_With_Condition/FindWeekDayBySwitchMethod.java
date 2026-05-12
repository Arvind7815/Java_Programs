package java_Programs_With_Condition;
import java.util.Scanner;

public class FindWeekDayBySwitchMethod {
public void findWeekDay(String weekName) {

			switch (weekName.toLowerCase()) {

			case "monday":
				System.out.println("It is first day of the week");
				break;

			case "tuesday":
				System.out.println("It is second day of the week");
				break;

			case "wednesday":
				System.out.println("It is third day of the week");
				break;

			case "thursday":
				System.out.println("It is fourth day of the week");
				break;

			case "friday":
				System.out.println("It is fifth day of the week");
				break;

			case "saturday":
				System.out.println("It is sixth day of the week");
				break;

			case "sunday":
				System.out.println("It is Holiday");
				break;

			default:
				System.out.println("It is invalid week day");
			}
		}

		public static void main(String[] args) {

			FindWeekDay ob = new FindWeekDay();

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Your Week Day Name");

			String weekName = sc.next();

			ob.findWeekDay(weekName);

			sc.close();
		}
	}

