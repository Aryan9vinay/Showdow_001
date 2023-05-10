package prgm;

import java.util.Scanner;

public class factorial {

	
		
		 static int getfact(int n)
		{
			int fact=1;
			for(int i=n;i>=2;i--)
			{
				fact=i*fact;
			}
				
			return fact;	

	}
public static void main(StringNumber args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no");
	int n=sc.nextInt();
	int fac=getfact(n);
	System.out.println("the fact is: "+fac);
}
}
