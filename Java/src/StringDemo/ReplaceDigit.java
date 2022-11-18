package StringDemo;

public class ReplaceDigit {
	public static void main(String[] args) {

		String str="abc1234def56gh77i";    //abcdef 		 
		//		String str2 = str.replace("1234", ""); 
		//		System.out.println(str2); 		 		
		String str2 = str.replaceAll("[0-9]", ""); 		
		System.out.println(str2);
		
	}
	

}
