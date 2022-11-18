
public class App {
	int user;
	int functions;
	String name;
	
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public int getFunctions() {
		return functions;
	}
	private void setFunctions(int functions) {
		this.functions = functions;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void open_app()
	{
		System.out.println("App is opened");
	}
   void close_app()
   {
		System.out.println("App is closed");

   }
   
   class test{
	   
   }
	public static void main(String[] args) {

  App ap=new App();
  ap.open_app();
  ap.close_app();
  ap.setFunctions(3);
  ap.setName("whatsapp");
  ap.setUser(10);
  System.out.println(ap.getFunctions());
  System.out.println(ap.name);
  System.out.println(ap.user);
  
		
	}

}
