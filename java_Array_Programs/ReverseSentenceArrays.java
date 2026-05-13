package java_Array_Programs;
import java.util.Scanner;
public class ReverseSentenceArrays {	 
		public void reverseSentence(String sen)  
		                                                  
		{
			String[] str=sen.split(" "); //"hi java" → ["hi", "java"]
			String out= "";
			for(int i=0; i<str.length; i++)
			{
			   if(i%2==0)
			   {
				   char[] ch= str[i].toCharArray(); // "java" → ['j','a','v','a']
				    
				    for(int j=ch.length-1; j>=0; j--)
				    {
				    	out = out + ch[j];
				    }
				     out = out + " ";
			   }
			   else
			   {
				   out = out + str[i] + " ";
			   }
			}
			System.out.println(out.trim());
		}
		public static void main(String[] args) {
			
			ReverseSentenceArrays ob = new ReverseSentenceArrays();
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter Your Sentence ");
			String sen = sc.nextLine();
			ob.reverseSentence(sen);
	}
}
/*
*Input :- Hello Java Programming 
*OutPut :- olleH Java gnimmargorP
*/







