package java_Array_Programs;

public class ArrayReversePrint {
	public void arrayReversePrint()
	{
		int [] array = {5,10,15,20,25,30,35,40};
		
		for(int i=7;i>=0;i--)
		{
		System.out.println(array[i] + " :  Reverse Array Print");	
		}
	}
	public static void main(String[] args) {
		ArrayReversePrint ob = new ArrayReversePrint();
		ob.arrayReversePrint();
		
	}
}
