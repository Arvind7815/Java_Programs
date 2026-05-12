package java_Programs_With_Condition;
import java.util.Scanner;
public class Votingutility {
	
	public void getValidate(int age)
	{
	if(age<18)
	{
	System.out.println(age+" is not eligible");
	}
	else if(age>=18&age<=60)
	{
	System.out.println(age+ " is eligible");
	}
	else
	{
	System.out.println(age+" is Retired !");
	}
	}
	public static void main(String[] args)
	{
	Votingutility ob = new Votingutility();
	Scanner sc= new Scanner(System.in);
	System.out.println("Please enter the age");
	int age=sc.nextInt();
	ob.getValidate(age);
	sc.close();
	}
}
	 
	 
	 
	 
	 
