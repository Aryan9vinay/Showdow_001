package collection.ArrayList;

import java.util.ArrayList;

//Create a arraylist of float elements print by using for each loop match the Element,again add element and print

public class ArrayListEx4 {

	public static void main(String[] args) {
		ArrayList<Float> flt = new ArrayList<Float>();
		flt.add(2.4f);
		flt.add(3.5f);
		flt.add(5f);
		System.out.println("Printing by using for each loop");
		for(Object f:flt)  //herer UPCasting but downCasting not possible
		{                    //here we also write as for(Float f:flt)
			System.out.println(f);
		}
System.out.println(flt.contains(3.5f));
System.out.println(flt.contains(1.5f));
flt.add(3,10.5f);
for(Float f:flt)
{
	System.out.println(f);}
	}

}
