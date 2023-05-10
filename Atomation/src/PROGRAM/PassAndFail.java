package PROGRAM;

import java.util.Scanner;

//write to read the four subject marks of student Print the result either pass or fail.
public class PassAndFail {

	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of hindi");
		int hindi=sc.nextInt();
		System.out.println("Enter the marks of Science");
		int Science=sc.nextInt();
		System.out.println("Enter the marks of Social Science");
		int Sst=sc.nextInt();
		System.out.println("Enter the marks of Maths");
		int maths=sc.nextInt();
		int pass=(hindi+Science+Sst+maths)/4;
		if(hindi<30||Science<30||Sst<30||maths<30||pass<40)
		{
			System.out.println("Student is fail");
		}
		else
		{
			System.out.println("Student is Pass");
		}
			
			
			

	}

}
