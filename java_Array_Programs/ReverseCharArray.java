package java_Array_Programs;

import java.util.Scanner;

public class ReverseCharArray {
	public void reverseCharArray(String sentence) //Hello World
	{
		String [] str=sentence.split(" "); //Hello ,World
		String out="";
		for(int i=str.length-1;i>=0;i--)
		{
			char[] ch = str[i].toCharArray(); // H,e,l,l,o
			for(int j=ch.length-1;j>=0;j--)
			{
				out = out + ch[j];
			}
			{
				out = out + " ";
			}
			System.out.println(out);
		}
	}

	public static void main(String[] args) {
		ReverseCharArray ob = new ReverseCharArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Value ");
		String sentence=sc.nextLine();
		ob.reverseCharArray(sentence);
		sc.close();
		

	}

}
