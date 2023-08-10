package practice.Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.testng.annotations.Test;

public class CodingExcerciseJune03Class {

	// Question 1: how to find the even or odd number?
	// 1. Variable Declaration, 2. Looping, 3. Apply the java condition 4. Break the loop
	// @Test
	public static void getEvenAndOdd() {

		int num = 50;
		for (int i = 0; i < num; i++) {
			if (i % 2 == 0) {
				// System.out.println("Even Number : " + i);
			} else {
				// System.out.println("Odd Number : " + i);
			}
		}
	}

	// Question 2: How to merge two arrays?
	// @Test
	public static void getMergeTwoArrays() {
		
		// 1. First I am the arrays separately as per requirement

		String [] value1 = { "F", "A", "H", "I", "M" };
		String [] value2 = { "C", "H", "O", "W", "D", "H", "U", "R", "Y" };
		String [] value3 = { "F", "A", "H", "I", "M" };

		// 2. I have to declare the ArrayList and pass the arguments of first Array variable
		// and take the control of array value in array list object

		ArrayList<String> list = new ArrayList<String>(Arrays.asList(value1));
		
		// 3. with the help of ArrayList object I have to call the addAll method and
		// pass the second array variable
		list.addAll(Arrays.asList(value2));
		list.addAll(Arrays.asList(value3));

		// 4. with the help of ArrayList object I call the toArray method to convert it into Array
		// and storing into ObjectClass which is the SuperClass in java and creating
		// another variable
		// with the help of new object value I get the desired result on console
		 
		Object[] mergeValue= list.toArray(); //Merging finally and storing into an object using Object class
		
		System.out.println(Arrays.toString(mergeValue));
	}

	// Question 3: How to reverse Array on number or String?
	// @Test
	public void getReverseArray() {

		// 1. Declare the array with the help of java Wrapper Class
		// because I have to use the Collections Utility Class
		Integer num[] = { 500, 420, 750, 1050 };
		System.out.println(" Original Array Value : " + Arrays.toString(num));

		// 2. By using Collections Utility Class we are calling reverse method
		// and within parenthesis using Arrays class I have to call asList
		// and pass the Array Variable within parenthesis

		Collections.reverse(Arrays.asList(num));
		System.out.println(" After Reverse Array Value : " + Arrays.toString(num));
	}

	// Question 4: How to reverse String without predefined method or functions?
	// @Test
	public void getRevStringWithoutPreDefMehtod() {

		// 1. I am declaring a String variable
		String name = "RAKIB";

		// To breakdown the characters separately I call the toCharArrays method
		// Then I stored this into a separate Char Array object
		char[] rev = name.toCharArray();

		// By decrement the loop I can get the desired value
		for (int i = rev.length - 1; i >= 0; i--) {
			System.out.println(rev[i]);
		}
	}

