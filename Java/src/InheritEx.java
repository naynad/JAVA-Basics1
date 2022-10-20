
class Parent
{
    
	void area(int x) {
  	System.out.println("area of the parent room is " +x);
  }
}




public class InheritEx extends Parent{
	int noOfRooms;

   
	void area(int x) {
		//super.area(200);
    	System.out.println("area of the child room is " +x);
    }
	
   
	public static void main(String[] args) {
		InheritEx  obj=new InheritEx();
		//Parent  obj=new Parent();

		obj.area(100);
	
		
		

	}

}
