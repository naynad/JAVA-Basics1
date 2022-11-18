package StringDemo;

public class StringDemo {
	
	
	public static void main(String[] args) {
	String str=new String("Java Program");	
		
//	String str="Java Program"; 		
	
	String str2 ="java program"; 
	
	char ch = str.charAt(9); 
	System.out.println(ch); 
	
	boolean isEquals = str.equalsIgnoreCase(str2); 	
	
	System.out.println(isEquals); 	
	
	boolean isEqual = str.equals(str2); 	
	System.out.println(isEqual); 
	
	int index = str.indexOf('a'); 		
	System.out.println(index); 	
	
	int index2 = str.indexOf('a', 5); 		
	System.out.println(index2); 
	
	int length = str.length(); 		
	System.out.println(length); 
	
	String str3 = str.concat(str2); 		
	System.out.println(str3); 
	
	String str4 = str.replace("Java", "Selenium"); 		
	System.out.println(str4); 	
	
	String str5 = str.substring(3); 		
	System.out.println(str5); 
	
	String str6 = str.substring(2, 6);
	System.out.println(str6);
	
	System.out.println(str);
	String str7 = str.trim();	
	System.out.println(str7);	
	
	String[] strArr = str.split(" ");
	
	for(int i=0; i<strArr.length; i++) {
		System.out.println(strArr[i]);
	}

//char[] chArr = str.toCharArray();
//	
//	for(int i=0; i<chArr.length; i++) {
//		System.out.println(chArr[i]);
//	}
}
}

