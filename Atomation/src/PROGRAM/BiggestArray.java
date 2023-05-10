package PROGRAM;

public class BiggestArray {

	public static int bigno(int no[])
	{
		int big=no[0];
		for(int j=0;j<no.length;j++)
		{
			if(no[j]>big)
				big=no[j];
						
		}
		return big;
	}
	public static void main(String[] args) {
		int []a= {23,45,444,54,};
		int bg=bigno(a);
		System.out.println("biggest"+bg);
		

	}

}
