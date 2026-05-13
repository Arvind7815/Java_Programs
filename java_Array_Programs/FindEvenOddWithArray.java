package java_Array_Programs;

import java.util.Scanner;

public class FindEvenOddWithArray {
	
	public void findEvenOdd(int[]arrayNum)
	
	{
		for(int i=0;i<arrayNum.length;i++)
		{
			int reminder=arrayNum[i]%2;
		
			if(reminder==0)
			{
				System.out.println("It is even number : "+ arrayNum[i]);
			}
			else
			{
				System.out.println("It is odd number : "+ arrayNum[i]);
			}
		}
	}	
	public static void main(String[] args) {
	
		FindEvenOddWithArray ob = new FindEvenOddWithArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Value: ");
		int[] arrayNum = new int [5];
		{
		for(int i=0;i<5;i++)
		 arrayNum[i]=sc.nextInt();
		ob.findEvenOdd(arrayNum);
		sc.close();

	}
  }
}
