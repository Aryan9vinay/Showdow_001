package PROGRAM;

import java.util.Scanner;

public class BiggestNumber {

	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Three Numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int big=n1;
		if(n2>big)
		{
			big=n2;
		}
		 if(n3>big)
			{
			big=n3;
			}
		System.out.println(big);
		
		
		
	}
}
