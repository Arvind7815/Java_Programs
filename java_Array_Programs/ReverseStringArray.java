package java_Array_Programs;

import java.util.Scanner;

public class ReverseStringArray {
	
	public void reverseString (String word)
	{
		char [] ch=word.toCharArray();
		
		String  out = "";
		for(int i= ch.length-1; i>=0;i--)
		{
			out=out + ch[i];
		}
		
		System.out.println(out);
	}
	
	public static void main(String[] args) {
		
		ReverseStringArray ob = new ReverseStringArray();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter String Value ?");
		String name=sc.next();
		ob.reverseString(name);
		sc.close();	
	}
}