	// Question 5: How to find the second highest number?
			// Sub Question: How to sort the value?
	// @Test
	public void getSecondHighestNum() {

		// 1. I am declaring an Array
		int [] num = { 100, 600, 850, 786, 911, 4444, 200, 311 };

		// 2. With the help of Array Object I am calling the Length
		// And storing into a int variable
		int size = num.length;

		// 3. By calling sort method I can sort the values to make them in order
		Arrays.sort(num);
		System.out.println("Sorted Array : " + Arrays.toString(num));
		// Till now its covers the answer of How to sort the value?.

		// With the help of variable I pass the argument length of value
		int secondHighest = num[size - 2];
		System.out.println("Second Highest Number : " + secondHighest);

	}

	
	// Question 6: How to Split a Sentence or break the sentence?
	// @Test
	public void getSplitWord() {

		// 1. I have to declare the String Variable
		String name = "United State of America";

		// 2. Inside the loop we have call split method
		// and inside the parenthesis we have to pass the space based on requirements
		for (String newValue : name.split(" ")) {
			System.out.println(newValue);
		}
	}

	
	// Question 7: How to find the duplicate value from Array without any predefined method or functions?
	// @Test
	public void getFindDuplicateValue() {

		// 1. I am declaring an Array object which contains duplicate value
		int [] num = { 100, 420, 786, 911, 4444, 300, 420 };

		// 2. Using nested loop and using java condition I compare the value
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println("Duplicate Value : " + num[i]);
				}
			}
		}
	}

	// Question 8: How to remove duplicate value from ArrayList?
	// @Test
	public void getRemoveDuplicateValue() {

		List<Integer> removeDup = Arrays.asList(100, 420, 786, 911, 4444, 300, 420);

		List<Integer> newDup = removeDup.stream().distinct().collect(Collectors.toList());
		System.out.println("Duplicate Value is : " + newDup);
	}

	// Question 9: How to find the maximum and minimum value?
	// @Test
	public void getFindMaxAndMinValue() {

		List<Integer> value = Arrays.asList(100, 420, 786, 911, 4444, 300, 420);
		int maxValue = Collections.max(value);
		System.out.println(maxValue);

		int minValue = Collections.min(value);
		System.out.println(minValue);
	}

	// Question 10: How to sort the data from String?
			// Sub Question : How can you check existence of a value in Array?
 //@Test
	public void getSortedData() {
		
		List<String> list = Arrays.asList("Mahin", "Kaniz", "Rakib", "Emran", "Fatema", "Dolly");
		
		if (list.contains("Emran")) {
			// System.out.println("Emran is present");
		} else {
			// System.out.println("Fakibaz");
		}
		
		for (String sortedValue : list) {
			System.out.println("After data sorting : " + sortedValue);
		}
	}

	// Question 11: How to find vowels from String?
	//@Test
	public void getFindVowels() {

		String vowel = "hI I am ripon video. welcome to smarttech";
		for (int i = 0; i < vowel.length(); i++) {
			if (vowel.charAt(i) == 'a' || vowel.charAt(i) == 'e' || vowel.charAt(i) == 'i' || vowel.charAt(i) == 'o'
					|| vowel.charAt(i) == 'u') {
				//System.out.println(vowel.charAt(i));
				System.out.println(vowel.charAt(i)+" Index Number : " + i);
			}
		}

	}
	
	// Question 12: What is the Fibonacci number?
		
	// Question 13: How to find prime number?
	
	// Question 14 : How to find the Palingdrome ?
	
	@Test
	public void getPalindrome() {
		
		String pal = "123 4321";
		String input = pal.replaceAll("\\s+", "");
		
		String palindrome = "";
		
		int length = input.length();
		  
		for(int i =length-1; i>=0; i--) {
			
			palindrome += input.charAt(i);
		}
		if(input.equalsIgnoreCase(palindrome)) {
			System.out.println("a  : " + palindrome);
		}else {
			System.out.println("b  : " + palindrome);
		}
	}

	
	//@Test
	public void getPalindrom() {
		
		String str = "Dad"; // ----> First to declare the value
		String palindrum = "";// ----> Second to store the palindrum number
		
		int length = str.length(); // ----> Thirt to storing the length of string
		for (int i = length - 1; i >= 0; --i) { // ---> Created a loop for decrementing the value
			palindrum += str.charAt(i);// ----> Original String variable to call the
										// ChatAt Method to brwak down the string in to charecter
										// and Store in to the second variable
		}
		if (str.equalsIgnoreCase(palindrum)) { // -->Here I am Wrting the if condition
												// to find out the palindrum number
			System.out.println("It is a Palindrum Number : " + palindrum.toLowerCase());
			// If the if condition is Satisfied than it will print out the Palindrum Number.
		
		 } else {
			System.out.println("Is not a Palindrum Number : " + palindrum.toLowerCase());
			// If the If Condtion is not satisfied than it will print out Else condition.
		}
	}
	
	
	@Test
	public void getPalindrome2() {
		
					//1. First I am declaring a String variable with the value "Madam".
		String value = "Madam";
		
					//2. Declaring another String variable as empty 
						//where I will store the reverse value while doing the reverse loop
		String revString = "";
		
		
					//3. Using the for decrementing loop I am reversing the string from last to first characters
		for(int i= value.length()-1; i>=0; i--) {
			
			revString += value.charAt(i);
					//4. within the loop I am calling charAt() method to break the declared String into characters
						//and storing this reversed value into the revString variable 
		}
		
				//Now using if condition i am checking if original String value matches with reversed value, 
					//that means, checking whether the string is a palindrome or not

		if(value.equalsIgnoreCase(revString)) {
			System.out.println(" Palindrome " + revString.toLowerCase() );
			
			
		
		}else {
			System.out.println(" Not Palindrome "+ revString.toLowerCase());
		}			//If the condition matches if will execute otherwise, else will be executed.
	}	
	
	
	
}
	
	
	
	





