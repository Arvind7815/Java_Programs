package java_Array_Programs;
import java.util.Scanner;
public class ArrayReverseSpecific {
	public void arrayReverseSpecific (String sen,String word) { // Hello My Program
	
		String [] str  =sen.split(" "); // [Hello, My, Program]
		boolean flag =false;
		
		String out="";
		for(int i=0;i<str.length-1;i++)
		{
			if(str[i].equals(word))
			{
			flag=true;
			}
		}
		 if(flag==true)
		{
			for(int i=str.length-1;i>=0;i--)
			{
				out = out + str[i] + " ";
			}
		}
			else
	
			{
				char [] ch = word.toCharArray();//Java
				
				for(int i=ch.length-1;i>=0;i--)
				{
					out = out + ch[i];
				}
			}
		System.out.println(out.trim());
		}
	public static void main(String[] args) {
	
		ArrayReverseSpecific ob = new ArrayReverseSpecific();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Input  ");
		String sen=sc.nextLine();
		String word=sc.next();
		
		ob.arrayReverseSpecific(sen, word);
		sc.close();
	
	}
}
