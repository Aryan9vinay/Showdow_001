package collection.ArrayList;
//Create a ArrayList of String element .Search the element in ArrayList. Print using for loop .Clear all elements from the List

import java.util.ArrayList;

public class ArrayListEx3 {

	public static void main(String[] args) {
	ArrayList<String> str = new ArrayList<String>();
	str.add("Ram");
	str.add("Sita");
	str.add("Laksman");
	str.add("108");
	System.out.println(str.contains("Ram"));
	System.out.println(str.contains("vinay"));
	int count=str.size();
	System.out.println(count);
	for(String s:str)
	{
		System.out.println(s);
	}
	//for(int i=0;i<count;i++) {
		//String s = str.get(i);
		//System.out.println(s);
	//}
	str.clear();
	System.out.println(str);
	}

}
