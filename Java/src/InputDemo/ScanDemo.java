package InputDemo;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
		// Creating object of Scanner class to
        // read input from keyboard
        Scanner scn = new Scanner(System.in);
 
        System.out.println("Enter an integer & a String");
 
        // Using nextInt() to parse integer values
        int a = scn.nextInt();
 
        // Using nextLine() to parse string values
        String b = scn.nextLine();
 
        // Display name and age entered above
        System.out.printf("You have entered:- " + a + " "
                          + "and name as " + b);
    }

	}


