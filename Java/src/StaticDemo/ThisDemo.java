package StaticDemo;

public class ThisDemo {
	void function1(ThisDemo  obj)
	{
	System.out.println("Function 1 invoked");
	}
	void function2()
	{
	function1(this);
	}
	public static void main(String[] args)
	{
	ThisDemo obj = new ThisDemo();
	obj.function2();
	}
	}


