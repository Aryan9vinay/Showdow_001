package collection.ArrayList;
//Write a java program of ArrayList of Student object

import java.util.ArrayList;

public class Student {
	String name;
	int id;
	public Student(String name,int id)
	{   //super();
		this.name=name;
		this.id=id;
	}
	
	public String toString()
	{
		return name+"  "+id;
	}
	public static void main(String[] args) {
		ArrayList<Student> st = new ArrayList<Student>();
		st.add(new Student("Summit",102));
		st.add(new Student("vinay",101));
		
for(Student s:st)
{
	System.out.println(s);
	}
	}

}
