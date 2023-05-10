package PROGRAM;

import java.util.Scanner;

public class OddAndEvenByUsingConditionOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		String st=(n%2==0)?"Even":"Odd";
		System.out.println(n+ " is " +st);

	}

}
