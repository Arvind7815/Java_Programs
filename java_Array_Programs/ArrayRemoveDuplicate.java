package java_Array_Programs;

import java.util.Scanner;

public class ArrayRemoveDuplicate {
	public void arrayRemoveDuplicate(String word) //Hello
	{
		char [] ch = word.toCharArray(); //H,e,l,l,o
		String out = "";                 // Helo --- Unique Value 
		for(int i=0;i<ch.length;i++)
		{
		    boolean flag = false;
			for(int j=i+1;j<ch.length;j++)
		{
			if(ch[i]==ch[j])
			{
				flag = true;
			}
		}
			if(flag==false)
			{
				out = out + ch[i];
			}
		}
		System.out.println(out);
	}
	
	public static void main(String[] args) {
		ArrayRemoveDuplicate ob = new ArrayRemoveDuplicate();
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Please Enter Your Input ");
		String word = sc.next();
		ob.arrayRemoveDuplicate(word);
		sc.close();
	}
}
