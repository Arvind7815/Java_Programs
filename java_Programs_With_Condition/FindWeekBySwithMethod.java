package java_Programs_With_Condition;

import java.util.Scanner;

public class FindWeekBySwithMethod {
	public void findWeekDays(String weekName) {
		switch (weekName.toLowerCase())

		{
		case "monday": {
			System.out.println("It is First day");
			break;
		}
		case "tuesday": {
			System.out.println("It is second day");
			break;

		}
		case "wednesday": {
			System.out.println("It is third day");
			break;
		}
		case "thursday": {
			System.out.println("It is fourth day");
			break;
		}
		case "friday": {
			System.out.println("It is fifth day");
			break;
		}
		case "saturday": {
			System.out.println("It is sixth day");
			break;
		}
		case "sunday": {
			System.out.println("Its Holiday");
			break;
		}
		default: {
			System.out.println("It is invalid day");
		}
		}
	}

	public static void main(String[] args) {
		FindWeekBySwithMethod ob = new FindWeekBySwithMethod();
		Scanner sc = new Scanner(System.in);
		System.out.println("Plese Enter Your Week Day");
		String weekName = sc.next();
		ob.findWeekDays(weekName);
		sc.close();
	}
}
