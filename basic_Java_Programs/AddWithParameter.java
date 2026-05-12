package basic_Java_Programs;
public class AddWithParameter {
	int a,b,c;
	public void addTwoNum(int a,int b)
	{
		 c=a+b;
		System.out.println("This is addition : "+c);
	}
	
	public void subTwoNum(int a,int b)
	{
		 c=a-b;
		System.out.println("This is substract : "+c);
	}
	
	public void multiTwoNum(int a,int b)
	{
		 c=a+b;
		System.out.println("This is multiply : "+c);
	}
	
	public void divTwoNum(int a,int b)
	{
		 c=a/b;
		System.out.println("This is division : "+c);
	}
	
	public static void main(String[] args) {
		
		AddWithParameter ob = new AddWithParameter();
		ob.addTwoNum(10, 20);
		ob.subTwoNum(10, 20);
		ob.multiTwoNum(10, 20);
		ob.divTwoNum(10, 20);	
	}
}
