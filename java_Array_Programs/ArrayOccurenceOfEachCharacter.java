package java_Array_Programs;
import java.util.Scanner;
public class ArrayOccurenceOfEachCharacter {
	public String findUnique(String inp)
	{
		char[] ch = inp.toCharArray(); //g,o,o,d,s
		String out = "";               //gods
		for(int i=0; i<ch.length; i++)
		{
			boolean flag = false;
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
				flag = true;
				}
			}
			if(flag==false)
			{
				out= out +ch[i];
			}
		}
		return out;
	}
	public void countCharacter(String inp)  //goods
	{
		char[] ch = inp.toCharArray(); //g,o,o,d,s
         String out = findUnique(inp);
		
		char[] ch1=out.toCharArray();  //g,o,d,s
		
		for(int i=0; i<ch1.length; i++)
		{
			int count = 0;
			for(int j=0; j<ch.length; j++)
			{
				if(ch1[i]==ch[j])
				{
					count = count+1;
				}
			}
			System.out.println(ch1[i] + " occurs "+ count);
		}
	}	
	public static void main(String[] args) {
		ArrayOccurenceOfEachCharacter ob = new ArrayOccurenceOfEachCharacter();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your input");
		String inp = sc.next();
		ob.countCharacter(inp);
		sc.close();
	}
}
 