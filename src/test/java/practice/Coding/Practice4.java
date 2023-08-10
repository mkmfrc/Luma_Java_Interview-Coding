package practice.Coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class Practice4 {
	
	//Q: How to find the index from String?
	//@Test
	public void getIndex(){
		String value = "Bangladesh";
		
		System.out.println(value.charAt(4));
		
	}
	
	@Test
	public void getPalindrome3() {
		
		String value = "Mom";
		value= value.toLowerCase();
		String reversed = "";
		
		for(int i=value.length()-1; i>=0; i--) {
			reversed += value.charAt(i);
		}
		if(value.equals(reversed)) {
			System.out.println("Palindrome " + reversed);
			
		}else {
			System.out.println("Not Palindrome "+ reversed);
		}
	}
	
	// Question 1: how to find the even or odd number?
	
	@Test
	public void getEvenOdd() {
		
		int value = 10;
		
		for(int i= 0; i<=value; i++) {
			
			if(i%2 ==0) {
				System.out.println("Even : " + i );
			}else {
				System.out.println("Odd : " + i );
			}
		}
	}
	
	// Question 5: How to find the second highest number?
	// Sub Question: How to sort the value?
	// @Test
	public void getSecondHighestNum() {
	
		int [] num = { 100, 600, 850, 786, 911, 4444, 200, 311 };
		
				int size = num.length;
				Arrays.sort(num);
				System.out.println("Sorted Array : " + Arrays.toString(num));
				int secondHighest = num[size - 2];
				System.out.println("Second Highest Number : " + secondHighest);

	}
	
	
	
	// Question 8: How to remove duplicate value from ArrayList?
		// @Test
		public void getRemoveDuplicateValue() {

		List<Integer> removeDup = Arrays.asList(100, 420, 786, 911, 4444, 300, 420);

		}

}
