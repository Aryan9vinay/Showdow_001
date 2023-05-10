package collection.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;


 public class ItrPen {
	
	public	String Brand;
	public	String color;
		float price;

		public ItrPen(String Brand,String color,float price)
		{
			
		
		this.Brand=Brand;
		this.color=color;
		this.price=price;

		}
		public String toString()
		{
		return Brand+ " "+color+" "+price;
		}
		public static void main(String args[])
		{
		
		ArrayList<ItrPen> ip=new ArrayList<ItrPen>();
		 ip.add(new ItrPen("cello","blue",34));
		ip.add(new ItrPen("rotomac","black",43));
		ip.add(new ItrPen("addGel","red",134));

	ListIterator<ItrPen> itr=ip.listIterator();
		while(itr.hasNext())
		{
		ItrPen ob=itr.next();
		if(ob==new ItrPen("rotomac","black",43))
		{
		itr.remove();
		System.out.println("Series : "+ob);
		}
		else
		System.out.println("Series : "+ob);
		}
		while(itr.hasPrevious())
		{
			ItrPen pob = itr.previous();
			System.out.println(pob);
		}
		}
		

}
