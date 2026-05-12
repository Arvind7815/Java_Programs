package java_Loops;

import java.util.Scanner;

public class PrintTable {
	public void printTable(int num) 
	{
		for(int i=1;i<=10;i++)
			System.out.println(num + " * " + i + " = " + 2*i);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintTable ob = new PrintTable();
		System.out.println("Enter your inter input :");
		int printnumber = sc.nextInt();
		ob.printTable(printnumber);
		
		sc.close();
	}
}
