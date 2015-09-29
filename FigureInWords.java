/*
Tabby & Eric
*/

import java.util.Scanner;

public class FigureInWords {
	
	// Numbers from 1 to 20, tens numbers and large numbers
	public static String[] one_to_twenty =  {"Zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	public static String[] tens =  {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	public static String[] large = {"","hundred","thousand","million","billion"};

	// Final words (sentence), hundreds words and tens-ones words
	public static String words = new String("");
	public static String hundred_words = "";
	public static String tens_ones_words = "";

	// Convert number to absolute if it's negative
	public static int absolute (int num) {
		int abs = 0;
		if (num < 0) {
			abs = num * -1;
		}
		else {
			abs = num;
		}
		return abs;
	}

	// Find words for a set of three digits
	public static String three_to_words (int three_digits) {
		hundred_words = "";
		tens_ones_words = "";
		int hundreds = three_digits / 100; // Store hundreds value without decimals after dividing by 100
		int tens_ones = (three_digits % 100); // Store tens and ones value from remainder of division by 100
		
		// Get hundreds word from arrays
		if(hundreds != 0) {
			if (tens_ones != 0) {
				hundred_words = one_to_twenty[hundreds] + " " + large[1] + " and ";
			}
			else {
				hundred_words = one_to_twenty[hundreds] + " " + large[1] + " ";
			}	
		}

		// Get tens-ones word from array for numbers less than 20
		if ((tens_ones != 0) && (tens_ones < 20)) {
			tens_ones_words += one_to_twenty[tens_ones] + " ";
			words += hundred_words + tens_ones_words;
		}

		// Get tens-ones word from array for 20 and numbers greater than 2
		else if ((tens_ones != 0) && (tens_ones >= 20)) {
			int ten = (three_digits - (hundreds * 100)) / 10;
			int one = tens_ones % 10;
			if (one > 0) {
				tens_ones_words = tens[ten] + "-" + one_to_twenty[one] + " ";
			}
			if (one == 0) {
				tens_ones_words = tens[ten] + " ";
			}
			words += hundred_words + tens_ones_words;
		}
		else if (tens_ones == 0) {
			words += hundred_words;
		}
		return words;
	}

	// Find words for input figure
	public static void figure_to_words (int figure) {
		int positive = figure;
		int[] groups_of_three = new int[4];
		int[] re_arranged = new int[4];
		String[] groups_of_three_text = new String[4];

		// Put 'zero' to word for 0
		if( figure == 0) {
			words = one_to_twenty[0];
		}

		// Add 'Negative' to word for negative numbers
		if (figure < 0) {
			words = "Negative ";
			positive = absolute(figure);
		}

		for (int i = 0; i < 4; i++) {
			groups_of_three[i] = positive % 1000; // Get 3 digits and store them in an index of an array
			positive /= 1000; // Divide by 1000 and store without decimals 
			re_arranged[3-i] = groups_of_three[i]; // Re-arrange array to bring most significant group to index 0	
		}

		for (int i = 0; i < 4; i++) {
			// Group of 3 must have a value greater than 0

			if (re_arranged[i] > 0) {
				// Skip 'hundred' since we already put it	
				if (i != 3) {
					if(figure % 100 > 0 && figure % 1000 < 100) {
						groups_of_three_text[i] = three_to_words(re_arranged[i]) + large[4-i] + " and "; 
					}
					else {
						groups_of_three_text[i] = three_to_words(re_arranged[i]) + large[4-i] + " "; // Add 'thousand', 'million' and 'billion' to each group
					}
					words = groups_of_three_text[i];
				}
				else {
					groups_of_three_text[i] = three_to_words(re_arranged[i]);
					words = groups_of_three_text[i];
				}
			}				
		}
		System.out.println(words.trim() + ".");
	}

	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int figure = 0;
		System.out.print("Enter a number to convert to words (or 'done' to quit): ");
		String input = in.nextLine();

		// Check whether input is done or a number and do appropriate function
		while (!(input.equals( "done" ))) {
			try {
				figure = Integer.parseInt(input);
				figure_to_words(figure);	
			}
			catch (NumberFormatException e) {
				System.out.println("You entered a wrong value");
			}	
			System.out.print("Enter a number to convert to words (or 'done' to quit): ");
			input = in.nextLine();
			words = "";
		}
		System.out.println("Thank you for using our service.");	
	}
}

