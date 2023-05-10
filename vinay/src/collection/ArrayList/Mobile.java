package collection.ArrayList;

import java.util.ArrayList;

//Create ArrayList of String Brand, float price and string color

public class Mobile {

	String Brand;
	float price;
	String color;
	
	public Mobile(String Brand,float price,String color)
	{    this(Brand,color);
	
		this.price=price;
		
	}
	
	public Mobile(String Brand,String color)
	{
		this.Brand=Brand;
		this.color=color;
	}
	public String toString()
	{
		return Brand+"  Rs:"+price+"  "+color;}
	
	public static void main(String[] args) {
	
		ArrayList<Mobile> mb = new ArrayList<Mobile>();
		mb.add(new Mobile("Samsung",12000,"Black"));
		mb.add(new Mobile("Apple",59000,"Red"));
		mb.add(new Mobile("MicroMax",10000,"Black"));
		for(Mobile m:mb)
		{
			System.out.println(m);
		}
		mb.clear();
		System.out.println(mb);

	}

}
