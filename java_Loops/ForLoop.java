package java_Loops;
public class ForLoop {
	public void printNumber()
	{
		for(int i=2;i<=20;i++)
		{
			System.out.println("Print Number " + i);
		}
	}
	public static void main(String[] args) {
		ForLoop ob = new ForLoop();
		ob.printNumber();
	}
}
