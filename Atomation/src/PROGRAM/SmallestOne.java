package PROGRAM;  //write the java program to read three int values from the users and print smallest one

import java.util.Scanner;

public class SmallestOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int small=n1;
		if(n2<small)
			small=n2;
		if(n3<small)
			small=n3;
			System.out.println("Smallest one is :"+small);

	}

}
