package PROGRAM;

import java.util.Scanner;

public class BigOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1=sc.nextInt();
		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		int big=(n1>n2)?n1:n2;
		System.out.println("Biggest is: " +big);

	}

}
