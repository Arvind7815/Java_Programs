package java_Programs_With_Condition;
import java.util.Scanner;
public class Calculation {
	
		public void addTwoNum(int a,int b)
		{
			int c = a + b;
			System.out.println("This is addition : "+c);
		}
		public void subTwoNum(int a,int b)
		{
			int c = a - b;
			System.out.println("This is substract : "+c);
		}
		public void multiTwoNum(int a,int b)
		{
			int c = a * b;
			System.out.println("This is multiply : "+c);
		}
		public void divTwoNum(int a,int b)
		{
		    int c = a / b;
			System.out.println("This is division : "+c);
		}
		public static void main(String[] args) {
			Calculation ob = new Calculation();
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter Integer Input !!");
			int a=sc.nextInt();
			int b=sc.nextInt();		
			
			ob.addTwoNum(a, b);
			ob.subTwoNum(a, b);
			ob.multiTwoNum(a, b);
			ob.divTwoNum(a, b);
		    
			sc.close();	  
		}	
    }
