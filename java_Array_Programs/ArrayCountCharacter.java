package java_Array_Programs;

import java.util.Scanner;

public class ArrayCountCharacter {
	public void arrayCountCharacter(String word, char ch) //Hello
	{
		char [] charArray = word.toCharArray(); // H,e,l,l,o
		int count = 0;
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i]==ch)
			{
				count++;
				//count = count+1;
			}
		}
		System.out.println(ch + " Occurs " + count );
	}
	public static void main(String[] args) {
		ArrayCountCharacter ob = new  ArrayCountCharacter();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your Input ");
		String word = sc.next();
		char ch = sc.next().charAt(0);
		ob.arrayCountCharacter(word, ch);
		
		sc.close();
	}
}