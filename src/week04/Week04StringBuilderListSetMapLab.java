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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		
		myStringList.add("Is this the real life?");
		myStringList.add("Or is this just fantasy?");
		myStringList.add("Caught in a landslide");
		myStringList.add("No escape from reality.");
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
		System.out.println(linesep);
		System.out.println("Problem 4: Swap first and Last entries in a List of Strings");
		
		// Create a copy of the original list, that will eventually have the 1st & last entries swapped
//		List<String> mySwappedList = new ArrayList<>(myStringList);
		
		// Swap 1st & last entries
		List<String> mySwappedList = swapListStartAndEnd(myStringList);
		
		for (String phrase : mySwappedList) {
			System.out.println(phrase);
		}
		System.out.println(linesep);
		System.out.println("");
		
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
		System.out.println(linesep);
		System.out.println("Problem 5: Concatenate a list of strings into one comma separated string");
		
		String concatenatedStringList = concatStringList(myStringList);
		
		System.out.println(concatenatedStringList);
		System.out.println(linesep);
		System.out.println("");
		
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		System.out.println(linesep);
		System.out.println("Problem 6: Find all Strings in list that contain a matching string");
		
		String phraseToMatch = "this";
		System.out.println("Phrase to match: " + phraseToMatch);
		
		List<String> matchingStringList = returnMatchingPhrases(myStringList, phraseToMatch);
		
		for (String phrase : matchingStringList) {
			System.out.println(phrase);
		}
		
		System.out.println(linesep);
		System.out.println("");
		
		
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		System.out.println(linesep);
		System.out.println("Problem 7: List of List of Integers");
		
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(2);
		intList.add(3);
		intList.add(5);
		intList.add(10);
		intList.add(13);
		intList.add(15);
		intList.add(20);
		intList.add(37);
		
		System.out.println("Input Integer List: " + intList);
		
		List<List<Integer>> weirdIntList = intListManipulator(intList);
		
		System.out.println("Output List of List of Integers: " + weirdIntList);
		System.out.println("Divisible by 2 (1st List): " + weirdIntList.get(0));
		System.out.println("Divisible by 3 (2nd List): " + weirdIntList.get(1));
		System.out.println("Divisible by 5 (3rd List): " + weirdIntList.get(2));
		System.out.println("Not Divisible by 2, 3, or 5 (4th List): " + weirdIntList.get(3));
		
		System.out.println(linesep);
		System.out.println("");
		
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		System.out.println(linesep);
		System.out.println("Problem 8: Given a list of strings, output a list of integers containing the length of each string");
		
		List<Integer> lenOfStrInList = lengthOfStringsInList(myStringList);
		
		System.out.println("Length of strings in list from problem 2: " + lenOfStrInList);
		
		System.out.println(linesep);
		System.out.println("");
		
		// 9. Create a set of strings and add 5 values
		System.out.println(linesep);
		System.out.println("Problem 9: Create a set of strings and add 5 values");
		Set<String> names = new HashSet<String>();
		names.add("Ian");
		names.add("Gabi");
		names.add("Jameson");
		names.add("Julie");
		names.add("Brianna");
		
		System.out.println("Set of names: " + names);
		System.out.println(linesep);
		System.out.println("");
		
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		System.out.println(linesep);
		System.out.println("Problem 10: Take a set of strings, and return a set of strings that start with a specified character");
		
		char CharToMatch = 'J';
		Set<String> matchingSet = returnStringSetWithMatchingFirstChar(names,CharToMatch);
		
		System.out.println("Names in the set that start with " +  CharToMatch + ": " + matchingSet);
		System.out.println(linesep);
		System.out.println("");
		
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
		System.out.println(linesep);
		System.out.println("Problem 11: Take a set of strings and return a list of the same strings");
		List<String> nameList = returnStringListFromStringSet(names);
		
		System.out.println("Input set: " + names);
		System.out.println("Output list: " + nameList);
		System.out.println(linesep);
		System.out.println("");
		
		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
		System.out.println(linesep);
		System.out.println("Problem 12: Take a set of ints and return a set of with only even ints from the original set");
		Set<Integer> intSet = new HashSet<Integer>();
		
		intSet.add(3);
		intSet.add(2);
		intSet.add(120);
		intSet.add(45);
		intSet.add(53);
		intSet.add(42);
		
		System.out.println("Original integer set: " + intSet);
		
		Set<Integer> evenSet = returnSetOfEvenIntegers(intSet);

		System.out.println("Even integer set: " + evenSet);
		System.out.println(linesep);
		System.out.println("");
		
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
		System.out.println(linesep);
		System.out.println("Problem 13: Create a map with 3 entries, the keys being words and the values being definitions");
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Procrastination", "The act of postponing, delaying or putting off, especially out of habitual carelessness or laziness.");
		dictionary.put("Effort", "The use of physical or mental energy to do something; exertion");
		dictionary.put("Success", "The achievement of something desired, planned, or attempted.");
		
		System.out.println("Map of words & definitions:");
		for (String def : dictionary.keySet()) {
			System.out.println(def + ": " + dictionary.get(def));
		}
		System.out.println(linesep);
		System.out.println("");
		
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
		System.out.println(linesep);
		System.out.println("Problem 14: Write method that returns value for a key in a map, given a key string");
		
		String wordToDefine = "Effort";
		System.out.println("Word to define: " + wordToDefine);
		String definition = getValueFromStringMap(dictionary,wordToDefine);
		System.out.println("Definition: " + definition);
		
		System.out.println(linesep);
		System.out.println("");
		
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		System.out.println(linesep);
		System.out.println("Problem 15: Given a list of Strings, return a Map containing a count of all the strings that start with a given character");
		Map<Character, Integer> weirdMap = countStartingCharacters(myStringList);
		
		System.out.println("The input list of strings is from problem 2.");
		
		System.out.println("Output map: " + weirdMap);
		System.out.println(linesep);
		System.out.println("");

	}
	
	
	// Method 15:
	public static Map<Character, Integer> countStartingCharacters(List<String> stringList) {
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for (String str : stringList) {
			if (charMap.containsKey(str.charAt(0))) {
				charMap.replace(str.charAt(0), charMap.get(str.charAt(0))+1);
			} else {
				charMap.put(str.charAt(0), 1);
			}
		}
		
		return charMap;
		
	}
	
	
	// Method 14:
	public static String getValueFromStringMap(Map<String,String> stringMap, String key) {
		
		return stringMap.get(key);
	}

	
	// Method 12:
	public static Set<Integer> returnSetOfEvenIntegers(Set<Integer> intSet) {
		
		Set<Integer> evenInts = new HashSet<Integer>();
		
		for (int num : intSet) {
			if (num % 2 == 0) {
				evenInts.add(num);
			}
		}
		return evenInts;
	}

	
	// Method 11:
	public static List<String> returnStringListFromStringSet(Set<String> stringSet) {
		
		List<String> strList = new ArrayList<String>();
		
		for (String str : stringSet) {
			strList.add(str);
		}
		return strList;
	}


	// Method 10:
	public static Set<String> returnStringSetWithMatchingFirstChar(Set<String> strings, char firstLetter) {
		
		Set<String> matchingSet = new HashSet<String>();
		
		for (String str : strings) {
			if (str.charAt(0) == firstLetter) {
				matchingSet.add(str);
			}
		}
		
		return matchingSet;
		
	}

	
	// Method 8:
	public static List<Integer> lengthOfStringsInList(List<String> stringList) {
		
		List<Integer> lenOfStrInList = new ArrayList<Integer>();
		
		for (String str : stringList) {
			lenOfStrInList.add(str.length());
		}
		
		return lenOfStrInList;
	}

	
	// Method 7:
	public static List<List<Integer>> intListManipulator(List<Integer> intList) {
		
		List<List<Integer>> weirdIntList = new ArrayList<>();
		
		List<Integer> divisBy2 = new ArrayList<Integer>();
		List<Integer> divisBy3 = new ArrayList<Integer>();
		List<Integer> divisBy5 = new ArrayList<Integer>();
		List<Integer> notDivisBy235 = new ArrayList<Integer>();
		
		
		for (int num : intList) {
			if (num % 2 == 0) {
				divisBy2.add(num);
			} 
			if (num % 3 == 0) {
				divisBy3.add(num);
			} 
			if (num % 5 == 0) {
				divisBy5.add(num);
			}
			if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
				notDivisBy235.add(num);
			}
		}
		
		weirdIntList.add(divisBy2);
		weirdIntList.add(divisBy3);
		weirdIntList.add(divisBy5);
		weirdIntList.add(notDivisBy235);
		
		return weirdIntList;
	}

	
	// Method 6:
	public static List<String> returnMatchingPhrases(List<String> stringList, String phraseToMatch) {
		
		List<String> newList = new ArrayList<String>();
		
		for (String phrase : stringList) {
			
			if (phrase.contains(phraseToMatch)) {
				newList.add(phrase);
			}
		}
		
		return newList;
	
	}

	
	// Method 5:
	public static String concatStringList(List<String> stringList) {
		
		StringBuilder concatenatedStringList = new StringBuilder();
		
		for (String phrase : stringList) {
			concatenatedStringList.append(phrase + ",");
		}
		
		// Remove final comma
		concatenatedStringList.deleteCharAt(concatenatedStringList.length()-1);
		
		return concatenatedStringList.toString();
	}
	
	// Method 4:
	public static List<String> swapListStartAndEnd(List<String> stringList) {
		
		List<String> newList = new ArrayList<String>(stringList);
		
		String tempFirst = stringList.getFirst();
		
		newList.set(0, newList.getLast());
		newList.set(newList.size()-1, tempFirst);
		return newList;
	}
	
	
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
