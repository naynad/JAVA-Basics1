
public class House {
	int noOfRooms;
    String name;
    
	
       int getNoOfRooms() {
			return noOfRooms;
		}

		public void setNoOfRooms(int noOfRooms) {
			this.noOfRooms = noOfRooms;
		}

		private String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

       
	void area() {
    	System.out.println("area of the room is 100sqm");
    }
    
    void cookfood()
    {
    	System.out.println("This is Kitchen");
    }

	public static void main(String[] args) {
		House obj=new House();
		obj.area();
		obj.cookfood();
		
		obj.setNoOfRooms(5);
		System.out.println(obj.getNoOfRooms());
		
		
		obj.setName("Hall");
		System.out.println(obj.getName());
		
		

	}

}
