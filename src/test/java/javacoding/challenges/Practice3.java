package javacoding.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class Practice3 {

	
	List<Integer> list1 = new ArrayList<>();
	
	//@Test
	public void getCollection() {
		
		list1.add(5);
		list1.add(6);
		System.out.println(" Values are : " + list1);
		System.out.println("Count : " + list1.size());
	
	int max= Collections.max(list1);
	System.out.println(max);
	
	int min= Collections.min(list1);
	System.out.println(min);
	
	}
	//@Test
	void getForEach() {
		List<Integer> list = Arrays.asList(100, 200, 300);
		
		String a = "D";
				a= "s";
				
				System.out.println(a);
	}
	
	

	
	
}
