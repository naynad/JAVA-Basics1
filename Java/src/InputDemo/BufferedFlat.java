package InputDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedFlat {

	public static void main(String args[])throws IOException
	    {
	 
	        // Creating object of class inside main() method
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	        System.out.println("Enter a Flat Number");
	 
	        // Taking integer input
	        int a = Integer.parseInt(br.readLine());
	 
	        System.out.println("Enter Owner's Name");
	 
	        String b = br.readLine();
	 
	        // Printing input entities above
	        System.out.printf("You have entered:- " + a + " and name as " + b);
	    }

	}


