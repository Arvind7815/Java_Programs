package java_Programs_With_Condition;
import java.util.Scanner;

public class FindOddEven {
	public void findEvenOdd(int num)
	{
		int reminder=num%2;
		if(reminder==0)
		{
			System.out.println("It is Even Number : "+reminder);
		}
		else
		{
			System.out.println("It is Odd Number : "+reminder);
		}
	}	
	public static void main(String[] args) {
		FindOddEven ob = new FindOddEven();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter Integer Number");
		int num =sc.nextInt();
		ob.findEvenOdd(num);	
		sc.close();
	}
}

