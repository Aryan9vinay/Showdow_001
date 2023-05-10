package collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


//Create a arraylist of object (heterogenous element) printing in reverse order

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<String> arl = new ArrayList<String>();
		arl.add("vikas");
		arl.add("sanju");
		arl.add("String");
		arl.add("BahaDur");
		int count = arl.size();
		for(int i=count-1;i>=0;i--)
		{
			Object sv = arl.get(i);
		//	System.out.println(sv);
		}
     Collections.sort(arl);
    // System.out.println("After the sorting");
     for(Object ob:arl)
     {
    	 System.out.println(ob);
     }
     Iterator<String> itr=arl.iterator();
     while(itr.hasNext())
     {
    	 String s=itr.next();
    	 if(s=="BahaDur")
    	 {
    		 itr.remove();
    		 System.out.println(s);
    	 }
    	 else
    		 System.out.println(s);
     }
     
	}

}
