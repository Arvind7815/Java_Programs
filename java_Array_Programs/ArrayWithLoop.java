package java_Array_Programs;

public class ArrayWithLoop {
	
	public void arrayWithLoop()
	{
		int [] array = {10,20,30,40,50,60};
		
		for(int i=array.length-1;i>=0;i--)
		
	    {
		System.out.println(array[i]);	
		}
	}
	public static void main(String[] args) {
		ArrayWithLoop ob = new ArrayWithLoop();
		ob.arrayWithLoop();
	}
}
