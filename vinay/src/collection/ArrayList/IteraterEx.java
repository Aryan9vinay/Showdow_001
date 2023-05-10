package collection.ArrayList;
//Create ArrayList of object elements Print the element by using Iterater

import java.util.ArrayList;
import java.util.Iterator;

public class IteraterEx {

	public static void main(String[] args) {
ArrayList<Object> ob = new ArrayList<Object>();
ob.add("Shayam");
ob.add("Radha");
ob.add("s");
ob.add(108);
Iterator<Object> itr = ob.iterator();
while(itr.hasNext())
{
//System.out.println(itr.next());	
Object n = itr.next();

if(n=="s")
{
	itr.remove();
	}
else
	System.out.println(n);
}

	}

}
