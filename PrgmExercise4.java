
/**
 * Program: PrgmExercise4 
 * File: PrgmExercise4.java 
 * Summary: Program reads text from a file then converts it to Pig-Latin 
 * Author: Jason E. Borum 
 * Date: December 2, 2017
 **/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrgmExercise4 {

	public static void main(String[] args) throws FileNotFoundException {
		// Create a Scanner
		Scanner fileIn = new Scanner(new File("ReadFile.in"));

		// String userString = "It was a dark and stormy night";

		// System.out.println(firstChar);
		// System.out.println(secondChar);

		// Read File and Extract Values
		while (fileIn.hasNext()) {
			String userString = fileIn.next();
			String userStringUpper = userString.toUpperCase();
			char secondChar = 'x';
			int userStringLength = userString.length();
			char firstChar = userString.charAt(0);

			if (userStringLength > 1) {
				secondChar = userString.charAt(1);
			}

			if ((firstChar == 'a') || (firstChar == 'e') || (firstChar == 'i') || (firstChar == 'I')
					|| (firstChar == 'o') || (firstChar == 'u')) {
				System.out.println(userString + "\t" + userStringUpper + "AY");
			} else if ((secondChar == 'a') || (secondChar == 'e') || (secondChar == 'i') || (secondChar == 'I')
					|| (secondChar == 'o') || (secondChar == 'u')) {
				System.out.println(userString + "\t" + userStringUpper.substring(1) + userStringUpper.charAt(0) + "AY");
			} else {
				System.out.println(userString + "\t" + userStringUpper.substring(2) + userStringUpper.charAt(0)
						+ userStringUpper.charAt(1) + "AY");
			}
		}
	}
}