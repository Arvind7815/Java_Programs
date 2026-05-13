package java_Array_Programs;

import java.util.Scanner;

public class ReverseSentenceArray {
	
	public void reverseSentenceArray(String sentence)
	{
		String[] str = sentence.split(" ");
		{
			String out = "";
			for(int i = str.length-1;i>=0;i--)
			{
			out = out+str[i]+" ";
			}
			System.out.println(out.trim());
		}
	}
	public static void main(String[] args) {
		
		ReverseSentenceArray ob = new ReverseSentenceArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Sentence : ?");
		String sentence=sc.nextLine();
		ob.reverseSentenceArray(sentence);
		sc.close();
	}
}