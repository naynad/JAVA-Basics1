package StaticDemo;

public class ThisDemo1 {
  
	void show() {
	   System.out.println(this);
   }
	public static void main(String[] args) {
   
		
		ThisDemo1 r=new ThisDemo1();
				System.out.println(r);
		r.show();

	}

}
