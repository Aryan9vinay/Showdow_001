package prgm;

import java.util.Scanner;

public class NumberDigit {

	public static void main(StringNumber[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Enter the no");
		int n=sc.nextInt();
		n=n/10;
	if(n>=1) 
		//if(n<-9 )
		{
System.out.println("the no is not digit");
		}
		// else if(n>9) {
		//	System.out.println("the no is not digit");
	//	}
 else {
		System.out.println("the no is digit");
		}
	}
}
}