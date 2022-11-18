
public class restaurant {
	
	int noOftables;
	String Menu;
	int noOfstaff;
	
	void orderfood()
	{
		System.out.println("The food is ordered");
	}
	
	void cookfood()
	{
		System.out.println("The food is ready");
	}

	public static void main(String[] args) {
		restaurant res=new restaurant();
		res.orderfood();
		res.cookfood();
		System.out.println(res.Menu);
		
	}

}
