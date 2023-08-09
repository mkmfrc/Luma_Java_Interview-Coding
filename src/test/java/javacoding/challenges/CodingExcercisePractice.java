package javacoding.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class CodingExcercisePractice {

	//@Test
	public void mergeArrays() {

		Integer num1[] = { 100, 200, 300, 400 };
		Integer num2[] = { 500, 800, 700, 900 };

		List<Integer> listObj = new ArrayList<Integer>(Arrays.asList(num1));
		listObj.addAll(Arrays.asList(num2));
		
		Object[] newObj = listObj.toArray();
		System.out.println(Arrays.toString(newObj));
	}
	
	
	//not required till now 
	//@Test
	public void merge2ndProcess() {

		int num1[] = { 100, 200, 300, 400 };
		int num2[] = { 500, 800, 700, 900 };
	
		int result []= new int[num1.length+num2.length];
		
		System.arraycopy(num1, 0, result, 0, num1.length);
		System.arraycopy(num2, 0, result, num1.length, num2.length);
		
		
		System.out.println(Arrays.toString(result));
	}
	
	//Excersise 3:
	//@Test
	public void getRev() {
		
		Integer marks[]= {100, 200, 300};
		System.out.println("Initial status : " + Arrays.toString(marks));
		
		Collections.reverse(Arrays.asList(marks));
		System.out.println("Reverse status : " + Arrays.toString(marks));
	}
	
	
	
	
	// Question 4: How to reverse String without predefined method or functions?
		//@Test
		public void getRevStringWithoutPreDefMehtod() {

			String name = "RAKIB";			
			char[] rev = name.toCharArray();
			System.out.println(rev.length);
			
	//	for (int i = rev.length - 1; i >= 0; i--) {
				//System.out.print(rev[i]);
			
			//	System.out.println(name.length());
			//}
		
		
		
		}
		
		
		// Question 7: How to find the duplicate value from Array without any predefined method or functions?
		// @Test
		public void FindDuplicates() {
			 //Initialize array   
		          
		      int [] num = {1, 2, 3, 4, 2, 7, 8, 8, 3};   
		        
		        System.out.println("Duplicate elements in given array: ");  
		        //Searches for duplicate element  
		        for(int i = 0; i < num.length; i++) {  
		            for(int j = i + 1; j < num.length; j++) {  
		                if(num[i] == num[j])  
		                    System.out.println(num[j]);  
		            }  
		        }  
		 }
		 
		@Test
		public void getDup(){
			int[] num1 = { 1, 2, 3, 2, 3};
			 for (int i= 0; i<num1.length; i++) {
				 for (int j =i+1; j< num1.length; j++) {
					 if ( num1[i]== num1[j])
						 System.out.println(num1[j]);
				 }
			 }
			
		}

}


		
	
