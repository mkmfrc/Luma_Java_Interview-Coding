package javacoding.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class Practice2 {
	// Question 1: how to find the even or odd number?
	// Question 2: How to merge two arrays?

	// @Test
	public void getOddEven() {

		int number = 10;

		for (int i = 0; i <= number; i++) {
			if (i % 2 == 0) {
				System.out.println("Even : " + i);
			}
		}

	}
	// Question 2: How to merge two arrays?

	//@Test
	public void getMergeArray() {
		
		//First I am declaring my Array variables
		Integer[] value1 = { 100, 200, 300 };
		Integer[] value2 = { 500, 600, 700 };

		//
		List<Integer> mergeVal = new ArrayList<>(Arrays.asList(value1));

		mergeVal.addAll(Arrays.asList(value2));
		Object[] finalObj = mergeVal.toArray();

		System.out.println(Arrays.toString(finalObj));

	}

	// Question 3: How to reverse Number?

	// @Test
	public void getRevNum() {

		Integer[] value = { 100, 200, 300 };
		Collections.reverse(Arrays.asList(value));

		System.out.println(Arrays.toString(value));

	}

	// Question 4: How to reverse String without predefined method or functions?

	// @Test
	public void getRevString() {

		String name = "Imran";

		char[] pagla = name.toCharArray();

		for (int i = pagla.length - 1; i >= 0; i--) {
			System.out.print(pagla[i]);
		}

	}

	// Question 5: How to find the second highest number?
	// Sub Question: How to sort the value?
	// @Test
	public void get2ndHighest() {

		int[] data = { 100, 500, 400, 150, 600 };

		int size = data.length;

		Arrays.sort(data);

		int SecHigh = data[size - 2];

		System.out.println(SecHigh);
	}

	// Question 6: How to Split a Sentence or break the sentence?
	// @Test
	public void getSplitWord() {

		String value = "What did you do?";

		for (String after : value.split(" ")) {
			System.out.println(after);
		}

	}

	// Question 7: How to find the duplicate value from Array without any predefined
	// method or functions?
	// @Test
	public void getFindDuplicateValue() {

		int[] dup = { 100, 200, 300, 200 };

		for (int i = 0; i < dup.length; i++) {
			for (int j = i + 1; j < dup.length; j++) {
				if (dup[i] == dup[j]) {
					System.out.println(dup[j]);
				}
			}
		}

	}

	// Question 8: How to remove duplicate value from ArrayList?
	// @Test
	public void getRemoveDuplicateValue() {

		List<Integer> myList = Arrays.asList(100, 200, 100, 300);

		List<Integer> finalList = myList.stream().distinct().collect(Collectors.toList());

		System.out.println(finalList);
	}

	// @Test
	public void getRemoveDuplicateValueString() {

		List<String> myList = Arrays.asList("AA", "BB", "AA");

		List<String> newObj = myList.stream().distinct().collect(Collectors.toList());
		System.out.println(newObj);

	}

	// Question 9: How to find the maximum and minimum value?
	//@Test
	public void getFindMaxAndMinValue() {

		List<Integer> data = Arrays.asList(100, 200, 300);

		int max = Collections.max(data);
		System.out.println(max);
		
		int min = Collections.min(data);
		System.out.println(min);
	}
	// Question 10: How to sort the data from String?
				// Sub Question : How can you check existence of a value in Array?
	 //@Test
		public void getSortedData() {
			
			List<String> obj = Arrays.asList("Aa","Cb", "Ba");
			
			//Sub Question
			if (obj.contains("Ba")) {
				System.out.println("Yes" );
				
			}else {
				System.out.println("No");
			}
			
			//Sorting
			Collections.sort(obj);
			System.out.println(obj);
			
			
		}
	// Question 11: How to find vowels from String?
	//	@Test
		public void getFindVowels() {
			String vowel = "what are you doing here in this group study!";
			
			for (int i=0; i<vowel.length(); i++) {
				if(vowel.charAt(i)== 'a'||vowel.charAt(i)== 'e'||vowel.charAt(i)== 'i'||vowel.charAt(i)== 'o'||vowel.charAt(i)== 'u' ) {
					System.out.println(vowel.charAt(i) + " index : " + i);
				}
			}
			
		}
		@Test
		public void getPalindrome() {
			
							//1. First I am declaring a String variable with the value "Madam".
			String string = "Madam";
			
							//2. Declaring another String variable as empty 
							//where I will store the reverse value while doing the reverse loop
			String revString = "";
			
			
							//3. Using the for decrementing loop I am reversing the string from last to first characters
			for(int i= string.length()-1; i>=0; i--) {
				
							//4. within the loop I am calling charAt() method to break the declared string into characters
							//and storing this reversed value into the revString variable 
			revString += string.charAt(i);
				
			}
			
						//Now using if condition i am checking if original string value matches with reversed value, 
						//that means, checking whether the string is a palindrome or not

			if(string.equalsIgnoreCase(revString)) {
				System.out.println(" Palindrome " + revString.toLowerCase() );
				
			
			}else {
				System.out.println(" Not Palindrome ");
			}
						//If the condition matches if will execute otherwise, else will be executed.
			
		}	
}
