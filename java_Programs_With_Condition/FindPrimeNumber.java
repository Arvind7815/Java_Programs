package java_Programs_With_Condition;
import java.util.Scanner;
public class FindPrimeNumber {
	public void findPrimeNumber(int num)
	{
		if(num==0||num==-1)
			
		{
			System.out.println("It is not a prime number ");
		}
		else
		{
		boolean flag = false;
		
		for(int i=2;i<num;i++)
		{
			int reminder = num % i;
			if(reminder==0)
			{
				flag = true; // If (reminder = 0 ) true block not run .
					    break;
			}
		}
		if(flag==false)
		{
			System.out.println("It is a prime number ");
		}
		else
		{
			System.out.println("It is not a  Prime number ");
		}
	}
}
	public static void main(String[] args) {
		FindPrimeNumber ob = new FindPrimeNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your Input Value : ");
		int num = sc.nextInt();
		ob.findPrimeNumber(num);
		sc.close();	
	}
}
