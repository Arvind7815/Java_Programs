package java_Programs_With_Condition;
import java.util.Scanner;
public class BillDetails {
	public float calculateGst(int price)
	{
		float gst=(price*18)/100;
		return gst;
	}
	public static void main(String[] args) {
		BillDetails ob = new BillDetails();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter Your Product Name ?");
		String productName=sc.next();
		
		System.out.println("Please Enter Your Product Price ?");
		int productPrice=sc.nextInt();
		
		float gst=ob.calculateGst(productPrice);
		float totalPrice = productPrice+gst;
		
		System.out.println("\n----------Bill Details------------");
		System.out.println("Your product name : "+productName);
		System.out.println("Your product price : "+productPrice);
		System.out.println("Your gst calculate : "+gst);
		System.out.println("Your total price : "+totalPrice);
		sc.close();			
	}
}
