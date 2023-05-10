package PROGRAM;

import java.util.Scanner;

public class PrintIntgerOrDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n>9||n<-9)
		{		System.out.println("n is a Number");
	}
		else {
			System.out.println("n is a Digit");
		}
	}

}
