//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {
		String linesep = "----------------------------";
		
		// 1. Why would we use a StringBuilder instead of a String?
		// 		a. Instantiate a new StringBuilder
		//		b. Append the characters 0 through 9 to it separated by dashes
		// 				Note:  make sure no dash appears at the end of the StringBuilder
		System.out.println(linesep);
		System.out.println("Problem 1: Stringbuilder");
		
		StringBuilder nums = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			nums.append(Integer.toString(i)+"-");
		} 
		nums.deleteCharAt(nums.length()-1);
		
		System.out.println(nums);
		System.out.println(linesep);
		System.out.println("");
		
		// 2. List of String:
		//		a. Create a list of Strings 
		//		b. Add 5 Strings to it, each with a different length
		System.out.println(linesep);
		System.out.println("Problem 2: List of Strings");
		
		List<String> myStringList = new ArrayList<String>();
		
		myStringList.add("Is this real life");
		myStringList.add("Or is this just fantasy");
		myStringList.add("Caught in a landslide");
		myStringList.add("No escape from reality");
		myStringList.add("Hello World!");
		
		for (String phrase : myStringList) {
			System.out.println("phrase: " + phrase + ", length: " + phrase.length());
		}
		
		System.out.println(linesep);
		System.out.println("");
		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
		System.out.println(linesep);
		System.out.println("Problem 3: Return smallest string in list");
		System.out.println("The shortest string from the previous list is:");
		System.out.println(shortestStringInList(myStringList));
		System.out.println(linesep);
		System.out.println("");
		
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched

		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma

		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)

		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5

		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string


		
		// 9. Create a set of strings and add 5 values

		
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.


		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
	
		

		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set


		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word

	
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)

		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		

	}
	
	
	// Method 15:
	
	
	
	// Method 14:
	

	
	// Method 12:
	

	
	// Method 11:
	


	// Method 10:
	

	
	// Method 8:
	

	
	// Method 7:
	

	
	// Method 6:
	

	
	// Method 5:
	
	
	
	// Method 4:
	
	
	
	// Method 3:
	public static String shortestStringInList(List<String> listname) {
		// Method 1: sorting the list by length, then returning the first entry
		// Found from here: https://www.benchresources.net/java-8-how-to-sort-string-list-by-its-length/
//		Collections.sort(listname, Comparator.comparingInt(String::length));
//		return listname.getFirst();
		
		// Method 2: just iterate over the whole list and return the smallest length string
		int smallestLength = listname.getFirst().length();
		int smallestIndex = 0;
		
		for (int i = 1; i < listname.size(); i++) {
			if (listname.get(i).length() < smallestLength) {
				smallestIndex = i;
				smallestLength = listname.get(i).length();
			}
		}
		
		return listname.get(smallestIndex);
		
	}

}
