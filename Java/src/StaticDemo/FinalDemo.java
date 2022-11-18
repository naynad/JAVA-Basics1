package StaticDemo;

public class FinalDemo {

	{
	//final int const = 5; // 1-way
	//static final int a;
	final int constant; // 2-way
	/*
	S()
	{
	const = 5;
	}
	*/
	// 3rd way
	{
	System.out.println("Here i am");
	constant = 5;
	}
	
  
	public static void main(String[] args)
	{
		FinalDemo obj = new FinalDemo();
	}
	}

}
