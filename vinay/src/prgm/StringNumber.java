package prgm;

import java.util.Scanner;

public class StringNumber {

	
	 
	 public static void getString(String a)
	 {
		for(int i=0;i<a.length();i++) {
		System.out.println(a.charAt(i));
		
		
	 }
	 }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		getString(s);
	}

}
