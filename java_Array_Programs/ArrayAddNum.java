package java_Array_Programs;

public class ArrayAddNum {
	public void addNumArray()
	{
		int[]Numarray = new int [7]; // Declare Array
		
		Numarray [0]= 10;
		Numarray [1]= 10;
		Numarray [2]= 10;
		Numarray [3]= 10;
		Numarray [4]= 10;
		Numarray [5]= 10;
		int out = 0;
		for(int i=0;i<=6;i++)
		{
			out = Numarray[i] + out;
		}

		System.out.println(out + " : Add Array Total Value ");	
	}
	public static void main(String[] args) {
		ArrayAddNum ob = new ArrayAddNum();
		ob.addNumArray();
	
	}
}
