package java_Loops;

public class DoWhileLoop {
	public void printNumber()
	{
		int i=1;
		do
		{
		System.out.println(i);	
		i++;
		}
		while(i<=20);
	}

	public static void main(String[] args) {
		DoWhileLoop ob = new DoWhileLoop();
		ob.printNumber();
	}
}
