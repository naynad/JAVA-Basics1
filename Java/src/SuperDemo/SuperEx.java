package SuperDemo;


	class Person
	{
	void message()
	{
	System.out.println("This is person class");
	}
	}
	
	
	/* Subclass Student */
	class Student extends Person
	{
	void message()
	{
	System.out.println("This is student class");
	}
	void display()
	{
	message();
	super.message();
	}
	}
	
	
	/* Driver program to test */
	public class SuperEx extends Student{
	{
	public static void main(String args[])
	{
	Student s = new Student();
	s.display();
	}
	}

}
