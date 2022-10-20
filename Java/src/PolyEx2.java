
public class PolyEx2 {
	int noOfRooms;

         
	void area(int x) {
    	System.out.println("area of the room is " +x);
    }
    
	void area(float x) {
    	System.out.println("area of the room is "+x);
    }
	
	void area(double x) {
    	System.out.println("area of the room is " +x);
    }
	
   

	public static void main(String[] args) {
		PolyEx2 obj=new PolyEx2();
		obj.area(100);
		obj.area(100.77d);
		obj.area(3338f);
		

	}

}
