package collection.ArrayList;
//Create ArrayList of Integer Type and print in reverOrder and Sorting order
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInteger {

	public static void main(String[] args) {
		ArrayList<Integer> arl = new ArrayList<Integer>();
		arl.add(1);
		arl.add(2);
		arl.add(43);
		arl.add(34);
		int count = arl.size();
		for(int i=count-1;i>=0;i--)
		{
			Object sv = arl.get(i);
			System.out.println(sv);
		}
     Collections.sort(arl);
     System.out.println("After the sorting");
     for(Object ob:arl)
     {
    	 System.out.println(ob);
     }

	}

}
