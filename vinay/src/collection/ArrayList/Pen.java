package collection.ArrayList;
//Create an arrayList add pen object print in bidirectional ways

import java.util.ArrayList;
import java.util.ListIterator;

public class Pen {

	String Brand;
	String color;
	float price;
	public Pen(String Brand,String color,float price)
	{super();
		this.Brand=Brand;
		this.color=color;
		this.price=price;
		}
	public String toString()
	{
		return Brand+" "+color+"  Rs:"+price;
	}
	public static void main(String[] args)
	{
	ArrayList<Pen> pn = new ArrayList<Pen>();
	pn.add(new Pen("cello","black",12f));
	pn.add(new Pen("Renolds","blue",15f));
	pn.add(new Pen("AddGel","blue",35f));
	ListIterator<Pen> itr = pn.listIterator();
	while(itr.hasNext())
	{
	System.out.println(itr.next());
	}
	while(itr.hasPrevious())
	{
		System.out.println(itr.previous());
	}
	
	

	  
		}

}
