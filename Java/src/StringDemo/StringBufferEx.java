package StringDemo;

public class StringBufferEx {

	
	public static void main(String[] args) { 
	StringBuffer sb = new StringBuffer("Java Program"); 		
	System.out.println("Before : "+sb); 		
	sb.reverse(); 		
	System.out.println("After Reverse: "+sb); 	
	
	sb.replace(0, 3, "Selenium");
	System.out.println("After : "+sb);
	
	System.out.println(sb.append('r'));
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	System.out.println(sb.substring(2, 10));
}
}

