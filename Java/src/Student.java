

	
	//Java Program to illustrate how to define a class and fields  
	//Defining a Student class.  

public class Student {  
	
	 //defining fields  
	 int id;//field or data member or instance variable  
	 
	 
	 String name;
	 //creating main method inside the Student class  
	 

		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}  
	 
	 
	 public static void main(String args[]){  
	  //Creating an object or instance  
	  Student s1=new Student();//creating an object of Student  
	  //Printing values of the object  
	  System.out.println(s1.id);//accessing member through reference variable  
	  System.out.println(s1.name);  
	  
	  
	  
	s1.setId(12);
	s1.setName("sam");
	System.out.println(s1.getId());
	System.out.println(s1.name);
	 }


	}  


