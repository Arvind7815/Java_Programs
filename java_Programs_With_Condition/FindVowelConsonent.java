package java_Programs_With_Condition;

import java.util.Scanner;

public class FindVowelConsonent {
	public void findVowelConsonent(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
		   ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			
		{
			System.out.println("It is a vowels : ");
		}
        else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
		{
			System.out.println("It is consonent : ");
		}
        else if(ch >= '0' && ch <= 9)
        {
        	System.out.println("It is digit");
        }
        else
        {
        	System.out.println("Is is digit");
        }
	}
	public static void main(String[] args) {
		FindVowelConsonent ob = new FindVowelConsonent();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your Character ");
		char ch = sc.next().charAt(0);
		ob.findVowelConsonent(ch);	
		sc.close();
	}
}

