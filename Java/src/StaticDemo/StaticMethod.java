package StaticDemo;

public class StaticMethod {
	
	static int calculateCube(int side)
	{
	return (side*side*side);
	}
	public static void main(String[] args)
	{
	//System.out.println("Cube value of 5 is: "+calculateCube(5));
	System.out.println("Cube value of 5 is: "+StaticMethod.calculateCube(5));
	}
	}


