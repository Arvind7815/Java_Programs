package basic_Java_Programs;

public class AdditionWithParamererized {
		
			public void addTwoNum(int a, int b)
			{
				int c=a+b;
				System.out.println("Addition of two numbers : " + c);
			}
			
			public void subtwoNum(int a, int b)
			{
				int d = a-b;
				System.out.println(" substraction of two numbers : " + d);
			}
			
			public static void main(String[] args){
				AdditionWithParamererized ob = new AdditionWithParamererized();
				ob.addTwoNum(300, 200);
				ob.subtwoNum(100, 50);	
	}

}
