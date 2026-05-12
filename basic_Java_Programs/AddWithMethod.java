package basic_Java_Programs;
public class AddWithMethod {
	int a,b,c;
	public void addTwoNum()
	{
		 a=30;
		 b=20;
		 c=a+b;
		System.out.println("This is addition :"+c);
	}
	public void subTwoNum()
	{
		 a=40;
		 b=20;
		 c=a-b;
		System.out.println("This is substract :"+c);
	}
	public void multiTwoNum()
	{
		 a=10;
		 b=20;
		 c=a*b;
		System.out.println("This is multiply :"+c);
	}
	public void divTwoNum()
	{
		 a=10;
		 b=20;
		 c=a/b;
		System.out.println("This is division :"+c);	
	}
	public static void main(String[] args) {
		AddWithMethod ob = new AddWithMethod();
		ob.addTwoNum();
		ob.subTwoNum();
		ob.multiTwoNum();
		ob.divTwoNum();
	}
}
