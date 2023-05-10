package PROGRAM;

import java.util.Scanner;

//write the java program to read month no from user print how many days present in that month no
public class MonthNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month");
		int mon=sc.nextInt();
		if(mon==1||mon==3||mon==5||mon==7||mon==9||mon==11)
		{
			System.out.println("Month has 31 days");
		}
		else if(mon==4||mon==6||mon==8||mon==10||mon==12)
		{
			System.out.println("Month has 30 days");
		}
		else if(mon==2)
			
		{
			System.out.println("Month has 28 days");
		}
		else
			System.out.println("Enter invalid Months");
	}

}
