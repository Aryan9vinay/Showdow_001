package collection.ArrayList;

import java.util.Scanner;

public class PostiveNo {

	public static void main(String[] args) {

try (Scanner sc = new Scanner(System.in)) {
	System.out.println("Enter the no");
	int n=sc.nextInt();
	if(n>0) {
	System.out.println("the no is: "+n);
	
		}
	else if(n<0) {
		n=n*-1;
		System.out.println("the no is: "+n);}
}
}

}
