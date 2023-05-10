package PROGRAM;

public class SmallestArray {

	public static int smallArray(int ary[])
	
	{
		int small=ary[0];
				for(int j=0;j<ary.length;j++) {
					
					if(ary[j]<small)
						small=ary[j];
				}
		return small;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []no= {34,45,32,};
int sm=smallArray(no);
System.out.println(sm);

	}

}
